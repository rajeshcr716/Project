package collection2;

import java.util.*;

public class test {
public static void main(String[] args) {
	
	
	String x = "aradya";
	
	char y[] = x.toCharArray();
	
	int size = y.length;
	
	int i=0;
	Map<Character,Integer> map = new HashMap<Character, Integer>();
	while(i!=size) {
			
		if(map.containsKey(y[i])==false) 
	 {
			
			map.put(y[i], 1);
		 
	 }
		else
		{
			int oldval = map.put(y[i], 1);
			int newval = oldval+1;
			map.put(y[i], newval);
		}
		
		++i;
	
	}
	
	
	Set<Map.Entry<Character, Integer>> hmap = map.entrySet();
	
	for(Map.Entry<Character, Integer> data: hmap )
	{
		System.out.print("key: "+data.getKey()+" ");
		System.out.println("value:  "+data.getValue());
	}
	
	
}
}














