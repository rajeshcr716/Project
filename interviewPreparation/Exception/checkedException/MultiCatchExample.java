package checkedException;

public class MultiCatchExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[3];
            arr[4] = 10; // ArrayIndexOutOfBoundsException
            int result = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
