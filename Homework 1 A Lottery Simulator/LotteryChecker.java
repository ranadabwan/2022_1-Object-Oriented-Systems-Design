package HW1;

import java.util.HashSet;

public class LotteryChecker {

    static public int checkRank(int winningNumber[], int ticketSequence[]) {
        HashSet<Integer> winningTicketNumbers = new HashSet<Integer>();
        HashSet<Integer> ticketSequenceNumbers = new HashSet<Integer>();
        for (int i = 0; i < 6; i++)
            winningTicketNumbers.add(winningNumber[i]);
        for (int i = 0; i < 6; i++)
            ticketSequenceNumbers.add(ticketSequence[i]);
        winningTicketNumbers.retainAll(ticketSequenceNumbers); // the intersection between the two sets
        int common = winningTicketNumbers.size();
        if (common == 6)
            return 1;
        else if (common == 5) {
            for (int i = 0; i < 6; i++) {
                if (!winningTicketNumbers.contains(ticketSequence[i])) {
                    if (ticketSequence[i] == winningNumber[6])
                        return 2;
                    return 3;
                }
            }
        } else if (common == 4)
            return 4;
        else if (common == 3)
            return 5;
        return 0;
    }
}
