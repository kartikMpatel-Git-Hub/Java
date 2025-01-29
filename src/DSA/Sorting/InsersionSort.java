public class InsersionSort {

    public static void swap(int num[],int to,int from){
        int temp = num[to];
        num[to] = num[from];
        num[from] = temp;
    }
    public static void InsersionSort(int num[]){
        for(int i = 0; i < num.length - 1; i++){
            for(int j = i + 1; j > 0; j--){
                if(num[j] < num[j - 1])
                    swap(num,j,j-1);
                else
                    break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,4};
        InsersionSort(arr);
        for(int a : arr)
            System.out.println(a);
    }
}
