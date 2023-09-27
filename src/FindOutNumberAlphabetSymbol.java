import java.util.Scanner;
/*main class*/
public class FindOutNumberAlphabetSymbol {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any value : ");

        /*use character datatype*/
        char value = scanner.next().charAt(0);

        /*conditional statement if-else*/
        if ((value>='a' && value<='z') || (value>='A' && value<='Z')){
            System.out.println("Given value is alphabet");
        }else if (value>='0' && value<='9'){
            System.out.println("Given value is number");
        }else {
            System.out.println("Given value is symbol");
        }
    }
}
