/*
 * @lc app=leetcode id=941 lang=java
 *
 * [941] Valid Mountain Array
 */

// @lc code=start
public class ValidMountainArray {

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        // edge case
        if (arr[0] >= arr[1] || arr[arr.length - 1] >= arr[arr.length - 2]) {
            return false;
        }
        
        int start = 1, end = arr.length - 2;
        while(start <= end){
            if (arr[start] > arr[start - 1] ) {
                start++;  
            } 
            if(arr[end] > arr[end + 1]){
                 end--;
            }
        }
        return start >= end;
    }

    public static void main(String[] args) {
        System.out.println(new ValidMountainArray().validMountainArray(new int[]{2, 1}));
        System.out.println(new ValidMountainArray().validMountainArray(new int[]{1, 3, 2}));
        System.out.println(new ValidMountainArray().validMountainArray(new int[]{3, 5, 5}));
        System.out.println(new ValidMountainArray().validMountainArray(new int[]{0, 3, 2, 1}));
        System.out.println(new ValidMountainArray().validMountainArray(new int[]{0,1,2,4,2,1}));
        System.out.println(new ValidMountainArray().validMountainArray(new int[]{0,1,2,3,4,8,9,10,11,12,11}));
    }
}
// @lc code=end

