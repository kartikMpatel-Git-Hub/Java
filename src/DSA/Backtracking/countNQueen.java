package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class countNQueen {
    public static boolean isPossible(boolean[][] board,int row,int col){

        for(int i = 0; i < row; i++){
            if(board[i][col]){
                return false;
            }
        }

        int leftMin = Math.min(row,col);
        for(int i = 1; i <= leftMin; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        int rightMin = Math.min(row,board.length - col - 1);
        for(int i = 1; i <= rightMin; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
    public static int Nqueens(boolean[][] board,int row){
        if(row == board.length){
            return 1;
        }
        int count = 0;
        for(int col = 0; col < board.length; col++){
            if(isPossible(board,row, col)){
                board[row][col] = true;
                count += Nqueens(board,row+1);
                board[row][col] = false;
            }
        }

        return count;
    }
    public static int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return Nqueens(board,0);
    }
    public static void main(String[] args) {
        System.out.println(totalNQueens(5));
    }
}
