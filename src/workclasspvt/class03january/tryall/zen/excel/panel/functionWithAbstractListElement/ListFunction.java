package workclasspvt.class03january.tryall.zen.excel.panel.functionWithAbstractListElement;

import java.util.List;
import java.util.Scanner;

import workclasspvt.class03january.tryall.zen.excel.document.AbstractListElement;
import workclasspvt.class03january.tryall.zen.excel.document.Document;

public class ListFunction<T> {

	public static boolean isInList(List listAbstractElement, String name) {
		boolean isInList = false;

		for (Object el : listAbstractElement) {
			if (((AbstractListElement) el).getName().equals(name)) {
				isInList = true;
				break;
			}
		}
		return isInList;
	}

	
	
	public T foundInList(List listAbstractElement, String name) {
		for (Object el : listAbstractElement) {
			if (((AbstractListElement) el).getName().equals(name)) {
				T foundElement = (T) el;
				return foundElement;
			}
		}
		return null;
	}
}
