/*
 * Sumaiya Fatema
 * 04 April 2023
 * CMP 167
 * Prof Loric Madramootoo
 * References:
	 * Trig Functions : https://www.geeksforgeeks.org/trigonometric-functions-in-java-with-examples/
	 * Loric Madramootoo's Sample Code
 */

import java.util.Scanner; // import scanner
import java.lang.Math; // import Math Class so we can do trig functions

public class MyCalculator {
    
	static Scanner scan = new Scanner(System.in); // static scanner!!

    public static void main(String[] args) { //main frame

    	   boolean noExit = true; // assign a boolean for our do-While loop

           do {
               System.out.println("Enter the calculator mode: Standard/Scientific?"); // beginning of calculator

               String Mode = scan.next(); // gets user input about standard/scientific

               while (!Mode.equalsIgnoreCase("Standard") && !Mode.equalsIgnoreCase("Scientific")) // new while loop to verify Mode CaseCharacter
               {
                   System.out.println("Invalid operator " + Mode);
                   System.out.println("Enter the calculator mode: Standard/Scientific?");
                   Mode = scan.next();
               } // end loop if false, continue iterating if true


               if (Mode.equalsIgnoreCase("Standard")) {
                   standardMode(Mode);
               }
               // goes to method to verify if input is as expected


               if (Mode.equalsIgnoreCase("Scientific")) {
                   scientificMode(Mode);
               }

               System.out.println("Do you want to start over? (Y/N)");
               String answer = scan.next();


               if (answer.equalsIgnoreCase("N")) {
                   System.out.println("Goodbye");
                   noExit = false;
               }


           }

           while (noExit);


    } 
   

    public static void standardMode(String Mode) {
        if (Mode.equalsIgnoreCase("Standard")) {
            System.out.println("The calculator will operate in standard mode.");

            System.out.println("Enter '+' for addition, '-' for subtractions, '*' "
                    + "for multiplication, '/' for division");
        }
        String operator = scan.next();

        incorrectStandardOperator(operator); // goes to method to verify if input is as expected
    }

    public static void scientificMode(String Mode) {
        if (Mode.equalsIgnoreCase("Scientific")) {
            System.out.println("The calculator will operate in scientific mode.");
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x,"
                    + " 'cos' for cos x, 'tan' for tan x:");
        }
        String operator = scan.next();

