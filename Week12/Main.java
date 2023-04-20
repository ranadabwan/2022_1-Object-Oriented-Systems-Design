package Week12;
import java.util.ArrayList;
import java.util.Scanner;

import static Week12.Eratos.sieve;

//public class Main {
public class Main {
    public static void main(String args[]) {
        // initialize a scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Input max number: ");
        int num = s.nextInt();

        ArrayList<Integer> nums = sieve(num);
        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
        }

        System.out.println();
    }
}