import java.util.*;

public class Grade_Calculator {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name = sc.nextLine();
        System.out.println("Enter Assignment Marks (Under 100):");
        double assignment_score = sc.nextDouble();
        System.out.println("Enter Mid-term Exam  Marks (Under 100):");
        double mid_term_score = sc.nextDouble();
        System.out.println("Enter Final exam Marks(Under 100)");
        double final_score = sc.nextDouble();

        double Total_marks = assignment_score + mid_term_score + final_score;
        double Avarage = Total_marks / 3.0;

        System.out.println("Student Name is ---" + name);
        System.out.println("Assignment Marks  is---" + assignment_score);
        System.out.println("Mid-Term Exam Marks is---" + mid_term_score);
        System.out.println("Final Exam Marks is--- " + final_score);
        System.out.println("Total Marks ---"+Total_marks);
        System.out.println("Avarage is --"+Avarage);

        if (Avarage >= 90)
        {
            System.out.println("Grade A ");
        }
             else if (Avarage >= 70) {
                System.out.println("Grade B");
            }
             else if (Avarage >= 50) {
                System.out.println("Grade C");
            }
             else if (Avarage >= 30) {
                System.out.println("Grade D");
            }
            else
         {
                System.out.println("Grade F");
            }

        }
    }
