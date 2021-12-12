package elleven_December;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {

		try {

			File fileref = new File("c:\\Users\\rajas\\students_attendance.txt");
			FileReader reader = new FileReader(fileref);
			BufferedReader bufferread = new BufferedReader(reader);
			char data[] = new char[100];
//			while(reader.read(data)!=-1) {
//				System.out.println(data);
//			}
//			reader.read(data,  0, data.length);
//		System.out.println(data);

			String filedata = null;
			while ((filedata = bufferread.readLine()) != null)
				;

			{
				System.out.println("---------------");
				System.out.println(filedata);
			}

		} catch (IOException ex) {

			ex.getStackTrace();
		}

	}

}
