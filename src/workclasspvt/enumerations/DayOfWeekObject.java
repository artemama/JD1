package workclasspvt.enumerations;

public class DayOfWeekObject {

	public static final DayOfWeekObject MONDAY = new DayOfWeekObject("monday", true);
	public static final DayOfWeekObject SATURDAY = new DayOfWeekObject("saturday", false);

	private String name;

	private boolean isWorkingDay;

	private DayOfWeekObject(String name, boolean isWorkingDay) {
		super();
		this.name = name;
		this.isWorkingDay = isWorkingDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWorkingDay() {
		return isWorkingDay;
	}

	public void setWorkingDay(boolean isWorkingDay) {
		this.isWorkingDay = isWorkingDay;
	}

}
