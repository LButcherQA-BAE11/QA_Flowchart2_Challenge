package com.qa.flowchart2Challenge;

public class flowchart2Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A = 100;

		for (int i = 1; i <= 100; i++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			A++;
		}

		printNumsTenTimes();
		printNums();

	}

	public static void printNumsTenTimes() {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.println(i);
			}
		}

	}

	public static void printNums() {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.println(i);
			}
		}

	}

}
