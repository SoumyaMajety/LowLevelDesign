package TicTacToe_TC.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int board_size;
    private  List<List<Cell>> board;

    public Board(int size){
        board = new ArrayList<>();
        board_size = size;
        for(int i=0;i<size;i++){
                board.add(new ArrayList<>());
            for(int j=0;j<size;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void printBoard(){
        // toDO
         for(List<Cell> c : board){
             for(Cell c1 : c){
                 c1.printCell();
             }
             System.out.println();
         }
    }

    public int getBoard_size() {
        return board_size;
    }

    public void setBoard_size(int board_size) {
        this.board_size = board_size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
