package Week3;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();

        //int originalNumber = 1;
        for (int i = 1; i <= 100; i++) {
            int multiple = i * a;
            System.out.print(multiple +","+" ");

        }
    }

}
