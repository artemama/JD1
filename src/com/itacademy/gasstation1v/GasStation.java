package com.itacademy.gasstation1v;

import java.util.ArrayList;
import java.util.List;

public class GasStation {

	public void makeColumns() {

		List<Columns> column = new ArrayList<Columns>();
		{
			for (int i = 0; i < 5; i++) {
				Columns[] columns = new Columns[i];
				System.out.println("Доступна колонка № " + i);
				columns.add (column);

			}
		}
	}

}
