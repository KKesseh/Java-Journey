package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int myNumber = myScan.nextInt();

        if ((myNumber % 3) == 0) {
            System.out.println("Fizz");
        } else if (myNumber % 5 == 0) {
            System.out.println("Buzz");
        } else if (myNumber % 3 == 0 && myNumber % 5 == 0){
            System.out.println("FizzBuzz");
        } else {
            System.out.println(myNumber);
        }
    }
}
