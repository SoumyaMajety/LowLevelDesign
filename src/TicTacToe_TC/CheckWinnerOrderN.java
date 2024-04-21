package TicTacToe_TC;

public class CheckWinnerOrderN {
    public static void main(String[] args){
        int n= 3;
        int players = 2;
        int row = 0; int column = 0;
        char [] c = {'@','*'};
        char [][] board = { {'@',0,0},
                           {'@','*','*'},
                            {'@',0,'*'} };
        // search row
        int count =0;
        for(int i=0;i<n;i++){
            if(c[0]==board[row][i]){
                count++;
            }
        }
        if(count==3){System.out.println("player 1 is winner");}

        count =0;
        for(int i=0;i<n;i++){
            if(c[0]==board[i][column])
                count++;
        }
        if(count==3){System.out.println("player 1 is winner");}
    }
}
