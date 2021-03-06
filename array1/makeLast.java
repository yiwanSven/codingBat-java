/*
Given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
*/

public class Main
{
  public static void main(String [] args)
  {
    int[] arr1 = {2, 2, 2, 2};
    System.out.println(makeLast(arr1));
  }

  public static int[] makeLast(int[] nums) {
    int len = nums.length;
    int[] result = new int[len+len];
    result[result.length - 1] = nums[len - 1];
    return result;
  }
}
