package elleven_December;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file = new File("c:\\Users\\rajas\\Order.sr.txt");
		if (!(file.exists())) {
			System.out.println("given path does not exist ,cannot read the data");
			return;
		}
		FileInputStream fileinput = new FileInputStream(file);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileinput);
		Order order1 = (Order) objectInputStream.readObject();
		objectInputStream.close();
		fileinput.close();
		System.out.println(order1);

	}

}
