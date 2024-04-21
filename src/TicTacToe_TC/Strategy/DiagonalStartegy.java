package TicTacToe_TC.Strategy;

import TicTacToe_TC.Models.Board;
import TicTacToe_TC.Models.Move;
import TicTacToe_TC.Models.Player;
import TicTacToe_TC.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalStartegy implements WinningStrategy{

     HashMap<Symbol,Integer> count = new HashMap<>();
      HashMap<Symbol,Integer> count2 = new HashMap<>();
    @Override
    public boolean checkWinner(Board b, Move m) {

        int row = m.getCell().getRow();
        int col = m.getCell().getColumn();
        Symbol s = m.getPlayer().getSymbol();

        if(row==col){

            if(!count.containsKey(s)){
                count.put(s,0);
            }
            count.put(s,count.get(s)+1);
            return count.get(s) == b.getBoard_size();
        }
        if(row+col == b.getBoard_size()-1){
            if(!count2.containsKey(s)){
                count2.put(s,0);
            }
            count2.put(s,count2.get(s)+1);
            return count2.get(s) == b.getBoard_size();
        }
        return false;
    }

    public void handleUndo(Board b, Move m) {
        int row = m.getCell().getRow();
        int col = m.getCell().getColumn();
        Symbol s = m.getPlayer().getSymbol();
        if(row==col){
            count.put(s,count.get(s)-1);
        }
        if(row+col == b.getBoard_size()){
            count2.put(s,count2.get(s)-1);
        }
    }
}
