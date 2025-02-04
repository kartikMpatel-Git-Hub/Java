//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
package DSA.array;

public class AllocateMinimumPages {

    public static int findPage(int book[],int n){
        if(n > book.length)
            return -1;
        int start = Integer.MIN_VALUE;
        int end = 0;
        int ans = -1;
        for(int i = 0; i < book.length; i++){
            if(book[i] >start){
                start = book[i];
            }
            end += book[i];
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if(isPossible(book,mid,n)){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int book[],int range,int student){

        int currStudent = 1;
        int page = 0;
        for(int i = 0; i < book.length; i++){
            page += book[i];
            if(page > range){
                currStudent++;
                page = book[i];
            }
            if(currStudent > student){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {12, 34, 67, 90};
        int k = 2;
        System.out.println(findPage(arr,k));
    }
}
