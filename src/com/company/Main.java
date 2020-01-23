package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.println("------Cube Numbers-----");
        System.out.println("-----------------------");

        System.out.println("Enter a number to cube to");
        int target = scan.nextInt();
        for (int x = 1; x <= target; x++){
            int cube = x * x * x;
            System.out.println(x + " cubed = " + cube );
        }

        System.out.println("----------------------------");
        System.out.println("----Multiplication Table----");
        System.out.println("----------------------------");
        System.out.println("Enter a number to multiply to");
        int multiply = scan.nextInt();
        for(int c = 1; c <= 10; c++){
            int multTotal = c * multiply;
            System.out.println(c + " x " + " " + multiply + " = " + multTotal);
        }

        System.out.println("----------------------");
        System.out.println("------Odd Numbers-----");
        System.out.println("----------------------");
        System.out.println("Enter an number: ");
        int oddNum = scan.nextInt();
        for(int v = 0; v <= oddNum; v++){
            if(v % 3 == 0){
                int oddSum = 0;
                oddSum += v;
                System.out.println("Sum: " + v);
            } else{
                continue;
            }
        }

        System.out.println("-----------------------");
        System.out.println("------Even Numbers-----");
        System.out.println("-----------------------");
        System.out.println("Enter a number: ");
        int evenNum = scan.nextInt();
        for(int b = 0; b <= evenNum; b++){
            if(b % 2 == 0){
                int evenSum = 0;
                evenSum += b;
                System.out.println("Sum: " + b);
            }else{
                continue;
            }
        }

        System.out.println("---------------------------");
        System.out.println("------Paldindrome Test-----");
        System.out.println("---------------------------");
        System.out.println("Enter a long number: ");
        int palin = scan.nextInt();
        int reverseNum = 0;
        for (int n = palin; n != 0; n /= 10){
            reverseNum = reverseNum * 10 + n % 10;
        }
        if(palin == reverseNum){
            System.out.println("This is a paldindrome");
            System.out.println("Your number: " + palin);
            System.out.println("Your number reversed " + reverseNum);
        }else{
            System.out.println("This number is not a paldindrome");
            System.out.println("Your number reversed " + reverseNum);
        }

        System.out.println("-----------------------");
        System.out.println("------Sum of Numbers % 9-----");
        System.out.println("-----------------------");
        int lSum = 0;
        for(int l = 100; l <= 200; l++){
            if (l % 9 == 0){
                 lSum += l;
                System.out.println(l + " is divisible by 9.... adding to total");
                System.out.println("Current sum = " + lSum);
            }else{
                continue;
            }
        }
        System.out.println("Sum of numbers 1-200 divisible by 9 = " + lSum);
    }
}
