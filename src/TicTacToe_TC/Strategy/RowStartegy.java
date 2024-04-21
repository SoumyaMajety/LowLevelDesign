package TicTacToe_TC.Strategy;

import TicTacToe_TC.Models.Board;
import TicTacToe_TC.Models.Move;
import TicTacToe_TC.Models.Player;
import TicTacToe_TC.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class RowStartegy implements WinningStrategy{

    Map<Integer, HashMap<Symbol,Integer>> count = new HashMap<>();
    @Override
    public boolean checkWinner(Board b, Move m) {

        int row = m.getCell().getRow();
        Symbol symbol = m.getPlayer().getSymbol();
        if(!count.containsKey(row)){
            count.put(row,new HashMap<>());
        }

        HashMap<Symbol,Integer> hm = count.get(row);
        if(!hm.containsKey(symbol)){
            hm.put(symbol,0);
        }
        hm.put(symbol,hm.get(symbol)+1);

        return hm.get(symbol) == b.getBoard().size();
    }

    @Override
    public void handleUndo(Board b, Move m) {
        int row = m.getCell().getRow();
        Symbol s = m.getPlayer().getSymbol();
        Map<Symbol,Integer> mp = count.get(row);
        mp.put(s,mp.get(s)-1);
    }
}
