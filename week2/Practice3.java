package Week2;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner num =  new Scanner(System.in);
        System.out.println("Enter the percentage: ");
        int gpa1 = num.nextInt();
        double gpa = (double) gpa1/100*4;
        System.out.printf("GPA:%.0f", gpa);



    }
}
