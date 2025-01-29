public class BubbleSort {
    public static void swap(int num[],int to,int from){
        int temp = num[to];
        num[to] = num[from];
        num[from] = temp;
    }
    public static void BubbleSort(int num[]){
        boolean flag = true;
        for(int i = 0; i < num.length - 1 && flag; i++){
            flag = false;
            for(int j = 0; j <num.length - 1 - i;  j++){
                if(num[j] > num[j+1])
                    swap(num, j, j+1);
                flag = true;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {-5,0,5};
        BubbleSort(arr);
        for(int a : arr)
            System.out.println(a);
    }
}