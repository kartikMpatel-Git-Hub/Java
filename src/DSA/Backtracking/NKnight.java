package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NKnight {

    static int nknight(boolean[][] board,int row,int col,int knight){
        if(knight == 0){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        if(row == board.length - 1 && col == board.length){
            return count;
        }
        if(col == board.length){
            count += nknight(board,row+1,0,knight);
            return count;
        }
        if(isValid(board,row,col)){
            board[row][col] = true;
            count += nknight(board,row,col+1,knight-1);
            board[row][col] = false;
        }
        count += nknight(board,row,col+1,knight);
        return count;
    }

    static boolean check(boolean[][] board,int row,int col){
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        if(check(board,row-2,col-1)){
            if(board[row-2][col-1])
                return false;
        }
        if(check(board,row-2,col+1)){
            if(board[row-2][col+1])
                return false;
        }
        if(check(board,row+2,col-1)){
            if(board[row+2][col-1])
                return false;
        }
        if(check(board,row+2,col+1)){
            if(board[row+2][col+1])
                return false;
        }

        //Horizontal
        if(check(board,row-1,col+2)){
            if(board[row-1][col+2])
                return false;
        }
        if(check(board,row-1,col-2)){
            if(board[row-1][col-2])
                return false;
        }
        if(check(board,row+1,col+2)){
            if(board[row+1][col+2])
                return false;
        }
        if(check(board,row+1,col-2)){
            if(board[row+1][col-2])
                return false;
        }

        return true;
    }

    public static void display(boolean[][] board){
        for(boolean[] row : board){
            for(boolean ele : row){
                if(ele){
                    System.out.print('K');
                }
                else {
                    System.out.print('X');
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nknight(board,0,0,8));

    }
}
