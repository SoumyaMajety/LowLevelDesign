package TicTacToe_TC.Strategy;

import TicTacToe_TC.Models.Board;
import TicTacToe_TC.Models.Move;
import TicTacToe_TC.Models.Player;

public interface WinningStrategy {
    public boolean checkWinner(Board b, Move m);

    public void handleUndo(Board b, Move m);
}
