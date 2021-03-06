package calendar;

public class Calendar {

	public void printCalendar(int year, int month) {
		MaxDaysOfMonth mdm = new MaxDaysOfMonth();
		WeekDaysAuto wda = new WeekDaysAuto();

		System.out.printf("    <<%4d년%3d월>>\n", year, month);
		System.out.println(" SUN MON TUE WED THU FIR SAT");
		System.out.println("---------------------------");
		int weekday = (wda.lastDay(year, month, 1));
		for (int j = 0; j < weekday-1; j++) {
			System.out.print("     ");
		}
		int maxDay = mdm.getMaxDays(year, month);
		int count = 7 - weekday;
		int otherLine = (count < 7)? count:0 ;
		// 첫라인
		for (int i = 1; i <= count; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		// 두번째 부터 마지막라인

		for (int i = count + 1; i <= maxDay; i++) {
			System.out.printf("%4d", i);
			if (i % 7 == otherLine)
				System.out.println();
		}
		System.out.println();
	}
}