        incorrectScientificOperator(operator);

    }


    public static void incorrectScientificOperator(String operator) { // checks invalid inputs + asks to change
        while (!operator.equalsIgnoreCase("+") && !operator.equalsIgnoreCase("-") && !operator.equalsIgnoreCase("*") && !operator.equalsIgnoreCase("/")
                && !operator.equalsIgnoreCase("sin") && !operator.equalsIgnoreCase("cos") && !operator.equalsIgnoreCase("tan")) {
            System.out.println("Invalid operator " + operator);
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' "
                    + "for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
            operator = scan.next();

        }
        correctScientificOperator(operator);
    }

    public static void incorrectStandardOperator(String operator) { // checks invalid inputs
        while (!operator.equalsIgnoreCase("+") && !operator.equalsIgnoreCase("-") && !operator.equalsIgnoreCase("*") && !operator.equalsIgnoreCase("/")) {
            System.out.println("Invalid operator " + operator);
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
            operator = scan.next();

        }

        correctStandardOperator(operator);

    } // closes method

    public static void correctStandardOperator(String operator) {
        switch (operator) {
            case "+":
                addition();
                break;
            case "-":
                subtraction();
                // FinalMethod();
                break;
            case "*":
                multiplication();
                // FinalMethod();
                break;
            case "/":
                System.out.println("How many numbers do you want to divide?");
                int divideInput = scan.nextInt();


                System.out.println("Enter " + divideInput + " numbers"); // doesnt work in eclipse
                double x1 = scan.nextDouble(); // first value

                for (double i = 2; i <= divideInput; i++) { // increments by1 because we already got value, initialized at 1,
                    double y1 = scan.nextDouble(); // user enters additional numbers!!
                    if (y1 < 0) {
                        x1 = x1 / y1;
                    } else if (y1 == 0) {
                        x1 = x1 / y1;

                    } else {
                        x1 = x1 / Math.abs(y1);
                    }


                }
                System.out.println("Result: " + x1);
                // FinalMethod();
                break;
        }

    }


    public static void correctScientificOperator(String operator) {
        switch (operator) {
            case "+":
                addition();
                // FinalMethod();
                break;
            case "-":
                System.out.println("How many numbers do you want to subtract?");
                int subtractionInput = scan.nextInt();


                System.out.println("Enter " + subtractionInput + " numbers"); // doesnt work in eclipse
                double x = scan.nextDouble(); // first value

                for (double i = 2; i <= subtractionInput; i++) { // increments by1 because we already got value, initialized at 1,
                    double y = scan.nextDouble(); // user enters additional numbers!!
                    if (y < 0) {
                        x = x - y; // confused
                    } else {
                        x = x - Math.abs(y);
                    }
                }

                System.out.println("Result: " + x);
                // FinalMethod();
                break;
            case "*":
                multiplication();
                // FinalMethod();
                break;
            case "/":
                System.out.println("How many numbers do you want to divide?");
                int divideInput = scan.nextInt();


                System.out.println("Enter " + divideInput + " numbers"); // doesnt work in eclipse
                double x1 = scan.nextDouble(); // first value

                for (double i = 2; i <= divideInput; i++) { // increments by1 because we already got value, initialized at 1,
                    double y1 = scan.nextDouble(); // user enters additional numbers!!
                    if (y1 < 0) {
                        x1 = x1 / y1;
                    } else if (y1 == 0) {
                        x1 = x1 / y1;

                    } else {
                        x1 = x1 / Math.abs(y1);
                    }


                }
                System.out.println("Result: " + x1);
                // FinalMethod();
                break;
            case "sin":
                sine();
                // FinalMethod();
                break;
            case "cos":
                cosine();
                // FinalMethod();
                break;
            case "tan":
                tangent();
                // FinalMethod();
                break;
        }
    }

    public static void addition() {

        System.out.println("How many numbers do you want to add?");

        int additionInput = scan.nextInt();


        System.out.println("Enter " + additionInput + " numbers");

        double sum = 0;
        for (double i = 1; i <= additionInput; i++) { // increments by1, initialized at 1,
            double numbers = scan.nextDouble();
            sum = sum + numbers; // sum = sum + additional numbers user adds
            // System.out.println(i);

        }// closes sum loop

        System.out.println("Result: " + sum); // prints out final sum

    }


    public static void subtraction() {


        System.out.println("How many numbers do you want to subtract?");
        int subtractionInput = scan.nextInt();


        System.out.println("Enter " + subtractionInput + " numbers"); // doesnt work in eclipse
        double x = scan.nextDouble(); // first value

        for (double i = 2; i <= subtractionInput; i++) { // increments by1 because we already got value, initialized at 1,
            double y = scan.nextDouble(); // user enters additional numbers!!
            if (y < 0) {
                x = x - y;
            } else {
                x = x - Math.abs(y);
            }
        }

        System.out.println("Result: " + x);
    }

    public static void multiplication() {
        System.out.println("How many numbers do you want to multiply?");

        int Numbers = scan.nextInt();

        double product = 1;
        System.out.println("Enter " + Numbers + " numbers");
        for (double i = 1; i <= Numbers; i++) { // increments by1, initialized at 1,
            double productValues = scan.nextDouble(); // user enters additional numbers!!
            product = product * productValues; // sum = sum + additional numbers user adds
            // System.out.println(i);

        }
        System.out.println("Result: " + product);
    }


    public static void cosine() {
        System.out.println("Enter a number in radians to find the cosine");
        double cosValue = scan.nextDouble();
        double result = Math.cos(cosValue);
        System.out.println("Result: " + result);


    }

    public static void sine() {
        System.out.println("Enter a number in radians to find the sine");
        double sineValue = scan.nextDouble();
        double result = Math.sin(sineValue);
        System.out.println("Result: " + result);


    }

    public static void tangent() {
        System.out.println("Enter a number in radians to find the tangent");
        double tanValue = scan.nextDouble();
        double result = Math.tan(tanValue);
        System.out.println("Result: " + result);

    }

}
