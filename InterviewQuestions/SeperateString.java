/*
Given a string with a mix of comma separated words and numbers,
print out two strings which contain only words in one and numbers in the other separated by commas.
*/

import java.util.*;
import java.lang.*;


public class SeperateString {
  public static void main(String args[]) {
    SeperateString ss = new SeperateString();

    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    ss.seperateIntoStrings(str);
  }

  private void seperateIntoStrings(String str) {
    String[] strArray = str.split(",");
    String words = "";
    String numbers = "";

    for(int i = 0; i < strArray.length; i++) {
      if (isNUmeric(strArray[i])) {
        numbers += strArray[i] + ",";
      } else {
        words += strArray[i] + ",";
      }
    }
    words = words.substring(0, words.length() - 1);
    numbers = numbers.substring(0, numbers.length() - 1);

    System.out.println(words);
    System.out.println(numbers);
  }

  private static boolean isNUmeric(String str) {
    try {
      double d = Double.parseDouble(str);
    } catch(NumberFormatException ex) {
      return false;
    }
    return true;
  }

}
