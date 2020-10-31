package com.Employee;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name;
        int age,date,month,year;
        float taxF,monthly_salaryF,annual_salaryF;

        System.out.println("Enter Name Of Employee :");
        name=sc.nextLine();

        System.out.println("Enter Birthdate Of Employee");

        System.out.println("Enter Date");
        date=sc.nextInt();

        System.out.println("Enter Month");
        month=sc.nextInt();

        System.out.println("Enter Year");
        year=sc.nextInt();

        if(date>12){

            month=month-1;
            date=date+30-12;

            if(month>10){

                year=year-1;
                month=month+12-10;
            }
            year=2020-year;

            age=((year*365)+(month*12)+date)/365;
            System.out.print("The age is : ");
            System.out.println(age);
        }

        System.out.println("Enter your Monthly Salary ");
        monthly_salaryF=sc.nextInt();

        if(monthly_salaryF>=500000){

            taxF=monthly_salaryF*20/100;

            annual_salaryF=(monthly_salaryF-taxF)*12;

            System.out.print("The annual salary of Employee is : ");
            System.out.println(annual_salaryF);

            System.out.print("Total amount of tax is : ");
            System.out.println(taxF*12);

        }

       else if(monthly_salaryF<500000 && monthly_salaryF>=400000){

            taxF=monthly_salaryF*15/100;

            annual_salaryF=(monthly_salaryF-taxF)*12;

            System.out.print("The annual salary of Employee is : ");
            System.out.println(annual_salaryF);

            System.out.print("Total amount of tax is : ");
            System.out.println(taxF*12);

        }

        else if(monthly_salaryF<400000 && monthly_salaryF>=300000){

            taxF=monthly_salaryF*10/100;

            annual_salaryF=(monthly_salaryF-taxF)*12;

            System.out.print("The annual salary of Employee is : ");
            System.out.println(annual_salaryF);

            System.out.print("Total amount of tax is : ");
            System.out.println(taxF*12);

        }

        else if(monthly_salaryF<300000 && monthly_salaryF>=200000){

            taxF=monthly_salaryF*5/100;

            annual_salaryF=(monthly_salaryF-taxF)*12;

            System.out.print("The annual salary of Employee is : ");
            System.out.println(annual_salaryF);

            System.out.print("Total amount of tax is : ");
            System.out.println(taxF*12);

        }
        else{
            taxF=0;
            annual_salaryF=monthly_salaryF*12;

            System.out.print("The annual salary of Employee is : ");
            System.out.println(annual_salaryF);

            System.out.print("Total amount of tax is : ");
            System.out.println(taxF*12);
        }



    }
}
