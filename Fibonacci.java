public class Fibonacci {

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
