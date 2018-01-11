package workclasspvt.class08january;

import com.sun.corba.se.spi.activation.InitialNameServicePackage.NameAlreadyBound;

public class TestThread {

	private static final String NameAlreadyBound = null;

	public static void main(String[] args) {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread);
	}

}
