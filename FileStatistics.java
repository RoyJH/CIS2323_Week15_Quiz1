import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class FileStatistics{
	public static void main(String[] args) throws Exception, ParseException {
		String fname;
        Scanner scan = new Scanner(System.in);
		System.out.print("Enter File Name to Open (with extension like file.txt) : ");
        fname = scan.nextLine();
		
		SimpleExample(fname);
	}
	
	public static void SimpleExample(String fname)	{
		File file = new File(fname);
		
		System.out.println("Name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Size: " + file.length());
		System.out.println("Last modified: " + new Date(file.lastModified()));
	}
	
 	
}