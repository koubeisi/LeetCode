public class Main {

    public static void main(String[] args) {

        var a = runningSum(new int[] { 1, 2, 3, 4 });
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        var b = runningSum(new int[] { 1, 1, 1, 1, 1 });
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}