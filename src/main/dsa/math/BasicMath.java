package main.dsa.math;

import java.util.ArrayList;
import java.util.List;

public class BasicMath {
    private BasicMath() {
    }

    public static void countDigits(int number) {
        if (number == 0) {
            System.out.println(1);
            return;
        }
        System.out.println((int) (Math.log10(number) + 1));
    }

    public static void reverseNumber(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reversed);
    }

    public static void isPalindrome(int number) {
        int initialNumber = number;
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(initialNumber == reversed);
    }

    public static void findGcd(int number1, int number2) {
        if (number1 == 0 || number2 == 0) {
            System.out.println(0);
            return;
        }
        int gcd = 1;
        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);
    }

    public static int findGcdEuclid(int number1, int number2) {
        while (number1 > 0 && number2 > 0) {
            if (number1 > number2) {
                number1 = number1 % number2;
            } else {
                number2 = number2 % number1;
            }
        }
        if (number1 == 0) {
            return number2;
        }
        return number1;
    }

    public static void armstrongNumber(int number) {
        int initialNumber = number;
        int digits = (int) Math.log10(number) + 1;
        int sum = 0;
        while (number > 0) {
            sum += (int) Math.pow((number % 10), digits);
            number = number / 10;
        }
        System.out.println(initialNumber == sum);
    }

    public static void listAllDivisors(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
            }
            if (i != number / i) {
                list.add(number / i);
            }
        }
        System.out.println(list);
    }

    public static void checkPrimeNumbers(int number) {
        if (number <= 1) {
            System.out.println(false);
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
