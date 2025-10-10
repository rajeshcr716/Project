package collection2;
import java.util.*;
public class Hashmap {
	public static void main(String []ar)
	{
		String x= "Aradhyya";
		x=x.toUpperCase();
		char y[]=x.toCharArray();
		
		int size=y.length;
		
	Map<Character,Integer> map= new HashMap();	
	
	int i=0;
	while(i!=size)
	{
		 if( map.containsKey(y[i])==false) 
		{
			map.put(y[i], 1);
		}
		 else 
		 {
			 int oldval= map.get(y[i]);
			 int newVal = oldval+1;
			 
			 map.put(y[i],newVal);
		 }
		 
		 ++i;
		 
		 
		 
	}
		//Set<Map.Entry<Character,Integer>> hmap = map.entrySet();
		
	for(Map.Entry<Character,Integer> m:map.entrySet())
	{
		//System.out.println( "key:  "+m.getKey()+ "  Value: "+m.getValue());
		
		if(m.getValue()>1)
		{
			System.out.println("Duplicate key: "+ m.getKey());
		}
	}
		
	}
}