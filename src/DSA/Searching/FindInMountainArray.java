//package DSA.Searching;
//
//public class FindInMountainArray {
//    /**
//     * // This is MountainArray's API interface.
//     * // You should not implement it, or speculate about its implementation
//     * interface MountainArray {
//     *     public int get(int index) {}
//     *     public int length() {}
//     * }
//     */
/*
        * (This problem is an interactive problem.)

        You may recall that an array arr is a mountain array if and only if:

        arr.length >= 3
        There exists some i with 0 < i < arr.length - 1 such that:
        arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
        arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
        Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

        You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

        MountainArray.get(k) returns the element of the array at index k (0-indexed).
        MountainArray.length() returns the length of the array.
        Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
* */
//    public static int findInMountainArray(int target, MountainArray mountainArr) {
//            int left = 0;
//            int n =  mountainArr.length();
//            int right = n-1;
//            int mid = -1;
//            while(left <= right){
//                mid = left + (right - left)/2;
//                int val = mountainArr.get(mid);
//                if(mid != 0 && mid != n-1 && val > mountainArr.get(mid-1) && val > mountainArr.get(mid+1)){
//                    if(val == target)
//                        return mid;
//                    break;
//                }
//                else if(mid != n-1 && val < mountainArr.get(mid+1))
//                    left = mid + 1;
//                else
//                    right = mid - 1;
//            }
//            int peak = mid;
//            left = 0;
//            right = peak;
//            while(left <= right){
//                mid = left + (right - left)/2;
//                int val = mountainArr.get(mid);
//                if(val == target)
//                    return mid;
//                else if(val > target)
//                    right = mid - 1;
//                else
//                    left = mid + 1;
//            }
//            //Decrease
//            left = peak+1;
//            right = mountainArr.length()-1;
//            while(left <= right){
//                mid = left + (right - left)/2;
//                int val = mountainArr.get(mid);
//                if(val == target)
//                    return mid;
//                else if(val < target)
//                    right = mid - 1;
//                else
//                    left = mid + 1;
//            }
//
//            return -1;
//        }
//}
