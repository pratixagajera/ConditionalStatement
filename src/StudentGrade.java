import java.util.Scanner;
/*main class*/
public class StudentGrade {
    /*main method*/
    public static void main (String[] args) {

        /*create scanner object*/
        Scanner scanner = new Scanner(System.in);

        /*student name*/
        System.out.println("Please enter student name");
        String name = scanner.nextLine();

        /*student rollNumber*/
        System.out.println("Please enter student roll no.");
        int rollNumber = scanner.nextInt();

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
        if (percentage>=80){
            System.out.println(name + " got A+ grade.");
        }else if (percentage>=60){
            System.out.println(name + " got A grade.");
        }else if (percentage>=50){
            System.out.println(name + " got B grade.");
        }else if (percentage>=35){
            System.out.println(name + " got C grade.");
        }else {
            System.out.println(name + " is fail.");
        }

    }
}
