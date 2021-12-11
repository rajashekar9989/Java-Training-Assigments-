package ten_December;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamEx {

	public static void main(String[] args) throws IOException {

		File fileref = new File("c:\\Users\\rajas\\students_attendance.txt");

		if (!fileref.exists()) {
			fileref.createNewFile();
			FileOutputStream outputstream = new FileOutputStream(fileref, true);
			BufferedOutputStream bufferedStream1 = new BufferedOutputStream(outputstream);
			String data[][] = new String[2][2];
			data[0][0] = "raj  \t";
			data[0][1] = "leave \n";
			data[1][0] = "anu  \t";
			data[1][1] = "present\n";
			for (String element[] : data) {

				for (String ele : element) {

					// outputstream.write(ele.getBytes(StandardCharsets.UTF_8));
					bufferedStream1.write(ele.getBytes(StandardCharsets.UTF_8));
				}

			}
		}
		// outputstream1.flush();

		System.out.println("the file is created");

	}
}
