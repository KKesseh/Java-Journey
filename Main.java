package com.company;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);


        //Get user Birthdate

        System.out.println("Enter Your DOB - YY/MM/DD: ");
        String dob = myScan.next();

        LocalDate dateOfBirth = LocalDate.parse(dob);

        DayOfWeek weekDay = DayOfWeek.from(dateOfBirth);

        int dayNumber = weekDay.getValue();

        // Get todays date: yyyy-mm-dd
        LocalDate currDate = LocalDate.now();

        // Get the difference between the two dates
        Period period = Period.between(currDate, dateOfBirth);

        // Isolate the number of years to get proper age format
        int age = Math.abs(period.getYears());


        System.out.println("Enter Your Gender\n1 for Male\n2 for Female");
        //gender = myScan.next().charAt(0);
        int gender = myScan.nextInt();

        //GENDERS

        if (gender == 1) {

            //SWITCH FOR MALES
            switch (dayNumber) {
                case 1:
                    System.out.println("Ghanaian Name: Kwadwo");
                    System.out.println("Day you were born was on a: " + weekDay );
                    System.out.println("Meaning of your name: A born on a: " + weekDay);
                    break;
                case 2:
                    System.out.println("Ghanaian Name: Kwabena");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a male born on a " + weekDay);
                    break;
                case 3:
                    System.out.println("Ghanaian Name: Kwaku");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a male born on a " + weekDay);
                    break;
                case 4:
                    System.out.println("Ghanaian Name: Yaw");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a male born on a " + weekDay);
                    break;
                case 5:
                    System.out.println("Ghanaian Name: Kofi");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a male born on a " + weekDay);
                    break;
                case 6:
                    System.out.println("Ghanaian Name: Kwame");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a male born on a " + weekDay);
                case 7:
                    System.out.println("Ghanaian Name: Kwasi");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a male born on a " + weekDay);
                    break;

            }

        }else if(gender == 2){
                // SWITCH FOR FEMALES
            switch(dayNumber){
                case 1:
                    System.out.println("Ghanaian Name: Adwoa");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a female born on a " + weekDay);
                    break;
                case 2:
                    System.out.println("Ghanaian Name: Abena");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a female born on a " + weekDay);
                    break;
                case 3:
                    System.out.println("Ghanaian Name: Akua");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a female born on a " + weekDay);
                    break;
                case 4:
                    System.out.println("Ghanaian Name: Yaa");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a female born on a " + weekDay);
                    break;
                case 5:
                    System.out.println("Ghanaian Name: Afia");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a female born on a " + weekDay);
                    break;
                case 6:
                    System.out.println("Ghanaian Name: Ama");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a female born on a " + weekDay);
                case 7:
                    System.out.println("Ghanaian Name: Akosua");
                    System.out.println("You were born on a " + weekDay );
                    System.out.println("Meaning of your name is a female born on a " + weekDay);
                    break;

            }


    }

/*
    //Final Display
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("Day of Week: " + weekDay);
        System.out.println("Day Number: " + dayNumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
}

        System.out.println("Ghanaian Name: ");
        System.out.println("Day you were born on a: " );
        System.out.println("Meaning: A born on a certain day");

        */
    }
}
