package calculateAge;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateOfBirth {
	

	public static void main(String[] args) {
		LocalDate  birthDate =LocalDate.of(1998,10 , 22);
		LocalDate l=LocalDate.now();
		long years=ChronoUnit.YEARS.between(birthDate, l);
		System.out.println("age in years:"+years);
		Period p =Period.between(birthDate, l);
		System.out.println("years :"+p.getYears() + " months :" +p.getMonths()+ " days : "+ p.getDays());
	

	}

}