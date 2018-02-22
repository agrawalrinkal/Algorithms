/*
Given an array of n (between 10 to 20) integers 1 through 9,
return the index of the lowest unique integer (i.e. [1, 8, 2, 5, 2, 1, 6, 9, 7, 8] -> returns index 3 from value 5)
*/

import java.util.Arrays;

public class LowestUnique {
  public static void main(String args[]) {
    int[] n = {1, 8, 2, 5, 2, 5, 1, 6, 9, 7, 8};
    LowestUnique lu = new LowestUnique();
    int result = lu.findIndex(n);
    System.out.println(result);
  }

  private int findIndex(int[] n) {
    int[] nCopy = n.clone();

    Arrays.sort(n);

    int  i = 0;
    while(i < n.length - 1) {
      if (n[i] != n[i + 1]) {
        for(int j = 0; j < nCopy.length - 1; j++) {
          if (nCopy[j] == n[i])

            return j;
          }
      }
      i += 2;
    }
    return -1;
  }

}
