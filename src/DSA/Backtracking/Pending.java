//package DSA.Backtracking;
//
///  Problem 1765
//public class Pending {
//    class Solution {
//
//        public static int backTrack(int[][] water,boolean[][] vali,boolean[][] path,int row,int col,int count){
//            if(path[row][col]){
//                return Integer.MAX_VALUE;
//            }
//            if(vali[row][col]){
//                return count;
//            }
//            if(water[row][col] != 0){
//                return count + water[row][col];
//            }
//            path[row][col] = true;
//            int min = Integer.MAX_VALUE;
//            if(row - 1 >= 0){
//                min = Math.min(min,backTrack(water,vali,path,row-1,col,count+1));
//            }
//            if(col - 1 >= 0){
//                min = Math.min(min,backTrack(water,vali,path,row,col-1,count+1));
//            }
//            if(row + 1 < water[0].length){
//                min = Math.min(min,backTrack(water,vali,path,row+1,col,count+1));
//            }
//            if(col + 1 < water[0].length){
//                min = Math.min(min,backTrack(water,vali,path,row,col+1,count+1));
//            }
//            path[row][col] = false;
//            return min;
//        }
//        public int[][] highestPeak(int[][] isWater) {
//            int m = isWater.length;
//            int n = isWater[0].length;
//            boolean[][] vali = new boolean[m][n];
//            boolean[][] path = new boolean[m][n];
//            for(int i = 0; i < m; i++){
//                for(int j = 0; j < n; j++){
//                    if(isWater[i][j] == 1)
//                        vali[i][j] = true;
//                }
//            }
//            for(int i = 0; i < m; i++){
//                for(int j = 0; j < n; j++){
//                    if(!vali[i][j])
//                        isWater[i][j] = backTrack(isWater,vali,path,i,j,0);
//                }
//            }
//            for(int i = 0; i < m; i++){
//                for(int j = 0; j < n; j++){
//                    if(vali[i][j])
//                        isWater[i][j] = 0;
//                }
//            }
//            return isWater;
//        }
//    }
//}
