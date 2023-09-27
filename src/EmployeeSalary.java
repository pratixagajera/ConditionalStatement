import java.util.Scanner;
/*main class*/
public class EmployeeSalary {

    /*main method*/
    public static void main(String[] args){

        /*create object*/
        Scanner scanner = new Scanner(System.in);

        /*print message*/
        System.out.println("Please enter employee id :");
        String id = scanner.nextLine();
        System.out.println("Please enter employee's name");
        String name = scanner.nextLine();
        System.out.println("Please enter employee's basic salary");

        /*use integer datatype*/
        int  basicSalary = scanner.nextInt();

        /*use floating point datatype-double*/
        double HRA = 0.10*basicSalary;
        System.out.println("HRA : " +HRA);
       double DA = 0.08*basicSalary;
        System.out.println("DA : " +DA);
       double TA = 0.09*basicSalary;
        System.out.println("TA : " +TA);
       double PF = 0.20*basicSalary;
        System.out.println("PF : " +PF);
       double GrossSalary = basicSalary+HRA+TA+DA-PF;
        System.out.println("Employee's gross salary is : " +GrossSalary);
    }
}
