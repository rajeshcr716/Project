package file_pgms;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class SummaryStatics {
	public static void main(String[] args) {
		
		
		
IntSummaryStatistics stat = 
                          IntStream.of(7,10,34,8,16)
                          .summaryStatistics();


System.out.println("Statistics :"+stat+'\n');
		
		
		
	}

}
