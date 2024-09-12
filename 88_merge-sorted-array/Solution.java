
import java.util.Arrays;

public class Solution {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (var i = m + n - 1; i >= 0; i--) {
            if (n != 0 && m != 0) {
                if (nums1[m - 1] > nums2[n - 1]) {
                    nums1[i] = nums1[m - 1];
                    m--;
                } else {
                    nums1[i] = nums2[n - 1];
                    n--;
                }
            } else if (n != 0) {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));

    }
}
