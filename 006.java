// rearrange array in increasing-decreasing order

import java.util.*;

class Solution {
    public static void rearrange(int[] arr) {
        if(arr == null || arr.length == 0) return;
        int n = arr.length;
        Arrays.sort(arr);
        for(int i=n/2, j=n-1; i<j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}

class Main {
  public static void main(String[] args) {
    int[] arr = {1,3,2,4,5,6};
    Solution.rearrange(arr);
    for(int i : arr) {
        System.out.print(i + " ");
    }
  }
}
