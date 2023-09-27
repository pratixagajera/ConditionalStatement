import java.util.Scanner;
/*main class*/
public class AlphabetLowerUpper {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any alphabet in uppercase : ");

        /*use character datatype*/
        char alphabet = scanner.next().charAt(0);

        /*conditional statement if-else */
        if (alphabet=='A'){
            System.out.println('a');
        }else if (alphabet == 'B'){
            System.out.println('b');
        }else if (alphabet== 'C'){
            System.out.println('c');
        }else if (alphabet=='D'){
            System.out.println('d');
        }else if (alphabet=='E'){
            System.out.println('e');
        }else if (alphabet=='F'){
            System.out.println('f');
        }else if (alphabet=='G'){
            System.out.println('g');
        }else if (alphabet=='H'){
            System.out.println('h');
        }else if (alphabet=='I'){
            System.out.println('i');
        }else if (alphabet=='J'){
            System.out.println('j');
        }else if (alphabet=='K'){
            System.out.println('k');
        }else if (alphabet=='L'){
            System.out.println('l');
        }else if (alphabet=='M'){
            System.out.println('m');
        }else if (alphabet=='N'){
            System.out.println('n');
        }else if (alphabet=='O'){
            System.out.println('o');
        }else if (alphabet=='P'){
            System.out.println('p');
        }else if (alphabet=='Q'){
            System.out.println('q');
        }else if (alphabet=='R'){
            System.out.println('r');
        }else if (alphabet=='S'){
            System.out.println('s');
        }else if (alphabet=='T'){
            System.out.println('t');
        }else if (alphabet=='U'){
            System.out.println('u');
        }else if (alphabet=='V'){
            System.out.println('v');
        }else if (alphabet=='W'){
            System.out.println('w');
        }else if (alphabet=='X'){
            System.out.println('x');
        }else if (alphabet=='Y'){
            System.out.println('y');
        }else if (alphabet=='Z'){
            System.out.println('z');
        }else {
            System.out.println("Invalid entry");
        }
    }
}
