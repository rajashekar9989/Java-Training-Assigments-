package ten_December;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamEx {

	public static void main(String[] args) {

		// File fileref = new File("c:\\Users\\rajas\\perticipets.txt");

		try {
			FileInputStream inputStream = new FileInputStream("c:\\Users\\rajas\\perticipets.txt");// or (fileref)
			BufferedInputStream bufferInput = new BufferedInputStream(inputStream);
			int data;
			while ((data = bufferInput.read()) != -1) {
				System.out.print((char) data);

			}
		} catch (IOException ex) {

			// System.out.println(ex.getCause());//it actually returns what particular
			// problem is occured.
			System.err.println(ex.getMessage());
		}

	}

}
