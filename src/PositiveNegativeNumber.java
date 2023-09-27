import java.util.Scanner;
/*main class*/
public class PositiveNegativeNumber {

    /*main method*/
    public static void main(String[] args){

        /*create scanner object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter digit");
        double number = scanner.nextDouble();

        /*conditional operator if-else*/
        if (number>0){
            System.out.println("The given number is positive.");
        }else if (number<0){
            System.out.println("The given number is negative.");
        }else {
            System.out.println("The given number is 0.");
        }
    }
}
