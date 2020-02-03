package com.class04;

public class NestedIfMore {
	public static void main(String[] args) {

		// check age, if age is less than 16---you are too young to drive
		// otherwise you are eligible ,we will check,if you are older than 18 ----
		// you can get drive license, if not you can get learner permit

		int age = 16;
		if (age < 16) {

			System.out.println("You are to young to drive");

		} else {
			System.out.println("You are aligile to drive");

			if (age >= 18) {
				System.out.println("You can drive alone");

			} else {
				System.out.println("You need your parents to drive");

			}

		}
		System.out.println("***************************************");

		/*
		 * we need to check if student completed the quiz if yes-----good job,if not not
		 * good if they completetd we will check score if more than 90---you got an A IF
		 * MORE THAN 80--- YOU GOT b anything below ---you should study more
		 */

		boolean quiz = false;
		int score = 89;

		if (quiz) {
			System.out.println("Good job!!!");
			if (score >= 90) {
				System.out.println("YYou got an A");
			} else if (score > 80) {
				System.out.println("You got an B");

			} else {
				System.out.println("Not good!!!!");

			}
		} else {
			System.out.println("Not good!!!!");
		}

	}

}
