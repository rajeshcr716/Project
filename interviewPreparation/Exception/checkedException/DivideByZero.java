package checkedException;

public class DivideByZero {
public static void main(String[] args) {
	try {
        int result = 10 / 0; // This will cause ArithmeticException
        System.out.println(result);
    } catch (ArithmeticException e) {
        System.out.println("Error: Division by zero is not allowed.");
    }
    System.out.println("Program continues...");
}
}
