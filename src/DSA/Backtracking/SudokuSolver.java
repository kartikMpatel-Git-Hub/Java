package Backtracking;

public class SudokuSolver {

    static boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean isEmpty = true;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == '0'){
                    row = i;
                    col = j;
                    isEmpty = false;
                    break;
                }
            }
            if(isEmpty == false){
                break;
            }
        }
        if(isEmpty){
            return true;
        }
        for(char i = '1'; i <= '9'; i++){
            System.out.println(i);
            if(isPossibe(board,row,col,i)){
                board[row][col] = i;
                if(solve(board)){
                    return true;
                }
                else {
                    board[row][col] = '0';
                }
            }
        }
        return false;
    }
        private static void display(char[][] board) {
            for(char[] row : board) {
                for(char num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    static boolean isPossibe(char[][] board,int row,int col,char num){
//        if(board[row][col] == num){
//            return false;
//        }
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num)
                return false;
        }
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == num)
                return false;
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for(int i = startRow; i < startRow+3; i++){
            for(int j = startCol; j < startCol+3; j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = new char[][]{
                {'5', '2', '0', '0', '0', '0', '0', '0', '0'},
                {'3', '0', '6', '5', '0', '8', '4', '0', '0'},
                {'0', '8', '7', '0', '0', '0', '0', '3', '1'},
                {'0', '0', '3', '0', '1', '0', '0', '8', '0'},
                {'9', '0', '0', '8', '6', '3', '0', '0', '5'},
                {'0', '5', '0', '0', '9', '0', '6', '0', '0'},
                {'1', '3', '0', '0', '0', '0', '2', '5', '0'},
                {'0', '0', '0', '0', '0', '0', '0', '7', '4'},
                {'0', '0', '5', '2', '0', '6', '3', '0', '0'}
        };

        if(solve(board)){
            display(board);
        }
        else {
            System.out.println("Not Solve");
        }
    }
}
