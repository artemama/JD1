package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell;

import java.util.List;

import workclasspvt.class03january.tryall.zen.excel.document.Document;

public class MultiplyFunction extends TwoInternalCell{
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);

		Double multiply = listReadValue.get(0)*listReadValue.get(1);
		return multiply.toString();
	}
}
