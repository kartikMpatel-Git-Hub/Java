package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Nqueen {

    public static void display(List<List<String>> ans,List<String> str,boolean[][] board){
        for(boolean[] row : board){
            String temp = "";
            for(boolean ele : row){
                if(ele){
                    temp += "Q";
                }
                else {
                    temp += ".";
                }
            }
            str.add(temp);
        }
        ans.add(new ArrayList<>(str));
        str.clear();
    }
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
    public static void Nqueens(List<List<String>> ans,List<String> str,boolean[][] board,int row){
        if(row == board.length){
            display(ans,str,board);
            System.out.println();
            return;
        }
        for(int col = 0; col < board.length; col++){
            if(isPossible(board,row, col)){
                board[row][col] = true;
                Nqueens(ans,str,board,row+1);
                board[row][col] = false;
            }
        }
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> str = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        Nqueens(ans,str,board,0);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
}
