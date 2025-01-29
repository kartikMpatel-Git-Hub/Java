class CeilingNumber{


    public static int ans(int num[] , int target){
        // int n = nuum
        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            int mid = left + right / 2;
            if(num[mid] == target){
                // return num[mid % ];
            }
            else if(num[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return num[left];
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,5,6,7,8};
        int tar = 2;
        System.out.println(ans(a,tar));    
    }
}