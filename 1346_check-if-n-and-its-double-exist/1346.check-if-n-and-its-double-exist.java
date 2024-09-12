
import java.util.HashSet;

/*
 * @lc app=leetcode id=1346 lang=java
 *
 * [1346] Check If N and Its Double Exist
 */
// @lc code=start
class Solution {

    public boolean checkIfExist(int[] arr) {
        var set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] << 1) || ((arr[i] & 1) == 0 && set.contains(arr[i] / 2))) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().checkIfExist(new int[]{10, 2, 5, 3}));
        System.out.println(new Solution().checkIfExist(new int[]{3, 1, 7, 11}));

    }
}
// @lc code=end

