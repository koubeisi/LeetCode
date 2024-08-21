

public class Solution {


    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
        nums = new int[] { 555, 901, 482, 1771 };
        System.out.println(findNumbers(nums));
    }
    


    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int digitCount = 0;
            while (num > 0) {
                num /= 10;
                digitCount++;
            }
            if (digitCount % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
