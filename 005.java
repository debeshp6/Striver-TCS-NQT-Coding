// count frequency of each element in an array 

import java.util.*;

class Solution {
    public static void frequency(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " times");
        }
    }
}

class Main {
  public static void main(String[] args) {
    int[] arr = {11, 11, 11, 33, 44, 88, 99, 00, 22, 66, 88, 99, 44};
    Solution.frequency(arr);
  }
}
