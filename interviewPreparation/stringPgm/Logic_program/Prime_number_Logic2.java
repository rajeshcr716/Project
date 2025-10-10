package Logic_program;

public class Prime_number_Logic2 {
	public static void main(String[] args) {

		int number, count;

		// Loop through numbers 1 to 100
		for (number = 1; number <= 100; number++) {
			count = 0;

			// Check divisibility from 2 to number/2
			for (int j = 2; j <= number/2; j++) {
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

for (int j = 2; j <= number / 2; j++) {

👉 This loop tries to find if the current number is divisible by any smaller number (j).

  first section we have to try with 2 alaways. after we increment the index value becuase
  21 is not divisible by 2. It is divisible by 3 only.
  if the number is divisible by 2 and 3 then it is considered as non-prime number.(most of the cases).

		j starts from 2, because:

		Every number is divisible by 1, so checking with 1 is useless.

		We check till number / 2, because:

		No number can have a factor greater than half of itself (except the number itself).

		Example: For 10, possible divisors are up to 5 (10/2).*/

