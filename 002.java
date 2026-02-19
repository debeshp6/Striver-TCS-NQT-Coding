// find the largest number in an array

import java.util.*;

class Solution {
    public static int largest(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

class Main {
  public static void main(String[] args) {
    int[] arr = {1, 4, 3, 66, 76, 56, 34, 55, 76};
    int ans = Solution.largest(arr);
    System.out.println("largest element = " + ans);
  }
}
