package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell;

import java.util.List;

import workclasspvt.class03january.tryall.zen.excel.document.Document;

public class AVGFunction extends ManyInternalCell {
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);

		double sum = 0;
		double count = listReadValue.size();

		for (Double val : listReadValue) {
			sum += val;
		}
		// int �� ������������ � Double, ������ � double

		Double avg = sum / count;
		return avg.toString();
	}
}
