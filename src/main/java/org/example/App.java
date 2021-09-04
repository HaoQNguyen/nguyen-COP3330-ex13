/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hao Nguyen
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double p = input.nextDouble();
        System.out.print("What is the rate? ");
        double r = input.nextDouble() / 100.0;
        System.out.print("What is the number of years? ");
        int t = input.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double A = p * Math.pow((1 + r/n), (n*t));
        System.out.printf("$%.2f invested at %.2f%% for %d years compounded %d times per year is $%.2f.", p, r*100, t, n, A);
    }
}
