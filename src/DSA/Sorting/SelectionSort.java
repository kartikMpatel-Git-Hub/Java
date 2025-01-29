public class SelectionSort {
    public static void swap(int num[],int to,int from){
        int temp = num[to];
        num[to] = num[from];
        num[from] = temp;
    }
    public static void BubbleSort(int num[]){
        for(int i = 0; i < num.length - 1; i++){
            int max = i;
            for(int j = i + 1; j < num.length;  j++){
                if(num[j] < num[max])
                    max = j;
            }
            swap(num, i, max);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-5,-1,0};
        BubbleSort(arr);
        for(int a : arr)
            System.out.println(a);
    }
}
