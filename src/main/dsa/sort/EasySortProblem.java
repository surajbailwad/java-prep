package main.dsa.sort;

import java.util.*;

public class EasySortProblem {
    private EasySortProblem() {
        /* This utility class should not be instantiated */
    }


    public static void findMax(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void findSecondSmallest(int[] arr) {
        int n = arr.length;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {  // 3 2 1 4 5
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }

        }
        System.out.println(smallest + "  " + secondSmallest);
    }


    public static void findSecondLargest(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest " + largest + " Second Largest " + secondLargest);
    }

    public static void isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static void removeDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (arr[i] != arr[j]) {
                SortUtils.swap(arr, i, j);
            }
            i++;
            j++;
        }
        SortUtils.printArray(arr, n);
    }

    public static void leftRotateArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        int temp = arr[0];
        while (j < n) {
            SortUtils.swap(arr, i, j);
            i++;
            j++;
        }
        arr[n - 1] = temp;
        SortUtils.printArray(arr, n);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            SortUtils.swap(arr, start, end);
            start++;
            end--;
        }
    }

    private static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (k == 0) {
            SortUtils.printArray(arr, n);
            return;
        }
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        SortUtils.printArray(arr, arr.length);
    }

    private static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (k == 0) {
            SortUtils.printArray(arr, n);
            return;
        }
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
        SortUtils.printArray(arr, arr.length);

    }

    public static void reverseArray(int[] array, int times, String direction) {
        if ("RIGHT".equalsIgnoreCase(direction)) {
            rotateRight(array, times);
        } else if ("LEFT".equalsIgnoreCase(direction)) {
            rotateLeft(array, times);
        } else {
            System.out.println("INVALID DIRECTION");
        }
    }

    public static void moveZeros(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (arr[i] != 0) {
                i++;
            } else if (arr[j] != 0) {
                SortUtils.swap(arr, i, j);
                i++;
            }
            j++;
        }
        SortUtils.printArray(arr, n);
    }

    public static void sortedArrayUnion(int[] arr1, int[] arr2) {
        int n = arr1.length;  // 0, 1, 3, 12
        int m = arr2.length;  // 1, 2, 3
        List<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                if (union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.getLast() != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            } else {
                if (union.isEmpty() || union.getLast() != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while (i < n) {
            if (union.isEmpty() || union.getLast() != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < m) {
            if (union.isEmpty() || union.getLast() != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }
        System.out.println(union);
    }

    public static void missingNumber(int[] array) {
        int n = array.length + 1;
        int sum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += array[i];
        }
        System.out.println(sum - arraySum);
    }

    public static void missingNumberXOR(int[] array) {
        int n = array.length + 1;
        int arrayXor = 0;
        for (int i = 1; i <= n; i++) {
            arrayXor ^= i;
        }
        for (int i = 0; i < n - 1; i++) {
            arrayXor ^= array[i];
        }
        System.out.println(arrayXor);
    }

    public static void maxConsecutiveOnes(int[] array) {  // 1 0 1 1 0 1 1 1 0
        int n = array.length;
        int maxCount = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                count += 1;
            }
            if (array[i] == 0) {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(maxCount);
    }

    public static void findMissingInDuplicate(int[] array) {
        int result = 0;
        for (int j : array) {
            result ^= j;
        }
        System.out.println(result);
    }

    public static void findMissingInDuplicateArray(int[] array) {
        int n = array.length;
        int max = Arrays.stream(array).max().getAsInt();
        int[] countArray = new int[max + 1];
        for (int i = 0; i < n; i++) {
            countArray[array[i]]++;
        }
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[array[i]] == 1) {
                System.out.println(array[i]);
                break;
            }
        }
    }

    public static void longestSubArray(int[] array, int k) {
        int n = array.length;
        int maxLength = 0;
        int sum = array[0];
        int start = 0;
        int end = 0;
        while (end < n) {
            while (sum > k) {
                sum -= array[start];
                start++;
            }
            if (sum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }
            end++;
            if (end < n) {
                sum += array[end];
            }
        }
        System.out.println(maxLength == 0 ? -1 : maxLength);
    }

    public static void longestSubArrayWithNegative(int[] array) {
        int n = array.length;
        int sum = 0;
        int maxLen = 0;
        Map<Integer, Integer> prefixHash = new HashMap<>();
        prefixHash.put(0, -1);
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (prefixHash.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - prefixHash.get(sum));
            } else {
                prefixHash.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }

    public static void longestSubArrayWithNegative2(int[] array) {
        int n = array.length;
        int maxLen = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            sum += array[i];
            if (sum == 0) {
                maxLen = i + 1;
            } else {
                if (map.containsKey(sum)) {
                    maxLen = Math.max(maxLen, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        System.out.println(maxLen);
    }

    public static void twoSum(int[] array, int target) {
        int n = array.length;
        Map<Integer, Integer> map = new HashMap<>();
        boolean isPair = false;
        for (int i = 0; i < n; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                isPair = true;
                break;
            }
            map.put(array[i], i);
        }
        System.out.println(isPair);
    }

    public static void majorityElement(int[] array) {
        int n = array.length;
        int count = 0;
        Integer element = null;
        for (int i = 0; i < n; i++) {
            if (count == 0) {
                element = array[i];
                count++;
            } else if (array[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        System.out.println(element);

    }

}
