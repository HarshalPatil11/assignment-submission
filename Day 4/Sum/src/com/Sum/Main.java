package com.Sum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[] arr=new int[5];

        for(int i=0;i<5;i++){

            System.out.println("Enter a number :");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<5;i++){

            sum=sum+arr[i];
        }

        System.out.println("The sum of numbers is : " +sum);
    }
}
