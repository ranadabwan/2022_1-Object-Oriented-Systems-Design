package HW1;

import java.util.Scanner;

public class Main {

    public static String getRankString(int rank) {
        if (rank == 1)
            return "1st Place";
        else if (rank == 2)
            return "2nd Place";
        else if (rank == 3)
            return "3rd Place";
        else
            return rank + "th Place";
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        LotteryGenerator generator = new LotteryGenerator();
        while (true) {
            System.out.print("<< ");
            int N = myObj.nextInt(); // Read user input
            if (N == 0) {
                System.out.println(">> End of program");
                break;
            } else {
                int winningNumber[] = generator.generateWinningNumber();
                System.out.print(">> Round Winning number : ");
                for (int i = 0; i < 7; i++) {
                    System.out.print(winningNumber[i] + " ");
                    if (i == 5)
                        System.out.print("+ ");
                }
                System.out.print("\n");
                for (int i = 0; i < N; i++) {
                    int lotteryNumber[] = generator.generateTicketSequence();
                    System.out.print(">> Lottery number : ");
                    for (int j = 0; j < 6; j++) {
                        System.out.print(lotteryNumber[j] + " ");
                    }
                    int rank = LotteryChecker.checkRank(winningNumber, lotteryNumber);
                    System.out.print(rank == 0 ? "Lose" : "Winner ");
                    if (rank != 0)
                        System.out
                                .println("(" + getRankString(rank) + ")");
                }
            }
        }
        myObj.close();
    }
    }

