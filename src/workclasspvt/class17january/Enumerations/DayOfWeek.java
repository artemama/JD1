package workclasspvt.class17january.Enumerations;

public enum DayOfWeek {

	monday, tuesday, wednesday, thursday, friday, saturday(false), sunday(false);

	private boolean isWorkingDay;

	DayOfWeek() {
		this(true);
	}

	DayOfWeek(boolean isWorkingDay) {
		this.isWorkingDay = isWorkingDay;
	}

	public boolean isWorkingDay() {
		return isWorkingDay;
	}
	
	

}
