package main.dsa.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashHash {
    private HashHash() {
        /* This utility class should not be instantiated */
    }


    public static void countFrequencyWithArray(int[] array) {
        int[] hashedArray = new int[array.length + 1];
        for (int j : array) {
            hashedArray[j]++;
        }
        for (int j : hashedArray) {
            if (j > 0) {
                System.out.print(j + ",");
            }

        }
    }

    public static void countFrequencyWithMap(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }

    public static void highestAndLowestFreq(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : array) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int high = Integer.MIN_VALUE;
        int low = Integer.MAX_VALUE;
        for (int i : map.values()) {
            if (i > high) {
                high = map.get(i);
            }
            if (i < low) {
                low = map.get(i);
            }
        }
        System.out.println(high + "," + low);
    }

    public static void containsDuplicate(int[] array) {
        Set<Integer> map = new HashSet<>();
        for (int j : array) {
            if (map.contains(j)) {
                System.out.println(true);
                return;
            }
            map.add(j);
        }
        System.out.println(false);
    }
}
