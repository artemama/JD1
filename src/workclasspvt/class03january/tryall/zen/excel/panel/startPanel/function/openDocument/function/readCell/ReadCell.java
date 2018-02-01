package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell;

import workclasspvt.class03january.tryall.zen.excel.document.Cell;
import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.document.StringCell;
import workclasspvt.class03january.tryall.zen.excel.panel.IExecute;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.ElementDocumentGeter;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.GeterParamCell;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.Parcer;

public class ReadCell implements IExecute{
	Document currentDocument;
	
	public ReadCell(Document currentDocument) {
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

		String readValue = getReadValueInDocument(currentDocument, valueStringCell, valueRowCell);
		System.out.println("Read value is " + readValue);
	}

	public static String getReadValueInDocument(Document currentDocument, String valueStringCell, String valueRowCell) {
		StringCell stringCell = ElementDocumentGeter.getStringCellInDocument(currentDocument, valueStringCell);
		return getReadValueInStringCell(currentDocument, stringCell, valueRowCell);
	}

	public static String getReadValueInStringCell(Document currentDocument, StringCell stringCell,
			String valueRowCell) {
		Cell cell = ElementDocumentGeter.getCellInStringCell(stringCell, valueRowCell);

		return Parcer.getReadValue(cell.getFormula(), currentDocument);
	}

}