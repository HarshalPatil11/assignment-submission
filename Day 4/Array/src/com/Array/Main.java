package com.Array;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];

        for(int i=0;i<5;i++){

            System.out.println("Enter a number :");
            arr[i]=sc.nextInt();
        }

        System.out.println("The odd numbers are ");

        for(int i=0;i<5;i++){

            if(arr[i]%2!=0)
            System.out.println(arr[i]);
        }
    }
}
