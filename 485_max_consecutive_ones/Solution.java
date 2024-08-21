public class Solution {

    public static void main(String[] args) {

        int[] nums = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));

        nums = new int[] { 1, 0, 1, 1, 0, 1 };
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int maxConsecutiveResult = 0;
        int maxConsecutiveNow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxConsecutiveNow++;
            } else {
                maxConsecutiveResult = (maxConsecutiveNow >= maxConsecutiveResult) ? maxConsecutiveNow
                        : maxConsecutiveResult;
                maxConsecutiveNow = 0;
            }
        }

        return (maxConsecutiveNow >= maxConsecutiveResult) ? maxConsecutiveNow
        : maxConsecutiveResult;
    }

}