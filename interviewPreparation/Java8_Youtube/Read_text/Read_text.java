package Read_text;
import java.io.*;
public class Read_text {
public static void main(String[] args) throws IOException {
	
	
	FileReader r = new FileReader("F:\\ReadFile.txt");
	
	
	int i;
	while((i=r.read())!=-1)
	{
		System.out.print((char)i);
	}
	
	
}
}
