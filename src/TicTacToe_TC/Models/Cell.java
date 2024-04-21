package TicTacToe_TC.Models;

public class Cell {
    private int row;
    private int column;
    private CELL_STATE cell_state;
    private Player player;

    public Cell(int row, int column){
        this.row = row;
        this.column = column;
        this.cell_state = CELL_STATE.EMPTY;
        this.player = null;
    }

    public void printCell( ){
                if(player == null){
                    System.out.print("| - |");
                }
                else {
                    System.out.print("| "+player.getSymbol().getSymbol()+" |");
                }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public CELL_STATE getCell_state() {
        return cell_state;
    }

    public void setCell_state(CELL_STATE cell_state) {
        this.cell_state = cell_state;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


}
