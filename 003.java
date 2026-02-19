// second smallest and second largest element in an array

class Solution {
    
    public static int secSmall(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num < min1) {
                min2 = min1;
                min1 = num;
            } else if(num < min2 && num != min1) {
                min2 = num;
            }
        }
        return min2;
    }
    
    public static int secLarge(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int num : arr) {
            if(num > max1) {
                max2 = max1;
                max1 = num;
            } else if(num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }
}

class Main {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int min = Solution.secSmall(arr);
    int max = Solution.secLarge(arr);
    System.out.print("second smallest = " + min);
    System.out.println();
    System.out.print("second largest = " + max);
  }
}
