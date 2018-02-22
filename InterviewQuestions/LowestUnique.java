/*
Given an array of n (between 10 to 20) integers 1 through 9,
return the index of the lowest unique integer (i.e. [1, 8, 2, 5, 2, 1, 6, 9, 7, 8] -> returns index 3 from value 5)
*/

import java.util.*;

public class LowestUnique {
  public static void main(String args[]) {
    int[] n = {1, 8, 2, 5, 2, 2, 5, 1, 6, 9, 7, 8};
    LowestUnique lu = new LowestUnique();
    int result = lu.findIndexHT(n);
    System.out.println(result);
  }

  private int findIndexHT(int[] num) {
    int[] numCopy = num.clone();
    Arrays.sort(num);
    Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
    for(int i = 0; i < num.length - 1; i++) {
      if(table.containsKey(num[i])) {
        int curVal = table.get(num[i]) + 1;
        table.put(num[i], curVal);
      } else {
        table.put(num[i], 1);
      }
    }

    int minKey = 999999;
    Set<Integer> keys = table.keySet();
    for(int key : keys) {
      if (table.get(key) == 1 && key < minKey){
        minKey = key;
      }
    }
    for(int j = 0; j < numCopy.length - 1; j++) {
      if (numCopy[j] == minKey)
        return j;
    }
    return minKey;
  }
}
