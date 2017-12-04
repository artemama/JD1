package packtestNotCheck;

public class HomeArrays {

    public static void main(String[] args) {
	int myFirstArray[];
	int[] mySecondArray;
	myFirstArray = new int[15];
	int[] myArray = new int[10];
	myFirstArray[1] = 10;
	myFirstArray[2] = 5;
	myFirstArray[3] = 12;

	for (int i = 0; i < myFirstArray.length; i++) {
	    int j = myFirstArray[i];

	    int[] numberArray = new int[10];
	    for (int k = 0; k < numberArray.length; k++) {
		numberArray[k] = k;

	    }
	    for (int k = 0; k < 10; k++) {
		System.out.println((k + 1) + "-й элемент массива = " + numberArray[k]);
	    }
	}

    }

}
