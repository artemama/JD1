package workclasspvt.class29desemb;

public class Test3 {

	public static void main(String[] args) {

		try {
			method1();

			System.out.println("exception didn't accur");
			return;
		} catch (MyExeptpon e) {
			System.out.println("exception was caught:" + e.getLocalizedMessage());
		} finally {																			//����������� ������!!!
			System.out.println("finaly executed");
		}

	}

	private static void method1() throws MyExeptpon {
		System.out.println("method1 start");
		method2();
		try {
			method3();

		} catch (Exception e) {
			System.out.println("exeption was caught");
		}
		System.out.println("method1 completed");

	}

	private static void method2() throws MyExeptpon {
		System.out.println("method2 start");
		method3();
		System.out.println("method2 start");

	}

	private static void method3() throws MyExeptpon {
		System.out.println("method3 start");
		MyExeptpon myExeptpon = new MyExeptpon();

		throw myExeptpon;
		// System.out.println("method3 start");

	}

}
