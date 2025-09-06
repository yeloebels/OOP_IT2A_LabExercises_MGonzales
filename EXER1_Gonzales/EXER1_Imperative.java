// Save this file as EXER1_Imperative.java

import java.util.*;

public class EXER1_Imperative {
    public static void main(String[] args) {
        // Example dataset
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        System.out.println("Original numbers: " + numbers);

        // Imperative style: find even numbers (explicit steps with loops)
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }
        System.out.println("Even numbers (imperative): " + evenNumbers);

        // Imperative style: compute sum of squares
        int sumOfSquares = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int square = numbers.get(i) * numbers.get(i);
            sumOfSquares += square;
        }
        System.out.println("Sum of squares (imperative): " + sumOfSquares);

        // Imperative style: find maximum number
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > maxNumber) {
                maxNumber = numbers.get(i);
            }
        }
        System.out.println("Maximum number (imperative): " + maxNumber);

        // Imperative style: count prime numbers
        int primeCount = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                primeCount++;
            }
        }
        System.out.println("Count of prime numbers (imperative): " + primeCount);
    }

    // Helper method to check if a number is prime (imperative style)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
