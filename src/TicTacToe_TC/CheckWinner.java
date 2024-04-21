package TicTacToe_TC;

import java.util.ArrayList;
import java.util.Scanner;
// brute force approach O(N3)
public class CheckWinner {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int players = 2;
        char [] c = {'@','*'};
         char [][] board = { {'*',0,0},
                            {'@','*','*'},
                            {'@',0,'*'} };
         //int p2count = 0;
         for(int i=0;i<players;i++){
             // searching row
             for(int j=0;j<n;j++){
                 int p1count =0;
                 for(int k=0;k<n;k++){
                     if(board[j][k] == c[i])
                         p1count++;
                     }
                 if(p1count == 3){System.out.println("player "+(i+1)+" is winner");
                 break;}

                 }

             // searching column
             for(int j=0;j<n;j++){
                 int  p1count=0;
                 for(int k=0;k<n;k++){
                     if(board[k][j] == c[i])
                         p1count++;
                 }
                 if(p1count == 3){System.out.println("player "+(i+1)+" is winner");
                 break;}

             }
           // searching diagonal
             int p1count =0;
             for(int j=0;j<n;j++){

                 for(int k=0;k<n;k++){
                     if(j==k && board[j][k] == c[i])
                         p1count++;
                 }
                 }
             if(p1count == 3){System.out.println("player "+(i+1)+" is winner");
                 break;

             }

             }
         }

    }

