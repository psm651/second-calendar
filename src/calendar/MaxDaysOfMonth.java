package calendar;

public class MaxDaysOfMonth {
	static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static final int[] LEEP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeepYear(int year) {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
			return true;
		else
			return false;
	}

	public int getMaxDays(int year, int month) {
		if (isLeepYear(year)) {
			return LEEP_MAX_DAYS[month-1];
		}else {
		return MAX_DAYS[month - 1];
		}
	}


	}
