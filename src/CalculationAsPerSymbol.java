import java.util.Scanner;
/*main class*/
public class CalculationAsPerSymbol {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner= new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter whole digit number1 : ");
        int number1 = scanner.nextInt();

        /*print message*/
        System.out.println("Please enter whole digit number2 : ");
        int number2 = scanner.nextInt();

        /*print message*/
        System.out.println("Please enter symbol + or - or / or * : ");

        /*use character datatype*/
        char option = scanner.next().charAt(0);

        /*use integer datatype*/
        int addition = number1 +number2;
        int subtraction = number1-number2;
        int multiplication = number1*number2;
        int division = number1/number2;



        /*conditional statement switch */
        switch (option){
            case '+' :
                System.out.println(number1+ " + " +number2+ " = " +addition);
                break;
            case '-' :
                System.out.println(number1+  " - " +number2+ " = " +subtraction);
             break;
            case '*' :
                System.out.println(number1+ " * " +number2+ " = " +multiplication);
                break;
            case '/' :
                System.out.println(number1+ " / " +number2+ " = " +division);
                break;
            default :
                System.out.println("Invalid input");
                break;
        }


    }
}
