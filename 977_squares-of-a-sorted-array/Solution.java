import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        System.out.println(Arrays.toString(sortedSquares(nums)) );
        nums = new int[] { -7, -3, 2, 3, 11 };
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {
        
        int left = 0,right = nums.length - 1;
        int[] quares = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                quares[i] = nums[left] * nums[left];
                left++;
            } else {
                quares[i] = nums[right] * nums[right];
                right--;
            }
        }
        return quares;
    }

    
}
