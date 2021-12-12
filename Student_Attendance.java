package elleven_December;

/*
 1.write a program to read data from Attendance list and print the below result;
 present 3;
 leave 1;
 1.need to read the data from the file.
 2.data is in string format -how have to tokenize it is in student name and attendance list status
 3.how many students present or leave;
 
 */
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

public class StudentAttendance {

	public static void main(String[] args) {

		try {
			// refer the file
			File fileref = new File("C:\\Users\\rajas\\Attendance_List.txt");
			Scanner scan = new Scanner(fileref);
			// 2.read the data
			List<String> atttendcestatus = new ArrayList<>();
			while (scan.hasNextLine()) {

				// read the students data line by line
				String data = scan.nextLine();
				String[] student = data.split(" ,");
				atttendcestatus.add(student[1]);

				//System.out.println(Arrays.toString(student));

			}
//			System.out.println(atttendcestatus);
//	long presentcount = atttendcestatus.stream().filter(data -> data.equalsIgnoreCase("present")).count();
//
//		long leavecount = atttendcestatus.stream().filter(data -> data.equalsIgnoreCase("leave")).count();
			
			AtomicLong presentcount = new AtomicLong();
			AtomicLong leavecount = new AtomicLong();
			atttendcestatus.forEach(data ->{
	if(data.equalsIgnoreCase("present")) {
		System.out.println(data);
		presentcount.getAndIncrement();
	}else if (data.equalsIgnoreCase("leave")){
		System.out.println(data);
		leavecount.getAndIncrement();
		
	}
			
			}

			
			
		} catch (IOException ex) {
			ex.printStackTrace();

		

	}
	}
}




