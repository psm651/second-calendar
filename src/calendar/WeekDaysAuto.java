package calendar;

public class WeekDaysAuto {
	public int lastDay(int year, int month, int day) {
		MaxDaysOfMonth mom = new MaxDaysOfMonth();
		int startyear = 1970;
		final int STANDARD_WEEKDAY = 3;
		int count = 0;
		for (int i = startyear; i < year; i++) {
			int delta = mom.isLeepYear(i) ? 366 : 365;
			count += delta;
		}

		for (int i = 1; i < month; i++) {
			int delta = mom.getMaxDays(year, i);
			count += delta;

		}
		count += day ;
		int weekday = (count + STANDARD_WEEKDAY) % 7;
		return weekday;

	}

}
