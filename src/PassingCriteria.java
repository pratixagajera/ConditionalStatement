import java.util.Scanner;
/*main class*/
public class PassingCriteria {
    /*main method*/
     public static  void main(String[] args){


         /*create scanner object*/
         Scanner scanner = new Scanner(System.in);

         /*print message*/
         System.out.println("Please enter student name");
         String name = scanner.nextLine(); /*use string datatype*/
         System.out.println("Please enter student roll no.");
         int rollNumber = scanner.nextInt();/*use integer datatype*/

         /*maths subject marks*/
         System.out.println("Please enter Maths subject's marks : ");
         int mathsMarks = scanner.nextInt();

         /*science subject marks*/
         System.out.println("Please enter Science subject's marks : ");
         int scienceMarks = scanner.nextInt();

         /*history subject marks*/
         System.out.println("Please enter History subject's marks : ");
         int historyMarks = scanner.nextInt();

         /*total marks of all subject*/
         int totalMarks = mathsMarks + scienceMarks + historyMarks;
         System.out.println("Total marks : " +totalMarks);

         /*percentage of student*/
         int percentage = totalMarks/3;
         System.out.println("Student's percentage : " +percentage);

         /*use conditional if-else operator*/
         if (percentage>=80 && mathsMarks>=35 && scienceMarks>=35 && historyMarks>=35){
             System.out.println(name + " is pass in all subjects and got A+ grade.");

         }else if (percentage>=60 && mathsMarks>=35 && scienceMarks>=35 && historyMarks>=35){
             System.out.println(name + " is pass in all subjects and got A grade.");

         }else if (percentage>=50 && mathsMarks>=35 && scienceMarks>=35 && historyMarks>=35){
             System.out.println(name + " is pass in all subjects and got B grade.");

         }else if (percentage>=35 && mathsMarks>=35 && scienceMarks>=35 && historyMarks>=35){
             System.out.println(name + " is pass in all subjects and got C grade.");

         }else {
             System.out.println(name + " is not pass in every subject. So," +name+ " is fail");
         }
     }
}
