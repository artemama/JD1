package workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import workclasspvt.class03january.tryall.zen.excel.document.Document;
import workclasspvt.class03january.tryall.zen.excel.document.StringCell;
import workclasspvt.class03january.tryall.zen.excel.document.propertiesDocument.SupportParamRowCell;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.ReadCell;
import workclasspvt.class03january.tryall.zen.excel.panel.startPanel.function.openDocument.function.readCell.parcer.function.AbstractFunction;

public class ParceLink {
	public static String getReadValue(String formula, Document currentDocument) {
		Pattern pattern = Pattern.compile("[A-Z][0-9]{1,3}");
		Matcher matcher1 = pattern.matcher(formula);
		matcher1.find();
		String valueStringCell = matcher1.group().replaceAll("[A-Z]", "");

		Matcher matcher2 = pattern.matcher(formula);
		matcher2.find();
		String valueRowCell = matcher2.group().replaceAll("[0-9]{1,3}", "");

		return ReadCell.getReadValueInDocument(currentDocument, valueStringCell, valueRowCell);
	}

}
