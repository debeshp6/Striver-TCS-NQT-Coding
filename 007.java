// calculate sum of the elements of the array

class Solution {
    public static int calc(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

class Main {
  public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6};
      int ans = Solution.calc(arr);
      System.out.print("sum is = " + ans);
  }
}
