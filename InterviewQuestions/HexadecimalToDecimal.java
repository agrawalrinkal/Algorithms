/*
Hexadecimal to decimal
*/

public class HexadecimalToDecimal {
  public static void main(String args[]) {
    convertHexaToDecimal("ABC34");
  }

  private static void convertHexaToDecimal(String s) {
    String digits = "0123456789ABCDEF";
    s = s.toUpperCase();
    int val = 0;
    for(int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      int d = digits.indexOf(ch);
      val = 16 * val + d;
    }
    System.out.println(val);

  }
}
