package calendar;

import java.util.Scanner;

public class Prompt {
	/**
	 * 
	 * @param str_weekday = 요일
	 * @return 0=일요일~ 6=토요일
	 */
	public static int parseDay1(String weekday) {
		if (weekday.equals("SUN"))
			return 0;
		else if (weekday.equals("MON"))
			return 1;
		else if (weekday.equals("TUE"))
			return 2;
		else if (weekday.equals("WED"))
			return 3;
		else if (weekday.equals("THU"))
			return 4;
		else if (weekday.equals("FRI"))
			return 5;
		else if (weekday.equals("SAT"))
			return 6;
		return 0;
	}

	public static void runPrompt() {
		String prompt = ("cal>");
		Scanner scanner = new Scanner(System.in);

		Calendar cal = new Calendar();
		int month = 1;
		int year = 2018;
		int weekday = 0;

		while (true) {
			System.out.println("연도를 입력하세요. (EXIT=-1)");
			System.out.print(prompt);
			year = scanner.nextInt();
			if (year == -1) {
				break;
			}
			System.out.println("달을 입력하세요.");
			System.out.print(prompt + year + "년");
			month = scanner.nextInt();
			System.out.println(prompt + year + "년" + month + "월");
			System.out.println("첫째 날의 요일을 입력하세요(SUN, MON, TUE, WED, THU, FRI, SAT)");
			String str_weekday = scanner.next();
			weekday = parseDay1(str_weekday);

			
			if (month > 12) {
				System.out.println("달은 12월까지 있습니다.");
				continue;
			}
			cal.printCalendar(year, month, weekday);
		}
		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt.runPrompt();
	}

}
