import java.util.*;

public class Index {
    public static boolean helperCheck(int[][] bounds,int[] range,int idx,int prev){
        if(idx == bounds.length)
            return true;

        for(int i = bounds[idx][0]; i < bounds[idx][1]; i++){
            if(range[idx-1] == (i - prev)){
                if(helperCheck(bounds,range,idx+1,i)){
                    return true;
                }
            }
        }
        return false;
    }
    public static int helper(int[][] bounds,int[] range){
        int count = 0;
        for(int i = bounds[0][0]; i < bounds[0][1]; i++){
            if(count == 0)
                count = 1;
            if(helperCheck(bounds,range,1,i))
                count++;
        }
        return count;
    }

    public static int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
        int[] range = new int[n];
        int idx = 0;
        for(int i = 1; i < n; i++){
            range[idx++] = original[i] - original[i-1];
        }

        return helper(bounds,range);
    }
    public static void main(String[] args) {
        int[] original = {1,2,3,4};
//        int[][] bounds = {{1,2},{2,3},{3,4},{4,5}};
        int[][] bounds = {{1,10},{2,9},{3,8},{4,7}};

        System.out.println(countArrays(original,bounds));
    }
}