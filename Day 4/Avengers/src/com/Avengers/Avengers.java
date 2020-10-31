package com.Avengers;
import java.util.Scanner;

public class Avengers {

    public String name,power,weapon,planet;
    public int age;

    Scanner sc=new Scanner(System.in);
    public void getDetails(){

        System.out.println("Enter the name of the Avenger :");
        name=sc.next();

        System.out.println("Enter the age of the Avenger :");
        age=sc.nextInt();

        System.out.println("Enter the power of the Avenger :");
        power=sc.next();

        System.out.println("Enter the weapon of the Avenger :");
        weapon=sc.next();

        System.out.println("Enter the planet of the Avenger :");
        planet=sc.next();

    }

    public void displayDetails(){

        System.out.println("The name of Avenger is : "+name);
        System.out.println("The age of Avenger is : "+age+" years");
        System.out.println("The power of Avenger is : "+power);
        System.out.println("The weapon of Avenger is : "+weapon);
        System.out.println("The planet of Avenger is : "+planet);
    }
}
