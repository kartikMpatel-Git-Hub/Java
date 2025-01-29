//package DSA.Backtracking;
/// leetcode 2658
//public class MaxNumberFishInGrid {
//    class Solution {
//        public static int helper(int[][] grid,boolean[][] path,int row,int col,int fish){
//            if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || path[row][col] || grid[row][col] == 0){
//                return fish;
//            }
//            path[row][col] = true;
//            int[][] direction = {
//                    {0,1},
//                    {0,-1},
//                    {1,0},
//                    {-1,0}
//            };
//            int ans = 0;
//            fish += grid[row][col];
//
//            for(int dir[] : direction){
//                int r = row + dir[0];
//                int c = col + dir[1];
//                ans = Math.max(ans,helper(grid,path,r,c,fish));
//            }
//            path[row][col] = false;
//            return ans;
//        }
//        public int findMaxFish(int[][] grid) {
//            int m = grid.length;
//            int n = grid[0].length;
//            int fishes = 0;
//            boolean[][] path = new boolean[m][n];
//            for(int i = 0; i < m; i++){
//                for(int j = 0; j < n; j++){
//                    if(grid[i][j] != 0){
//                        fishes = Math.max(fishes,helper(grid,path,i,j,0));
//                    }
//                }
//            }
//
//            return fishes;
//        }
//    }
//}
