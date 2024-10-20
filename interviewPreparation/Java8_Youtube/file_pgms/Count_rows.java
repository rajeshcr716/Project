package file_pgms;

 

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
  
public class Count_rows{
    public static void main(String ar[]) throws IOException
    {
    	
    	Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		  
    	
    	int rowCount = (int)rows1
    			  
                .filter(x -> x.length() >= 0)
    			.count();
    		System.out.println(rowCount + " rows.");
    		
    		
     
	 
	 
 
		
		 
}
}
 