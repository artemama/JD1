package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.editCell;

import java.util.Scanner;

import workclasspvt.class03january.tryall.zen.excel.document.Cell;
import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.language.Language;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.ElementDocumentGeter;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.GeterParamCell;

public class EditCell implements IExecute {
	Document currentDocument;

	public EditCell(Document currentDocument) {
		this.currentDocument = currentDocument;
	}

	public void execute() {
		String valueStringCell;
		String valueRowCell;

		try {
			valueRowCell = GeterParamCell.getValueRowCell();
			valueStringCell = GeterParamCell.getValueStringCell();
		} catch (RuntimeException e) {
			e.printStackTrace();
			return;
		}

		Cell foundCell = ElementDocumentGeter.getCellInDocument(currentDocument, valueStringCell, valueRowCell);

		System.out.println(Language.getLocalString("currenFormula") + foundCell.getFormula());
		Language.showMessage("newFormula");
		
		Scanner in = new Scanner(System.in);
		foundCell.setFormula(in.nextLine());

	}
}
