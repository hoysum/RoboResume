package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here


        ArrayList<Education>studies = new ArrayList<>();
        String response = "";
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("What is your degree?");
            String degree = in.next();
            System.out.println("What is your major?");
            String major = in.next();
            System.out.println("What is your school?");
            String school = in.next();
            System.out.println("What year did you graduate");
            String gradYear = in.next();

            studies.add(new Education(degree, major, school, gradYear));
            System.out.println("Do you want to add another Education? Type yes or no");
            response = in.next();
            in.nextLine();
        }while(!response.equalsIgnoreCase("no"));





    }

    //public static ArrayList<Education>(studies){

    }
//    public static ArrayList<Experience>(experiences){
//        ArrayList<Experience>experiences = new ArrayList<Experience>();
//        experiences.add(new Experience("Software Developer II", "Amtrak","June 2015", "Present",))
//    }

//}
