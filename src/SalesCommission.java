import java.util.Scanner;
/*main class*/
public class SalesCommission {

    /*main method*/
    public static void main(String[] args){

        /*create scanner object*/
        Scanner scanner = new Scanner(System.in);

        /*print message and use integer datatype*/
        System.out.println("Please enter sales id");
        int id = scanner.nextInt();
        System.out.println("Please enter seller name");
        String name = scanner.next();
        System.out.println("Please enter sales amount");
        int salesAmount = scanner.nextInt();
        System.out.println("Please enter basic salary");
        int basicSalary = scanner.nextInt();

        /*conditional operator if-else*/
        if (salesAmount>=50000){
            System.out.println(name+ " will get 35% commission");
        }else if (salesAmount>=30000){
            System.out.println(name+ " will get 20% commission");
        }else if (salesAmount>=20000){
            System.out.println(name+ " will get 10% commission");
        }else if (salesAmount>=10000){
            System.out.println(name+ " will get 5% commission");
        }else{
            System.out.println(name+ " will get 2% commission");
        }
    }
}
