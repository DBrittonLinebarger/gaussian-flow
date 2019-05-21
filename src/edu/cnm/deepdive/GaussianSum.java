package edu.cnm.deepdive;

import java.util.Scanner;

public class GaussianSum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int upperLimit;

    upperLimit = -1;
    long sum;

    while (upperLimit < 1 || upperLimit > 1000000) {
      System.out.println(" Please enter a value between 1 and 1000000.");
      while (!input.hasNextInt()) {
        input.next();
        System.out.println("Invalid input. Please enter a value between 1 and 1000000. ");
      }
      upperLimit = input.nextInt();
    }
    sum = ((long) upperLimit * (upperLimit + 1)) / 2;

    System.out.println(" The sum of 1 to " + upperLimit + " is " + sum + "." + " Great job kiddo!");
  }
}
