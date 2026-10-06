package main.dsa.sort;

public class MediumSortProblems {
    private MediumSortProblems() {
        /* This utility class should not be instantiated */
    }

    public static void sortZerosOnesTwos(int[] array) { // 1, 0, 1, 2, 1, 2
        int n = array.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (array[mid] == 0) {
                SortUtils.swap(array, low, mid);
                low++;
                mid++;
            } else if (array[mid] == 1) {
                mid++;
            } else {
                SortUtils.swap(array, mid, high);
                high--;
            }
        }
        SortUtils.printArray(array, array.length);
    }

    public static void maxSubArraySum(int[] array) {  // 2, 3, 5, -2, 7, -4
        int n = array.length;
        int currentSum = array[0];
        int maxSum = array[0];
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println(maxSum);
    }

    public static void kadanesWithSubarray(int[] nums) {
        int n = nums.length;
        int currentSum = nums[0];
        int maxSum = nums[0];
        int start = -1;
        int end = -1;
        int tempStart = -1;
        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

    }
}
