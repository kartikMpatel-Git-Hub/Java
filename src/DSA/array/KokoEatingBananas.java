/*
*
875. Koko Eating Bananas
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.
* */
package DSA.array;

public class KokoEatingBananas {
    public static boolean isPossible(int piles[],int mid,int h){
        int eatHour = 0;
        for(int i = 0 ; i < piles.length; i++){
            eatHour += piles[i] / mid;
            if(piles[i] % mid != 0){
                eatHour+=1;
            }
            if(eatHour > h){
                return false;
            }
        }

        return true;
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1,ans = -1;
        int end = Integer.MIN_VALUE;
        for(int ele : piles){
            if(end < ele)
                end = ele;
        }

        while(start <= end){
            int mid = start + (end - start)/2;
            if(isPossible(piles,mid,h)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int piles[] = {3,6,7,11}, hour = 8;//piles = [30,11,23,4,20], h = 5
        System.out.println(minEatingSpeed(piles,hour));

    }
}
