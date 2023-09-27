import java.util.Scanner;
/*main class*/
public class VowelOrConsonant {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message and use character datatype*/
        System.out.println("Please enter a single character from the alphabet : ");
        char alphabet =scanner.next().charAt(0);

        /*use conditional statement if-else*/
        if (alphabet=='a' || alphabet=='e' || alphabet=='i' || alphabet=='o' || alphabet=='u'){
            System.out.println("Input letter is vowel");
        }else {
            System.out.println("Input letter is consonant");
        }
    }
}
