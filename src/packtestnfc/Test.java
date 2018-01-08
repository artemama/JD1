package packtestnfc;

public class Test {

    public static void main(String[] args) {

	Man man1 = new Man();
	man1.setHairlength(10);

	Man man2 = new Man();
	man2.setHairlength(0);

	System.out.println("man 1. length:" + man1.getHairlength());
	System.out.println("man 2. length:" + man2.getHairlength());
    }

}
