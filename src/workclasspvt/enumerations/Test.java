package workclasspvt.enumerations;

public class Test {

	private static final String MONDAY = "monday";
	private static final String TUESDAY = "tuesday";
	private static final String WEDNESDAY = "wednesday";

	public static void main(String[] args) {
		String monday1 = Test.MONDAY;
		
		DayOfWeek monday2 = DayOfWeek.monday;
		DayOfWeekObject monday3 =  DayOfWeekObject.MONDAY;
		
		System.out.println(monday2.name());
		System.out.println(monday2.ordinal());

		DayOfWeek byIndex = DayOfWeek.values()[0];
		System.out.println(byIndex);

		DayOfWeek byName = DayOfWeek.valueOf("monday");
		System.out.println(byName);
	}

}
