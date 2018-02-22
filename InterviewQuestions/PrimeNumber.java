/*
Check is a number is prime or not
*/


import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    System.out.println(isPrime(num));
  }

  private static boolean isPrime(int num) {
    for(int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) return false;
    }
    return true;
  }
}
