package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer;

import java.util.regex.Pattern;

import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell.AVGFunction;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell.MAXFunction;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell.MinFunction;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.manyInternalCell.SumFunction;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell.MinusFunction;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell.MultiplyFunction;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell.PlusFunction;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.twoInternalCell.ShareFunction;
public class Parcer {
	public static String getReadValue(String formula,Document currentDocument) {

		Pattern patternMIN = Pattern.compile("=MIN[(][A-Z][0-9]{1,3}:[A-Z][0-9]{1,3}[)]");
		Pattern patternMAX = Pattern.compile("=MAX[(][A-Z][0-9]{1,3}:[A-Z][0-9]{1,3}[)]");
		Pattern patternSUM = Pattern.compile("=SUM[(][A-Z][0-9]{1,3}:[A-Z][0-9]{1,3}[)]");
		Pattern patternAVG = Pattern.compile("=AVG[(][A-Z][0-9]{1,3}:[A-Z][0-9]{1,3}[)]");

		Pattern patternPlus = Pattern.compile("=[A-Z][0-9]{1,3}[+][A-Z][0-9]{1,3}");
		Pattern patternMinus = Pattern.compile("=[A-Z][0-9]{1,3}-[A-Z][0-9]{1,3}");
		Pattern patternShare = Pattern.compile("=[A-Z][0-9]{1,3}/[A-Z][0-9]{1,3}");
		Pattern patternMultiply = Pattern.compile("=[A-Z][0-9]{1,3}[*][A-Z][0-9]{1,3}");
		Pattern patternLink = Pattern.compile("[A-Z][0-9]{1,3}");

		if (patternMIN.matcher(formula).matches()) {
			return MinFunction.getReadValue(formula, currentDocument);
		} else if (patternMAX.matcher(formula).matches()) {
			return MAXFunction.getReadValue(formula, currentDocument);
		} else if (patternSUM.matcher(formula).find()) {
			return SumFunction.getReadValue(formula, currentDocument);
		} else if (patternAVG.matcher(formula).matches()) {
			return AVGFunction.getReadValue(formula, currentDocument);
		} else if (patternPlus.matcher(formula).matches()) {
			return PlusFunction.getReadValue(formula, currentDocument);
		} else if (patternMinus.matcher(formula).matches()) {
			return MinusFunction.getReadValue(formula, currentDocument);
		} else if (patternShare.matcher(formula).matches()) {
			return ShareFunction.getReadValue(formula, currentDocument);
		} else if (patternMultiply.matcher(formula).matches()) {
			return MultiplyFunction.getReadValue(formula, currentDocument);
		} else if (patternLink.matcher(formula).matches()) {
			return ParceLink.getReadValue(formula, currentDocument);
		} 
		return formula;
	}

}
