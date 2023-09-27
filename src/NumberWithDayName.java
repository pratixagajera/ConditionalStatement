import java.util.Scanner;
/*main class*/
public class NumberWithDayName {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any number 1-7 :");

        /*use integer datatype*/
        int number = scanner.nextInt();

        /*conditional operator switch*/
        switch (number){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
    }
}
