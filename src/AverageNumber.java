import java.util.Scanner;
/*main class*/
public class AverageNumber {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any five whole digits");

        /*use integer datatype*/
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();

        int total = number1+number2+number3+number4+number5;

        /*method for output*/
        System.out.println("The average of given number is " +total/5);



    }
}
