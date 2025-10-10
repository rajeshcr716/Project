package file_pgms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Print_bandFile {
	public static void main(String[] args) throws IOException {
		
		
		//Stream type is used when we fecthing data from txt,csv... etc. 
		//file need to present in side workspace..
		
		Stream<String> rows = Files.lines(Paths.get("bands.txt"));
		
		
		 rows.filter(x->x.length()>=1).forEach(x->System.out.println(x));
		
		
		
	}

}
