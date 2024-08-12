

public class Solution {
    
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps2(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps2(8));
        System.out.println(numberOfSteps(123));
        System.out.println(numberOfSteps2(123));
    }

    public static int numberOfSteps(int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            step++;
        }

        return step;
    }

    public static int numberOfSteps2(int num) {
        int step = 0;
        while (num != 0) {
            if ((num & 1) == 0) {
                num = num >> 1;
            } else {
                num = num - 1;
            }
            step++;
        }
        return step;
    }
}
