package pack_CODSOFT;

import java.util.Scanner;

public class GradeCalculator
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========RESULT DISPLAYER==========");

        System.out.println("Enter your marks of each subject (out of 100)");

        System.out.println("Enter marks of English :");
        int eng = sc.nextInt();
        System.out.println("Enter marks of Science :");
        int sci = sc.nextInt();
        System.out.println("Enter marks of Mathematics :");
        int maths = sc.nextInt();
        System.out.println("Enter marks of History :");
        int his = sc.nextInt();
        System.out.println("Enter marks of Marathi :");
        int mar = sc.nextInt();

        int totalSum = eng + sci + maths + his + mar;

        int avgPercentage = totalSum / 5;

        System.out.println("Total marks : "+totalSum);
        System.out.println("Percentage : "+avgPercentage+"%");


        if (avgPercentage >= 90 )
        {
            System.out.println("Grade : 'A' ");
        }
        else if (avgPercentage < 90 || avgPercentage >= 75)
        {
            System.out.println("Grade : 'B' ");
        }
        else if (avgPercentage < 75 || avgPercentage >= 60)
        {
            System.out.println("Grade : 'C' ");
        }
        else
            System.out.println("Grade : 'D' ");



    }
}
