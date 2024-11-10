public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int first = 0, second = 1;

        System.out.println("Fibonacci Series up to " + n + " terms:");

        // Print the first two terms of the series
        System.out.print(first + " " + second + " ");

        // Print the rest of the Fibonacci series
        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");

            // Update values of first and second
            first = second;
            second = nextTerm;
        }
    }
}
