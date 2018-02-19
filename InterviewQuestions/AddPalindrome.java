/*
Given an initial number, reverse it and add it back to the initial. Check if new number is a palindrome.
If not repeat till is. If yes display how many iterations it took and the number.
*/

import java.util.Scanner;
import java.lang.Math;

public class AddPalindrome {

  private static int numIterations = 0;

  public static void main(String args[]) {

    boolean isNumNegative = false;

    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a number : ");
    int num = scan.nextInt();

    if (num < 0) {
      isNumNegative = true;
      num = Math.abs(num);
    }
    else isNumNegative = false;

    int sumResult = 0;

    int reversedNum = 0;
    boolean result = false;

    do {
      reversedNum = getReversedNumber(num);
      sumResult = num + reversedNum;
      if(checkNumOverflow(sumResult)) break;
      result = checkIfPalindrome(sumResult);
      if (!result) {
        num = sumResult;
      }
    } while (!result && numIterations < 20);

    if (isNumNegative) sumResult *= -1;

    if(result) System.out.println("Yes!! The " + sumResult + " is Palindrome and it took " + numIterations + " iterations");
    else System.out.println(sumResult + " is not a palindrome");
  }

  // Returns the reversed number
  private static int getReversedNumber(int num) {
    int revNum = 0;
    while(num > 0) {
      revNum = revNum * 10 + num % 10;
      num = num / 10;
    }
    return revNum;
  }

  // Checks if a given number is palindrome
  private static boolean checkIfPalindrome(int num) {
    numIterations++;
    // System.out.println(num);
    if (num == getReversedNumber(num)) return true;
    return false;
  }

  // Checks if a number overflows the int, returns true if it does
  private static boolean checkNumOverflow(int num) {
    int result = num + num;
    if (num > 0 && result < 0) return true;
    else return false;
  }
}
