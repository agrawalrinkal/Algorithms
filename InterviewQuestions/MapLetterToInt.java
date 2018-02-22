/*
Given a string separated by a space like "123456 abc+efg" determine the solution by mapping integers to letters like a:1, b:2, c:3, d:4, e:5, f:6.
The only operations allowed were + or -. So the calculated solution that made the tests pass was 123+456 = 579.
Again took about 10 min of the 15min allowed.
*/


import java.util.*;
import java.lang.*;

public class MapLetterToInt {
  public static void main(String args[]) {
    String str = "12445478 a+bcddefh";
    MapLetterToInt lti = new MapLetterToInt();

    int result = lti.mapLetterInt(str);
    System.out.println(result);
  }

  private int mapLetterInt(String str) {
    String[] strArray = str.split(" ");
    String ints = strArray[0];
    String letters = strArray[1];
    int total = 0;
    int totalPrev = 0;
    char op = ' ';

    for(int i = 0; i < letters.length(); i++) {
      char ch = letters.charAt(i);

      if(ch != '+' && ch != '-') {
        if (op != ' ')
          total = total * 10  + Character.getNumericValue(ints.charAt(i-1));
        else {
          total = total * 10  + Character.getNumericValue(ints.charAt(i));
        }
      } else if (ch == '+') {
        totalPrev = total;
        total = 0;
        op = '+';
      } else if (ch == '-') {
        totalPrev = total;
        total = 0;
        op = '-';
      }
    }
    System.out.println(totalPrev + " " + op + " " + total);
    if (op == '-') {
      return totalPrev - total;
    } else if (op == '+') {
      return totalPrev + total;
    }
    return -1;
  }

}
