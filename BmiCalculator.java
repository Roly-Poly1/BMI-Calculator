/*
Assignment 4
Description: Calculating BMI
Name: Millinh Apilado
ID: 920649519
Class: CSC210-03
Semester: Spring 2020
 */

//imports class Scanner to accept user input
import java.util.Scanner;

public class BmiCalculator {
    public static void main (String[] args)
    {

        //Declare Scanner to take input
        Scanner input = new Scanner(System.in);

        /*
        Declare datatype of height, bmi, weight and
        new variable bmiCast to cast/convert bmi to bmiCast
         */
        double bmi, weight;
        int height1, height2, finheight, bmiCast;

        //Welcome message
        System.out.println("Welcome to the BMI calculator");

        //Takes user input for name in two parts and weight in pounds
        String name_1;
        System.out.println("Please enter your first name: ");
        name_1 = input.next();
        String name_2;
        System.out.println("Please enter your last name: ");
        name_2 = input.next();
        System.out.println("Please input your weight (lbs):   ");
        weight = input.nextDouble();

        System.out.println("  ");

        //Takes user input for height but in two parts
        System.out.println("Height will be taken in two parts: feet and inches");
        System.out.println("  ");
        System.out.println("Example: your height is 5 feet 2 inches");
        System.out.println("Input will be...");
        System.out.println("  ");
        System.out.println("Part 1 (feet): 5");
        System.out.println("Part 2 (inches): 2");
        System.out.println("  ");
        System.out.println("Please input height part 1 (feet):   ");
        height1 = input.nextInt();
        System.out.println("Please input your height part 2 (inches):  ");
        height2 = input.nextInt();
        //Converts height input of feet and inches into just inches
        finheight = (height1 * 12) + height2;
        //Formula for bmi
        bmi = (703 * weight) / (finheight * finheight);

        System.out.println("  ");

        //Displays results and input by user
        String fin_name;
        fin_name = name_1 + " " + name_2;
        System.out.println("Name: " + fin_name);
        System.out.println("Height: " + height1 + " ft. " + height2 + " in. = " + finheight + " in.");
        System.out.println("Weight: " + weight);
        System.out.println("BMI: " + bmi);

        //Determines user's bmi category
        if (bmi <= 18.5){
            System.out.println("  ");
            System.out.println("BMI Category: Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9){
            System.out.println("BMI Category: Normal Weight");
        }
        else if (bmi >= 25.0 && bmi <= 29.9){
            System.out.println("BMI Category: Overweight");
        }
        else{
            System.out.println("BMI Category: Obese");
        }
    }
}

