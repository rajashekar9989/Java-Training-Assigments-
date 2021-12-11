package ten_December;

import java.io.File;
import java.io.IOException;
/*
Stream is sequence of data 
we can read and write the data
we can read and write objects also
only a represention of input and output
stream can be source and destination
 when we are writing data into stream into  is called  output stream
when we are reading data into stream is called input stream
example of input stream : writing from keyboard ,  reading any file 
input and output both stream can hold single character at a time 
Transferring a data into stream or read the data from the stream , it is 
equipped with buffer  memory
so this buffer memory is called buffer memory .
 2 streams are there i.e   is byte stream and character stream
*/
public class FileHandlingEx  {

	public static void main(String[] args) throws IOException {
//		File fileref = new  File("C:\\Users\\rajas\\githubexample\\Session1\\Hello.java");
//		System.out.println("is fille is present on given path :"+fileref.exists());
//		System.out.println("is a given path is contains  file :"+fileref.isFile());
//		System.out.println("absoulte given  path  :"+fileref.getAbsolutePath());
//		System.out.println("is file is present on given path :"+fileref.getPath());
//		System.out.println(" canconical  path :"+fileref.getCanonicalPath());
//		System.out.println("is file is  read :"+fileref.canRead());
//		System.out.println("is file is  write  :"+fileref.canWrite());
//		System.out.println("file Name :"+fileref.getName());
//		System.out.println("file parent directory :"+fileref.getParent());
		
		File fileref = new File("c:\\Users\\rajas\\perticipets.txt");
				System.out.println(" file is present in given path :"+fileref.exists());
				
				if(fileref.exists()) {
					System.out.println("the file is present already");
					System.out.println("the total space of the file  : "+fileref.getTotalSpace());// the space represent in the form of bits.
					System.out.println("the free space of the file : "+fileref.getFreeSpace());
					System.out.println("the  useable space of the file : "+fileref.getUsableSpace());
				}
				else {
					fileref.createNewFile();
				}

	}

}
