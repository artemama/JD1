package es4f;

import java.awt.event.ItemEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// Источник 	http://j4web.ru/java-xml/vnesenie-izmenenij-v-xml-fajl-sredstvami-dom-xml.html

public class Worker {

	private static final String FILENAME = "e:\\Dropbox\\My Files\\_Java\\ES4F\\invoice-590683035-2018-0000000083.xml";
	private static final String UPDATRFILENAME = "e:\\Dropbox\\My Files\\_Java\\ES4F\\invoice-590683035-2018-0000000001.xml";

	public static void main(String[] args) {
		try {
			// Строим объектную модель исходного XML файла
			final String filepath = FILENAME;

			final File xmlFile = new File(filepath);
			DocumentBuilder db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = db.parse(xmlFile);
			doc.normalize();

			// Меняем данные
			NodeList general = doc.getElementsByTagName("general");
			Element numb = null;
			Node number = null;

			for (int i = 0; i < general.getLength(); i++) {
				numb = (Element) general.item(i);

				number = numb.getElementsByTagName("number").item(0).getFirstChild(); 			// Номер документа
				number.setNodeValue("590683035-2018-0000000001");

				number = numb.getElementsByTagName("dateTransaction").item(0).getFirstChild(); 	// дата документа
				number.setNodeValue("2018-01-01");
			}

			NodeList document = doc.getElementsByTagName("document");
			Element deliv = null;

			for (int i = 0; i < document.getLength(); i++) {
				deliv = (Element) document.item(i);

				number = deliv.getElementsByTagName("number").item(0).getFirstChild(); // Номер фактуры
				number.setNodeValue("590683035");

				number = deliv.getElementsByTagName("date").item(0).getFirstChild(); // дата фактуры
				number.setNodeValue("2018-01-01");
			}

			NodeList rosterItem = doc.getElementsByTagName("rosterItem");
			Element costVat = null;

			for (int i = 0; i < rosterItem.getLength(); i++) {
				costVat = (Element) rosterItem.item(i);

				number = costVat.getElementsByTagName("costVat").item(0).getFirstChild(); // обнуляем ндс в товарах
				number.setNodeValue("0.00");

			}
			// обнуляем итоговый ндс
			Node roster = doc.getElementsByTagName("roster").item(0);
			NamedNodeMap attributes = roster.getAttributes();
			Node totalCostVat = attributes.getNamedItem("totalCostVat");
			totalCostVat.setTextContent("0.00");
			
			

			doc.getDocumentElement().normalize();
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(UPDATRFILENAME));
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.transform(source, result);
			System.out.println("XML успешно изменен!");

		}

		catch (SAXException | IOException | ParserConfigurationException | TransformerConfigurationException ex) {
			Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
		} catch (TransformerException ex) {
			Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
