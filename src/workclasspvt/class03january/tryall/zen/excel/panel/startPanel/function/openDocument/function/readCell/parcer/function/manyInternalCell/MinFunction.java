package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell;

import java.util.List;

import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.AbstractFunction;

public class MinFunction extends ManyInternalCell{
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		
		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);
		
		Double min = listReadValue.get(0);
		
		for(Double val: listReadValue) {
			if(min > val) {
				min = val;
			}
		}
				
		return min.toString();
	}
}
