package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.loadListDocument;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import workclasspvt.class03january.tryall.zen.excel.document.Document;

public class LoadListDocument {
	public static  List<Document> getList() {
		String fileName = "DocumentList.dat";
		List<Document> listDocument = new ArrayList<Document>();
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
			listDocument = (ArrayList<Document>) ois.readObject();
			System.out.println("File load sucsessful");
		} catch (Exception ex) {
			System.out.println("File isn't create");
		} finally {
			return listDocument;
		}
	}
}
