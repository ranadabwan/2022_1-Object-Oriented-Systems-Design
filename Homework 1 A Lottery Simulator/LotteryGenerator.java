package HW1;

import java.util.*;

public class LotteryGenerator {

    Random rand = new Random();

    private int generateRandomNumber(int minRange, int maxRange) {
        int value = rand.nextInt(maxRange - minRange) + minRange;
        return value;
    }

    public int[] generateWinningNumber() {
        int winningNumber[] = new int[7];
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10));
        int ptr = 0;
        while (ptr != 7) {
            int randomIndex = generateRandomNumber(0, numbers.size() - 1);
            winningNumber[ptr] = numbers.get(randomIndex);
            numbers.remove(randomIndex);
            ptr++;
        }
        return winningNumber;
    }

    public int[] generateTicketSequence() {
        int ticketSequence[] = new int[6];
        List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9, 10));
        int ptr = 0;
        while (ptr != 6) {
            int randomIndex = generateRandomNumber(0, numbers.size() - 1);
            ticketSequence[ptr] = numbers.get(randomIndex);
            numbers.remove(randomIndex);
            ptr++;
        }
        return ticketSequence;
    }
}
