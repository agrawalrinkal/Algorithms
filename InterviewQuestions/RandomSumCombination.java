/*
Given numbers 1 through 52, take 5 unique numbers and determine if the number 42 can be made using any combination of
addition (+), subtraction (-), multiplication (*), and division (/) on those 5 numbers.
*/

import java.util.*;
import java.lang.*;

public class RandomSumCombination {
  public static void main(String args[]) {

    Random rand = new Random();
    int[] arr = new int[5];
    char[] ops = {'+', '-', '*', '/'};
    int result = 42;

    for(int i = 0; i < 5; i++) {
      arr[i] = rand.nextInt(52) + 1;
    }

    for (int i : arr)
      System.out.print(i + " ");

    for (int n : arr) {
      for ()
    }



  }
}
