public class Fibonacci {

    /**
 * Returns nth Fibonacci number using recursion.
 *
 * @param n the zero-based position in the Fibonacci sequence (n >= 0)
 * @return the Fibonacci number at position n
 * @throws IllegalArgumentException if n is negative
 */
    
public static int fib(int n) { ... }

    // Recursive static method
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence: " + result + ".");
    }
}
