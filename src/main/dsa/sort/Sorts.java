package main.dsa.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Sorts {
    private Sorts() {
        /* This utility class should not be instantiated */
    }


    public static void selectionSort(int[] arr, int length) {
        for (int i = 0; i < length - 2; i++) {
            int min = i;
            for (int j = i; j < length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            SortUtils.swap(arr, min, i);
        }
        SortUtils.printArray(arr, length);
    }

    public static void bubbleSort(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            boolean isSwapped = false;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    SortUtils.swap(arr, i, j);
                    isSwapped = true;
                }
                if (!isSwapped) break;

            }
        }
        SortUtils.printArray(arr, length);
    }

    public static void recursiveBubbleSort(int[] arr, int length) {

    }

    public static void insertionSort(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                SortUtils.swap(arr, j, j - 1);
                j--;
            }
        }
        SortUtils.printArray(arr, length);
    }

    public static void insertionSort2(int[] arr, int length) {
        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        SortUtils.printArray(arr, length);
    }


    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        SortUtils.printArray(arr, arr.length);
    }

    private static void mergeSort(int[] arr, int leftPointer, int rightPointer) {
        if (leftPointer >= rightPointer) {
            return;
        }
        int middlePointer = leftPointer + (rightPointer - leftPointer) / 2;
        mergeSort(arr, leftPointer, middlePointer);
        mergeSort(arr, middlePointer + 1, rightPointer);
        merge(arr, leftPointer, middlePointer, rightPointer);

    }

    private static void merge(int[] arr, int leftPointer, int middlePointer, int rightPointer) {
        int n1 = middlePointer - leftPointer + 1;
        int n2 = rightPointer - middlePointer;
        int[] leftSubArray = new int[n1];
        int[] rightSubArray = new int[n2];

        int i;
        int j;
        for (i = 0; i < n1; i++) {
            leftSubArray[i] = arr[leftPointer + i];
        }
        for (j = 0; j < n2; j++) {
            rightSubArray[j] = arr[middlePointer + 1 + j];
        }

        i = j = 0;
        int k = leftPointer;

        while (i < n1 && j < n2) {
            if (leftSubArray[i] < rightSubArray[j]) {
                arr[k++] = leftSubArray[i++];
            } else {
                arr[k++] = rightSubArray[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftSubArray[i++];
        }
        while (j < n2) {
            arr[k++] = rightSubArray[j++];
        }
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        SortUtils.printArray(arr, arr.length);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int partitionIdx = partition(arr, start, end);
        quickSort(arr, start, partitionIdx - 1);
        quickSort(arr, partitionIdx + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                SortUtils.swap(arr, i, j);
            }
        }
        SortUtils.swap(arr, i, i + 1);
        return i + 1;
    }

    public static void countSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];
        for (int j : arr) {
            count[j]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
        SortUtils.printArray(arr, arr.length);
    }

    public static void stableCountSort(int[] arr) {
        int max = findMax(arr);
        int[] output = new int[arr.length];
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
        SortUtils.printArray(arr, arr.length);
    }

    public static void radixSort(int[] arr) {
        int max = findMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            radixCountSort(arr, exp);
        }
        SortUtils.printArray(arr, arr.length);
    }

    private static void radixCountSort(int[] arr, int exp) {
        int n = arr.length;
        int[] count = new int[10];
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        for (int i = 1; i < n; i++) {
            count[i] = count[i] + count[i - 1];
        }
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            int idx = count[(arr[i] / exp) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i] / exp) % 10]--;

        }
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }


    public static void bucketSort(float[] arr) {
        int n = arr.length;
        ArrayList<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList();
        }
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }
        for (int j = 0; j < buckets.length; j++) {
            Collections.sort(buckets[j]);
        }
        int index = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currentBucket = buckets[i];
            for (int j = 0; j < currentBucket.size(); j++) {
                arr[index++] = currentBucket.get(j);
            }
        }
        SortUtils.printArray(arr, arr.length);
    }


    private static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
