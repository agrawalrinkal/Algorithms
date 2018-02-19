/*
you are given 3 coins of value 1, 3 and 5.
You are also given a total which you have to arrive at. Find the minimum number of coins to arrive at it.
*/

import java.util.Scanner;
// import java.lang.Math;

public class CoinDivider {
  public static void main(String args[]) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Please enter a number : ");
    int num = scan.nextInt();

    int numOf5Coins = num / 5;
    int numOf3Coins =  (num - (numOf5Coins * 5)) / 3;
    int numOf1Coins = (num - (numOf5Coins * 5) - (numOf3Coins * 3)) / 1;

    System.out.println("Took \n" + numOf5Coins + " $5 coins \n" + numOf3Coins + "  $3 coins \n" + numOf1Coins + "  $1 coins.");
    System.out.println(numOf5Coins + numOf3Coins + numOf1Coins);
  }
}
