import java.util.Scanner;
/*main class*/
public class AgeEligibilityForVote {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);
        /*print message*/
        System.out.println("Please enter the person's age : ");

        /*use integer datatype*/
        int age =scanner.nextInt();

        /*conditional statement if-else */
        if (age>=18){
            System.out.println("This person is eligible for vote");
        }else {
            System.out.println("This person is not eligible for vote");
        }

    }
}
