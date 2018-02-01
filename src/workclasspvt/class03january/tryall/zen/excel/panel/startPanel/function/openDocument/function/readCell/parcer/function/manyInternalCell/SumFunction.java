package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell;

import java.util.List;

import workclasspvt.class03january.tryall.zen.excel.document.Cell;
import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.AbstractFunction;

public class SumFunction extends ManyInternalCell {
	
	public static String getReadValue(String formula, Document currentVerisonDocument) {

		
		List<Double> listReadValue = getListReadValue(currentVerisonDocument, formula);
		
		Double sum = 0d;
		
		for(Double val: listReadValue) {
			sum+=val;
		}
				
		return sum.toString();
	}

}
