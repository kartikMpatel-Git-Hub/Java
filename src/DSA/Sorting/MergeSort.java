package DSA.Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergesort(int arr[]){

        if(arr.length == 1)
            return arr;

        int mid = arr.length / 2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    public static int[] merge(int left[],int right[]){
        int arr[] = new int[left.length + right.length];
        int i = 0 , j = 0, k =0;
        while (i < left.length && j < right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }
            else {
                arr[k] = right[j];
                j++;
                k++;
            }
        }
        while (j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
        while (i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }

        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {4,4,3,1,2,1,10};
        int newArr[] = mergesort(arr);

        for(int ele : newArr)
            System.out.println(ele);
//        System.out.println(newArr.toString());
    }
}
