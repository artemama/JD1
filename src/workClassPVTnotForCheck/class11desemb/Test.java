package workClassPVTnotForCheck.class11desemb;

public class Test {

	public static void main(String[] args) {
		IFunction action1 = new IFunction() {

			@Override
			public void doAction() {
				System.out.println("action1");

			}

			@Override
			public void doOtherAction() {
				// TODO Auto-generated method stub
				
			}
		};
		IFunction action2 = new IFunction() {

			@Override
			public void doAction() {
				System.out.println("action2");

			}

			@Override
			public void doOtherAction() {
				// TODO Auto-generated method stub
				
			}
		};

		execute(action1);
		execute(action2);

	}

	private static void execute(IFunction actionHolder) {
		actionHolder.doAction();
	}

}
