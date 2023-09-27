import java.util.Scanner;
/*main class*/
public class LeapYear {

    /*main method*/
    public static void main (String[] args) {

        /*create scanner object*/
        Scanner scanner = new Scanner(System.in);

        /*Print message*/
        System.out.println("Please enter any year");

        /*use integer datatype*/
        int year = scanner.nextInt();

       /*use conditional operator if-else*/
        if ((year%4==0) && (year%100 !=0) || (year%400==0))
        {
            System.out.println("The given year " + year + " is leap year");
        }else
        {
            System.out.println("The given year " + year + " is not leap year");
        }
    }
}
