package file_pgms;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;
 

public class PrintWith_index {
	public static void main(String[] args) throws IOException {
		
		Stream<String> rows = Files.lines(Paths.get("data.txt"));
		
		
		
		rows
		.map(x->x.split(","))
		.filter(x->x.length==3) // if length is less.. then errro came in index..like x[0],x[1]...etc
		.forEach(x->System.out.println(x[0]+"  "+x[1]+"  "+x[2]));
		
		
		
		
		
	}

}
