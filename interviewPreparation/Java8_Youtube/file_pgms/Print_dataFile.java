package file_pgms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import java.util.function.*;

  
public class Print_dataFile{
    public static void main(String ar[]) throws IOException
    {
    	
    Stream<String> rows1 =  Files.lines(Paths.get("data.txt"));
     
     rows1.filter(x->x.length()>=1).forEach(x->System.out.println(x));
      
	 
    
    		  
    		 
    	 
     
 
		 
 
	 
	 
 
		
		 
}
}