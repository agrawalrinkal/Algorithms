/*
A sequence of n numbers (n < 3000) is called Jolly Jumper if the absolute values of 
the differences between the successive elements take on all possible values from 1 through n-1. 
The definition implies that any sequence of a single integer is a jolly jumper.
*/

import java.util.ArrayList;
import java.lang.*;

public class JollyJumper {
    public static void main(String args[]) {
        // String[] strArray = {"aa", "a"};
        int[] numArray = {1, 4, 2, 1};
        boolean result = jollyJumper(numArray);
        System.out.println(result);
    }
    public static boolean jollyJumper(int[] nums) {
        ArrayList<Integer> jolly = new ArrayList<Integer>();
        for(int i = 1; i < nums.length; i++) {
            jolly.add(i);
        }
        for(int i = 1; i < nums.length; i++) {
            int diff = Math.abs(nums[i]-nums[i-1]);
            if(jolly.contains(diff)) {
                jolly.remove(new Integer(diff));
            }
        }
        if(jolly.isEmpty()) return true;
        return false;
    }
}
