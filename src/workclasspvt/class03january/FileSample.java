package workclasspvt.class03january;

import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) throws IOException {
		File file = new File("e:\\javaJD\\"); //� ��������� ������ ������� �� �����!!!!!!!!!!!
											// ������� ����� ������� � ������� ���
		System.out.println("file exists:" + file.exists());
		
		/*if (file.exists()) {
			System.out.println("file has been created before");
		} else {
			//file.createNewFile();
			file.mkdir();
			System.out.println("file created");*/
		if (file.isDirectory()) {
			System.out.println("file has been created before");
		} else {/*
			//file.createNewFile();
			file.mkdir();
			System.out.println("file created");*/
		}

	}

}
