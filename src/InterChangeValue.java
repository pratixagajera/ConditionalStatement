import java.util.Scanner;
/*main class*/
public class InterChangeValue {

    /*main method*/
    public static void main(String[] args){

        /*create scanner object*/
        Scanner scanner = new Scanner(System.in);

        /*print message and use integer datatype*/
        System.out.println("Please enter whole digits as value of a : ");
        int a = scanner.nextInt();
        System.out.println("Please enter whole digits as value of b : ");
        int b = scanner.nextInt();

        /*original value*/
        System.out.println("Original value of a : " +a+ " & value of b : " +b);
        int c;

        c = a;
        a = b;
        b = c ;

        /*after interchange value output*/
        System.out.println("After interchange value of a : " +a+ " & value of b : " +b);

    }
}
