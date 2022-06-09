package arrays;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber main = new MissingNumber();
        int intArray[] = {3, 0, 1}; //{3,0,1};  //{5}; //{0, 1};   //{0,1,2}; // {9,6,4,2,3,5,7,0,1}; //
        System.out.println("Missing Number is " + missingNumber(intArray));
    }

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return i;

    }

}
