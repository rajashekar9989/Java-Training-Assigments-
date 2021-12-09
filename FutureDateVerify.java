package nineDecmber;

import java.time.Clock;
import java.time.LocalDate;

public class FutureDateVerify {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now(Clock.systemUTC());
		LocalDate userInputDate = LocalDate.of(2021, 12, 10);

		if (userInputDate.isAfter(localDate)) {
			System.out.println(userInputDate + " THE INPUT DATE  IS IN FUTURE");
		} else if (userInputDate.equals(userInputDate)) {
			System.out.println(userInputDate + "  THE INPUT DATE  IS IN PRESENT DATE");

		} else {
			System.out.println(userInputDate + " " + " THE INPUT DATE IS   IN  PAST");
		}

	}

}
