package calendar;

public class MaxDaysOfMonth {
	static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDays(int month) {
		return MAX_DAYS[month - 1];
	}
}
