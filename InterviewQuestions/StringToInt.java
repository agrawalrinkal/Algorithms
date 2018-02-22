/*
* Every letter is associated with a number as a-1, b-2 , ....
So if the string is abcd it should give the output as 0123
if the string is with any special characters the output has to be "none"
*/


import java.util.*;
import java.lang.*;

public class StringToInt {
  public static void main(String[] args) {
    StringToInt sti = new StringToInt();

    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    String result = sti.convertStringToInt(str);
    System.out.println(result);
  }

  private String convertStringToInt(String str) {
    String resultStr = "";
    for(int i = 0; i < str.length(); i++) {
      int ascii = (int) str.charAt(i);
      if(ascii >= 97 && ascii <= 122) {
        int intValue = ascii - 97;
        resultStr += String.valueOf(intValue);
      } else {
        return "None";
      }
    }
    return resultStr;
  }
}
