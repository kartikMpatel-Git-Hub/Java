package DSA.Searching;

public class IsBitonicArray {
    public static boolean validMountainArray(int[] arr) {
        int idx = 0;
        int n = arr.length;
        while(idx < n-1){
            if(arr[idx] < arr[idx+1])
                idx++;
            else
                break;
        }
        if(idx == 0 || idx == (n-1))
            return false;

        while(idx < n-1){
            if(arr[idx] > arr[idx+1])
                idx++;
            else
                break;
        }

        return (idx == (n-1));
    }

    public static void main(String[] args) {
//        2,1
        int[] arr = {0,3,2,1};

        System.out.println(validMountainArray(arr));
    }
}
