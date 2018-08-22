package calendar;

import java.util.Scanner;

public class Prompt {
	public static void runPrompt() {
		String prompt = ("cal>");
		Scanner scanner = new Scanner(System.in);

		Calendar cal = new Calendar();
		int month = 1;
		int year = 2018;
	
		while (true) {
			System.out.println("연도를 입력하세요.");
			System.out.print(prompt);
			year = scanner.nextInt();
			System.out.println("달을 입력하세요.");
			System.out.print(prompt + year + "년");
			month = scanner.nextInt();
			System.out.println("첫째 날의 요일을 입력하세요(SUN, MON,TUE,WED,THU, FRI,SAT)");
			
			
			if (month == -1) {
				break;
			}
			if (month > 12) {
				System.out.println("달은 12월까지 있습니다.");
				continue;
			}
			cal.printCalendar(year, month);
		}
		System.out.println("Bye~");
//		int[] maxDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		System.out.println(month + "는 " + maxDay[month-1] + "까지 있습니다.");
	scanner.close();
	}

	public static void main(String[] args) {
		Prompt.runPrompt();
	}

}
