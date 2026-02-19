// reverse an array 

class Solution {
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.print("before: ");
    for(int i : arr) {
        System.out.print(i + " ");
    }
    System.out.println();
    Solution.reverse(arr);
    System.out.print("after: ");
    for(int i : arr) {
        System.out.print(i + " ");
    }
  }
}
