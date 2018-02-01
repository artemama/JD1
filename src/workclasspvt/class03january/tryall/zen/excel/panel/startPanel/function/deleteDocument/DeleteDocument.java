package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.deleteDocument;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.language.Language;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;

public class DeleteDocument implements IExecute {
	List<Document> listDocument;
	public DeleteDocument(List<Document> listDocument) {
		this.listDocument = listDocument;
	}
	
	public void execute() {
		Scanner in = new Scanner(System.in);
		Language.showMessage("nameDoc");
		String nameDocument = in.nextLine();

		Iterator<Document> iter = listDocument.iterator();
		while (iter.hasNext()) {
			Document doc = iter.next();
			if (doc.getName().equals(nameDocument)) {
				iter.remove();
				Language.showMessage("successfulDelete");
				return;
			}
		}
		try {
			throw new RuntimeException(Language.getLocalString("docIsn'tFound"));
		} catch (RuntimeException e) {
			e.printStackTrace();
		}

	}
	
}
