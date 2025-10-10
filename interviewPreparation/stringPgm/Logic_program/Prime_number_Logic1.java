package Logic_program;

public class Prime_number_Logic1 {
	public static void main(String[] args) {

		int number, count;

		// Loop through numbers 1 to 100
		for (number = 1; number <= 100; number++) {
			count = 0;

			// Check divisibility from 2 to number/2
			for (int j = 2; j < number; j++) {
				if (number % j == 0 ) {
					count++;
					break;  // Not a prime, exit inner loop
				}
			}

			// Prime number has count == 0 and number != 1
			if (count == 0 && number != 1) {
				System.out.println(number);
			}
		}
	}
}
/*

 for (int j = 2; j <= number; j++) {
				if (number % j == 0 && j!= number) {
					count++;
					break;  // Not a prime, exit inner loop
				}
			}


--->
here I added the condition inside 'if' j!=number that means.. when iteration of 'j' comes to the actual it will
dividy by itself any way then our logic not work. so I added the condtion so it is very is easy to understand.

--> more simplied part
 for (int j = 2; j < number; j++) {
				if (number % j == 0  ) {
					count++;
					break;  // Not a prime, exit inner loop
				}
			}




2nd program I written the program there we added another condition in the for loop only. effiency is more but little bit
confusing.
for (int j = 2; j <= number/2; j++) {
				if (number % j == 0 ) {
					count++;
					break;  // Not a prime, exit inner loop
				}
			}
--->here 'number/2' that means already divide the number and iteration in for loop reduces. Normally all the number
is divisible by 2 and 3. So for example 99 value. We no need to iterate from 2 to 99.  Value 99 is divisible by 3 only.
Also we decide no is not divisible then it not dvisible by 2 and 3 also.

 */