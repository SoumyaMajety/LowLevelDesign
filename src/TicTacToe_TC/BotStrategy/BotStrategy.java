package TicTacToe_TC.BotStrategy;

import TicTacToe_TC.Models.Board;
import TicTacToe_TC.Models.Move;

public interface BotStrategy {
    public Move makeMove(Board b);
}
