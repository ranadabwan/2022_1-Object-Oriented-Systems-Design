package Week2;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter two numbers:\n");
        double num1 = num.nextInt();
        double num2 = num.nextInt();

        System.out.println("dividend:"+ num1 + " divisor:" + num2 + " quotient:" + num1/num2 + " remainder:" + num1%num2) ;
        System.out.println("Yay lessgo");


    }
}
