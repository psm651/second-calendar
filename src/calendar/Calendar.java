package calendar;


public class Calendar {

	public void printCalendar(int year, int month) {
		MaxDaysOfMonth mdm = new MaxDaysOfMonth();

		System.out.printf("    <<%4d년%3d월>>\n",year,month);
		System.out.println("SUN  MON TUE WED THU FIR SAT");
		System.out.println("---------------------------");
		int maxDay = mdm.getMaxDays(year, month);
		for(int i=1; i <=maxDay; i++) {
			System.out.printf("%4d",i);
			if(i%7 == 0)
				System.out.println();
		}
		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");

		// 숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램

		// -스스로만들어 본 것
		/*
		 * Scanner scanner = new Scanner(System.in); int dal = scanner.nextInt(); if
		 * (dal > 12) { System.out.println("1~12월까지만 입력 가능합니다. 멍청아"); } else if (dal <
		 * 1) { System.out.println("1~12월까지만 입력 가능합니다. 멍청아"); } else { switch (dal) {
		 * case 1: System.out.println("31일이 끝 입니다"); break; case 2:
		 * System.out.println("28일이 끝 입니다"); break; case 3:
		 * System.out.println("31일이 끝 입니다"); break; case 4:
		 * System.out.println("30일이 끝 입니다"); break; case 5:
		 * System.out.println("31일이 끝 입니다"); break; case 6:
		 * System.out.println("30일이 끝 입니다"); break; case 7:
		 * System.out.println("31일이 끝 입니다"); break; case 8:
		 * System.out.println("31일이 끝 입니다"); break; case 9:
		 * System.out.println("30일이 끝 입니다"); break; case 10:
		 * System.out.println("31일이 끝 입니다"); break; case 11:
		 * System.out.println("30일이 끝 입니다"); break; case 12:
		 * System.out.println("31일이 끝 입니다"); break; } }
		 */

	}
}
