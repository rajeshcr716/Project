package file_pgms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StroeIn_Map {
	public static void main(String ar[]) throws IOException
    {
    	
    	Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		
    	
    	Map<String,Integer> map = new HashMap();
    	
    	
    	map = 
    		 rows1
    		 .map(x->x.split(",")) //We need to split because only one column in text.
    		 .filter(x->x.length==3)//lenthth given single line found then ..error came key,value needed.
    		 .collect(Collectors.toMap(x->x[0], x->Integer.parseInt(x[1])));
    	
    	
    	 System.out.println(map); //printing both key and value.
    			 
    	 for(String key : map.keySet())
    	 {
    		 System.out.println("key:  "+ "  "+map.get(key)); //printing only key..
    		  
    	 }
     
	 
	 
 
		
		 
}
	
	
	
	

}
