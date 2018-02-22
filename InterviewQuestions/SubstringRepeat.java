/*
* Find the smallest repeating string pattern in a string(15min)
*/

import java.util.Scanner;

public class SubstringRepeat {
  public static void main(String[] args) {
    SubstringRepeat subStrRepeat = new SubstringRepeat();

    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    String result = subStrRepeat.findRepetativeString(str);
    System.out.println(result);

  }

  private String findRepetativeString(String str) {
    int len = str.length();
    for(int i = len / 2; i > 0; i--) {
      if (len % i == 0) {
        int m = len / i;
        String subS = str.substring(0, i);
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < m; j++) {
          sb.append(subS);
        }
        if (sb.toString().equals(str)) return subS;
      }
    }
    return "Nothing found";
  }
}
