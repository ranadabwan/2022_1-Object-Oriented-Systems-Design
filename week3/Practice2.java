package Week3;
import java.util.Scanner;
import java.util.Random;

public class Practice2 {
    public static void main(String[] args) {
        // Getting input from the user
        Scanner scanner = new Scanner(System.in);

        //System.out.println("Make a move! (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        // Getting input from the computer
        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0) {
            computerMove = "rock";
        } else if (randomNumber == 1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer's choice : " + computerMove);

        if (playerMove.equals(computerMove)) {
            System.out.println("It's a tie!");
        } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) || (playerMove.equals("scissors") && computerMove.equals("paper")) || (playerMove.equals("paper") && computerMove.equals("rock"))) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }


}