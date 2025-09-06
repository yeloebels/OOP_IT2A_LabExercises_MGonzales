// Save this file as EXER1_Declarative.java

import java.util.*;
import java.util.stream.*;

public class EXER1_Declarative {

    public static void main(String[] args) {
        // Example dataset
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original numbers: " + numbers);

        // Imperative style (HOW to get the result)
        List<Integer> evenNumbersImperative = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbersImperative.add(num);
            }
        }
        System.out.println("Even numbers (imperative): " + evenNumbersImperative);

        // Declarative style (WHAT we want, not HOW)
        List<Integer> evenNumbersDeclarative = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers (declarative): " + evenNumbersDeclarative);

        // Declarative style: find sum of even numbers
        int sumOfEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers (declarative): " + sumOfEven);

        // Declarative style: find maximum number
        int maxNumber = numbers.stream()
                .max(Integer::compare)
                .orElse(-1);
        System.out.println("Maximum number (declarative): " + maxNumber);

        // Declarative style: count prime numbers
        long primeCount = numbers.stream()
                .filter(EXER1_Declarative::isPrime)
                .count();
        System.out.println("Count of prime numbers (declarative): " + primeCount);
    }

    // Helper method to check prime numbers
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .allMatch(div -> n % div != 0);
    }
}
