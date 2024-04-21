package TicTacToe_TC.Strategy;

import TicTacToe_TC.Models.Board;
import TicTacToe_TC.Models.Move;
import TicTacToe_TC.Models.Player;
import TicTacToe_TC.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnStrategy implements WinningStrategy{

    Map<Integer, HashMap<Symbol,Integer>> count = new HashMap<>();
    @Override
    public boolean checkWinner(Board b, Move m) {
        int col = m.getCell().getColumn();
    Symbol symbol = m.getPlayer().getSymbol();
        if(!count.containsKey(col)){
        count.put(col,new HashMap<>());
    }

    HashMap<Symbol,Integer> hm = count.get(col);
        if(!hm.containsKey(symbol)){
        hm.put(symbol,0);
    }
        hm.put(symbol,hm.get(symbol)+1);

        return hm.get(symbol) == b.getBoard().size();
    }

    public void handleUndo(Board b, Move m) {
        int col = m.getCell().getColumn();
        Symbol s = m.getPlayer().getSymbol();
        Map<Symbol,Integer> mp = count.get(col);
        mp.put(s,mp.get(s)-1);
    }
}
