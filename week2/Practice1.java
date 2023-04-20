package Week2;
import java.util.Scanner;
import java.util.*;
class Practice1 {
    public static void main(String[] args) {

        System.out.println("Enter three words separated with a comma:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(word, ",");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken()); }


    }
}
