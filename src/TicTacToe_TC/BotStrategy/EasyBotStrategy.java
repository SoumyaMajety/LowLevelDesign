package TicTacToe_TC.BotStrategy;

import TicTacToe_TC.Models.Board;
import TicTacToe_TC.Models.CELL_STATE;
import TicTacToe_TC.Models.Cell;
import TicTacToe_TC.Models.Move;

import java.util.List;

public class EasyBotStrategy implements BotStrategy{

    public Move makeMove(Board b){

        for(List<Cell> row : b.getBoard()){
            for(Cell c : row){
                if(c.getCell_state().equals(CELL_STATE.EMPTY)){
                    return new Move(c,null);
                }
            }
        }
        return null;
    }

}
