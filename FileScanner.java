package elleven_December;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {
		Scanner scan = null;
		try {
			File fileref = new File("c:\\Users\\rajas\\students_attendance.txt");
			scan = new Scanner(fileref);
			// System.out.println();
			while (scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}

		} catch (IOException ex) {
			ex.printStackTrace();

		} finally {
			if (Objects.nonNull(scan))
				scan.close();
		}

	}

}
