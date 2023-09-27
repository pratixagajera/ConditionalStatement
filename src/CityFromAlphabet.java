import java.util.Scanner;
/*main class*/
public class CityFromAlphabet {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter any alphabet from a to f : ");

        /*use string datatype*/
        String cityName = scanner.nextLine();

        /*conditional statement switch */
        switch (cityName){
            case "a" :
                System.out.println("Ahmedabad");
                break;
            case "b" :
                System.out.println("Bombay");
                break;
            case "c" :
                System.out.println("Chennai");
                break;
            case "d" :
                System.out.println("Delhi");
                break;
            case "e" :
                System.out.println("Ellora");
                break;
            case "f" :
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
