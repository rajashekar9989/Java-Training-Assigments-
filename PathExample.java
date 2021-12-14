package thirteen_December;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

	public static void main(String[] args) {
	Path path1 = Paths.get("c:\\Users\\rajas\\students_attendance.txt");
	
	//File fileref = new File("c:\\Users\\rajas\\students_attendance.txt");
	// if we already have file reference with to path method we can cast to that path
	Path path = ( new File("c:\\Users\\rajas\\students_attendance.txt").toPath());
	System.out.println("count "+path.getNameCount());
	System.out.println("Name :"+path.getFileName());
	System.out.println("path value at 0 index"+path.getName(1));
	System.out.println("File system :"+path.getFileSystem());
	System.out.println("path till order file "+path.resolve(path));
	System.out.println();

	}

}
