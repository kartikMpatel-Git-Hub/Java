public class CyclicSort {

    static void swap(int nums[],int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    static void CyclicSort(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,5,2,4,3};
        CyclicSort(arr);
        for(int a : arr)
            System.err.println(a);
    }
}
