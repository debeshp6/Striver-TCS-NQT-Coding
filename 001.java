// find the smallest number from an array

import java.util.*;

class Solution {
    public static int smallest(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for(int i=1; i<n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

class Main {
  public static void main(String[] args) {
    int[] arr = {34, 56, 32, 6, 3, 522, 4, 667, 5};
    int ans = Solution.smallest(arr);
    System.out.println("smallest element = " + ans);
  }
}
