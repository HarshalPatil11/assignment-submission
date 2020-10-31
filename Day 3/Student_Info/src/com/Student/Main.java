package com.Student;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;
        float percentageF;

        System.out.println("Enter each subject marks out of 100");

        System.out.println("Enter Subject 1 marks");
        sub1=sc.nextInt();

        System.out.println("Enter Subject 2 marks");
        sub2=sc.nextInt();

        System.out.println("Enter Subject 3 marks");
        sub3=sc.nextInt();

        System.out.println("Enter Subject 4 marks");
        sub4=sc.nextInt();

        System.out.println("Enter Subject 5 marks");
        sub5=sc.nextInt();


        percentageF=(sub1+sub2+sub3+sub4+sub5)/5;


        if(percentageF>75 && percentageF<100)
        {
            System.out.print("Your Percentage is ");
            System.out.println(percentageF);
            System.out.println("You have A grade");

        }
        else if(percentageF>50 && percentageF<75)
        {
            System.out.print("Your Percentage is ");
            System.out.println(percentageF);
            System.out.println("You have B grade");

        }
        else if(percentageF>35 && percentageF<50)
        {
            System.out.print("Your Percentage is ");
            System.out.println(percentageF);
            System.out.println("You have C grade");


        }
        else
        {
            System.out.print("Your Percentage is ");
            System.out.println(percentageF);
            System.out.println("Your are Failed. Improve your studies");
        }
    }
}
