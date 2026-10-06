package main.dsa.recursion;

import java.util.Arrays;

public class BasicRecursion {

    public static void printNameNTimes(String name, int max) {
        if (max == 0) {
            return;
        }
        System.out.println(name);
        printNameNTimes(name, max - 1);
    }

    public static void printTToN(int max) {
        if (max == 0) {
            return;
        }
        printTToN(max - 1);
        System.out.println(max);
    }

    public static void printTTo1(int max) {
        if (max == 0) {
            return;
        }
        System.out.println(max);
        printTTo1(max - 1);
    }

    public static void sum(int max, int sum) {
        if (max == 0) {
            System.out.println(sum);
            return;
        }
        sum += max;
        sum(max - 1, sum);
    }

    public static void sum(int n) {
        int sum = n * (n + 1) / 2;
        System.out.println(sum);
    }

    public static void factorial(int max, int factorial) {
        if (max == 0) {
            System.out.println(factorial);
            return;
        }
        factorial = factorial * max;
        factorial(max - 1, factorial);
    }

    public static void reverseArray(int[] array, int start, int end) {
        if (start >= end) {
            System.out.println(Arrays.toString(array));
            return;
        }
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseArray(array, start + 1, end - 1);
    }

    public static void checkPalindrome(String word, int start, int end) {
        if (start >= end) {
            System.out.println(true);
            return;
        }
        if (word.charAt(start) != word.charAt(end)) {
            System.out.println(false);
            return;
        }
        checkPalindrome(word, start + 1, end - 1);
    }

    public static int fib(int end) {
        if (end <= 1) {
            return end;
        }
        int last = fib(end - 1);
        int slast = fib(end - 2);
        return last + slast;
    }

}
