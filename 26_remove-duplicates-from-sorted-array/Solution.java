
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int k = removeDuplicates(nums);
        System.out.println("Number of elements after removing duplicates: " + k);
        System.out.println("Updated array: " + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        var k = 1;
        for (var i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
