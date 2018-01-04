package workClassPVTnotForCheck.class03january.serializable;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.util.Date;

public class SerializationSample2 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {

		serializeSimpleObjects();

		deSerializeSimpleObjects();

	}

	private static void serializeSimpleObjects() throws IOException {

		try (FileOutputStream fos = new FileOutputStream("car.tmp");

				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Car car = new Car();
			car.setBrand("VW");
			car.setYear(2000);
			System.out.println("before serialization" + car);
			oos.writeObject(car);

		}
	}

	private static void deSerializeSimpleObjects()

			throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("t.tmp");

		ObjectInputStream ois = new ObjectInputStream(fis);

		int i = ois.readInt();

		String today = (String) ois.readObject();

		Date date = (Date) ois.readObject();

		ois.close();

	}

}