package Logic_program;

public class Prime_number {
	public static void main(String[] args) {

		  int i,number,count;
		  number = 3;

		  for (number = 1; number <= 100; number++) {
		   count = 0;
		 //  System.err.println("i: "+number);
		   for (int j = 2; j <= number / 2; j++) {
			//   System.err.println("j: "+j);
		    if (number % j == 0) {
		     count++;
		     break;
		    }
		   }

		   if (count == 0 && number!=1) {
		    System.out.println(number);
		   }

		  }
		 }
}
