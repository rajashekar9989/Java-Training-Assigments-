package elleven_December;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Objects;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		// initialisted the object to be serialized
		Order order = new Order(1, "T-shirt", 450.50);
		File file = new File("c:\\Users\\rajas\\Order.sr.txt");
		FileOutputStream fileoutput = null;
		ObjectOutputStream objectstream = null;

		if (file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		try {
			fileoutput = new FileOutputStream(file);
			// to store object into file / network stream
			objectstream = new ObjectOutputStream(fileoutput);
			// write object is used to serialized object
			objectstream.writeObject(order);
			System.out.println("object write into file");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (Objects.nonNull(objectstream))
				objectstream.close();

			if (Objects.nonNull(fileoutput))
				fileoutput.close();

		}

	}

}
