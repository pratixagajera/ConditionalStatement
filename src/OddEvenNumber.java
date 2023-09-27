import java.util.Scanner;
/*main class*/
public class OddEvenNumber {

    /*main method*/
    public static void main(String[] args) {

        /*create scanner object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any whole digits");

        /*use integer datatype*/
        int number = scanner.nextInt();

        /*Use conditional turnery operator*/
        String answer = (number%2==0) ? " is even" : " is odd";
        System.out.println("Given number " + number + answer);
    }
}