package com.Avengers;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


Avengers[] A=new Avengers[5];

//        creating object
        for(int i=0;i<5;i++){
            A[i]=new Avengers();
        }

//        getDetails &  displayDetails
        for(int i=0;i<5;i++){

            A[i].getDetails();
            A[i].displayDetails();
        }

    }
}
