package workClassPVTnotForCheck;

public class Sample {
	private int objectId;
	static {
		System.out.println("init block1 of object:");
	}

	public Sample(int i) {
		super();
		objectId = i;
		System.out.println("Consnstructor:" + i);

	}

	{
		System.out.println("init block 2 of object:" + objectId);
	}

}
