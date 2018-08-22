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

			if (month > 12) {
				System.out.println("달은 12월까지 있습니다.");
				continue;
			}
			cal.printCalendar(year, month);
		}
		System.out.println("Bye~");
		scanner.close();
	}

	public static void main(String[] args) {
		Prompt.runPrompt();
	}

}
