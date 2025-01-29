package Backtracking;

import java.util.ArrayList;

public class Meze {

    public static int countMezeFor(int row,int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = countMezeFor(row-1,col);
        int right = countMezeFor(row,col-1);

        return left + right;
    }
    public static void pathForMaze(ArrayList<Character> ans, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(ans);
            return;
        }
        if(row > 1){
            ans.add('D');
            pathForMaze(ans,row-1,col);
            ans.remove(ans.size()-1);
        }
        if(col > 1){
            ans.add('R');
            pathForMaze(ans,row,col-1);
            ans.remove(ans.size()-1);
        }
    }
    public static void  pathForMazeBackTrackAllSide(String path,boolean[][] maze,int row,int col){
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(path);
//            path.clear();
            return;
        }
        if(maze[row][col]){
            return;
        }
        maze[row][col] = true;
//        System.out.println(maze.length);
        if(row < maze.length-1){
//            path.add('D');
            pathForMazeBackTrackAllSide(path+"D",maze,row+1,col);
//            path.remove(path.size()-1);
        }
        if(col < maze[0].length-1){
//            path.add('R');
            pathForMazeBackTrackAllSide(path+"R",maze,row,col+1);
//            path.remove(path.size()-1);
        }
        if(row > 0){
//            path.add('U');
            pathForMazeBackTrackAllSide(path+"U",maze,row-1,col);
//            path.remove(path.size()-1);
        }
        if(col > 0){
//            path.add('L');
            pathForMazeBackTrackAllSide(path+"L",maze,row,col-1);
//            path.remove(path.size()-1);
        }
        maze[row][col] = false;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] maze = new boolean[row][col];
//        System.out.println(maze[0][0]);
//        System.out.println(countMezeFor(row ,col));
        pathForMazeBackTrackAllSide(new String(),maze,0,0);
//        pathForMaze( new ArrayList<>(),row,col);
    }
}
