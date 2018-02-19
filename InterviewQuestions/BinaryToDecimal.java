/*
Binary to Decimal
*/

import java.util.Scanner;

public class BinaryToDecimal {
  public static void main(String args[]) {
       System.out.print("Enter a binary number: ");
       method2();
  }

  private static void method1() {
    Scanner input = new Scanner( System.in );
    String binaryString = input.nextLine();
    System.out.println("Output: "+Integer.parseInt(binaryString,2));
  }

  private static void method2() {
    Scanner input = new Scanner( System.in );
    int binaryNumber = input.nextInt();
    int decimal = 0;
    int p = 0;
    while(true){
      if(binaryNumber == 0){
        break;
      } else {
          int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
       }
    }
    System.out.println("Output: " + decimal);
  }
}
