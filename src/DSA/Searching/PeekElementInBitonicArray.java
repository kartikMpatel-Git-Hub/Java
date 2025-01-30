package DSA.Searching;
/*
* You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
* */
public class PeekElementInBitonicArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] > arr[mid + 1])
                right = mid;
            else
                left = mid + 1;
        }

        return arr[right];//It Return Element
//        return right;//It Return Index
    }

    public static void main(String[] args) {
        int[] arr = {0,3,2,1};
//        [0,10,5,2]
        System.out.println(peakIndexInMountainArray(arr));
    }
}
