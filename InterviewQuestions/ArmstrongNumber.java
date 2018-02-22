/*
Checks if the number is armstrong number
*/

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {
  public static void main(String args[]) {
    ArmstrongNumber armNum = new ArmstrongNumber();

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    boolean result = armNum.isArmstrongNumber(num);
    System.out.println(result);
  }

  private boolean isArmstrongNumber(int num) {
    int sum = 0;
    int numCopy = num;

    while(num > 0) {
      sum = sum + (int)Math.pow(num % 10, 3);
      num = num /10;
    }

    return sum == numCopy;

  }
}
