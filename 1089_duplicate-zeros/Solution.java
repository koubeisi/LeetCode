import java.util.Arrays;

public class Solution{



    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.print(Arrays.toString(arr));
        int[] nums = {1,2,3};
        duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
        int[] nums1 = {1,2,0};
        duplicateZeros(nums1);
        System.out.println(Arrays.toString(nums1));
        
    }


    public static void duplicateZeros(int[] arr) {
        var newArr = new int[arr.length];
        for(int i = 0,j = 0; j < arr.length; i++,j++){
            newArr[j] = arr[i];
            if(arr[i] == 0 && j < arr.length - 1){
                j++;
                newArr[j] = 0;
            } 
        }
        System.arraycopy(newArr, 0, arr, 0, arr.length);
    }
}