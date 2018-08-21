package calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
//일반적인 println이용하여 달력모양 출력

//      System.out.println(" 일 월 화 수 목 금 토 ");
//		System.out.println("--------------------");
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
		String prompt = ("cal>");
		Scanner scanner = new Scanner(System.in);
		MaxDaysOfMonth mdm = new MaxDaysOfMonth();
		int month = 0;
		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(prompt);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				System.out.println("달은 12월까지 있습니다.");
				continue;
			}
			System.out.println(mdm.getMaxDays(month));
		}
		System.out.println("Bye~");
//		int[] maxDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
//		System.out.println(month + "는 " + maxDay[month-1] + "까지 있습니다.");

	}

}
