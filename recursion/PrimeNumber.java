
package recursion;

import java.util.Scanner;

public class PrimeNumber {
    public static int checkPrime(int num, int i) {
    if (i != 1) {
      if (num % i != 0)
        return checkPrime(num, i - 1);
      return 0;
    }
    return 1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0;
    int res = 0;

    System.out.println("Enter number: ");
    num = sc.nextInt();

    res = checkPrime(num, num / 2);
    if (res == 1)
      System.out.println("Number is prime.");
    else
      System.out.println("Number is not prime.");
    
}
}