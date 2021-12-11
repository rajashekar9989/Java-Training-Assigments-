package ten_December;

import java.io.*;
import java.util.*;

public class FileHandlingExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Directory path");
		String path = sc.nextLine();
		File fileRef = new File(path);
		if (fileRef.exists()) {
			System.out.println(fileRef);
//			FileFilter filter = new FileFilter() {
//				public boolean accept(File fileRef) {
//					return fileRef.getName().endsWith("java");
//				}
//			};
			File[] files = fileRef.listFiles(file -> {
				return file.getName().endsWith("java");
			});
			System.out.println("Files are:");
// for(File l1 : files)
// {
// System.out.println(Arrays.asList(l1));
// }
//
			for (int i = 0; i < files.length; i++) {
// System.out.println(files[i].getName());
				System.out.println(Arrays.asList(files[i].getName() + ","));
			}
		} else {
			System.out.println("please check the path you give");
		}
	}
}
