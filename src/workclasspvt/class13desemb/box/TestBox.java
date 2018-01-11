package workclasspvt.class13desemb.box;

public class TestBox {

	public static void main(String[] args) {

		Box<String, Integer> myBox = new Box<String, Integer>();
		myBox.setItem1("Test");
		myBox.getItem1();
		myBox.setItem2("Test");
		myBox.getItem2();

		/*
		 * Box box = new Box(); box.setItem("Test");
		 * 
		 * String item = box.getItem();
		 */
	}

}
