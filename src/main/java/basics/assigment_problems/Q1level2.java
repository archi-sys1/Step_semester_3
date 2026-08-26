package Step_semester_3.src.main.java.basics.assigment_problems;
import java.util.Scanner;
public class Q1level2 {
    static void classifyWithAttendance(int marks, int attendance){
        if(marks>=40 && attendance>=75){
            if(marks>=90){
                System.out.println("GRADE:A");
            }
            else if(marks>=75){
                System.out.println("GRADE:B");
            }
            else if(marks>=60){
                System.out.println("GRADE:C");
            }
            else{
                System.out.println("GRADE:D");
            }
        }
        else{
            System.out.println("DETAINED");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks: ");
        int marks = sc.nextInt();

        System.out.println("Enter attendance: ");
        int attendance = sc.nextInt();

        classifyWithAttendance(marks, attendance);
        sc.close();
    }

}
