package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.saveFile;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.language.Language;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;

public class SaveFile implements IExecute {
	List<Document> listDocument;
	public SaveFile(List<Document> listDocument) {
		this.listDocument = listDocument;
	}	

	public void execute() {
		String fileName = "DocumentList.dat";
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(listDocument);
			Language.showMessage("saveSuccessful");
		} catch (Exception ex) {
			Language.showMessage("saveNoSuccessful");
			System.out.println(ex.getStackTrace());
		}
		return;
	}

}
