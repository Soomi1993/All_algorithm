package problem1to10;

/**
 *
 There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 Example 1:

 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0

 Example 2:

 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5

 */
public class Four_Median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int mid = (nums1.length+nums2.length)/2;
        if((nums1.length+nums2.length)%2 == 0){
            // even number
            double val = findKth(nums1,0,nums2,0,mid)+findKth(nums1,0,nums2,0,mid+1);
            return val/2.0;
        }else {
            return findKth(nums1,0,nums2,0,mid+1);
        }
    }
    private double findKth(int[] A,int startA,int[] B,int startB,int kth){
        if(startA>=A.length){
            return B[startB + kth -1];
        }
        if(startB>=B.length){
            return A[startA + kth -1];
        }
        if(kth == 1){
            return Math.min(A[startA],B[startB]);
        }
        int valA,valB;
        if(startA + kth/2 -1<A.length){
            valA = A[startA + kth/2 -1];
        }else {
            valA = Integer.MAX_VALUE;
        }

        if(startB + kth/2 -1 <B.length){
            valB = B[startB + kth/2 -1];
        }else{
            valB = Integer.MAX_VALUE;
        }

        if(valA<valB){
            return findKth(A,startA+kth/2,B,startB,kth - kth/2);
        }else {
            return findKth(A,startA,B,startB+kth/2,kth-kth/2);
        }

    }




    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int [] arr2 = {5,6,7,8};
        Four_Median_of_two_sorted_arrays obj = new Four_Median_of_two_sorted_arrays();
        double result =obj.findMedianSortedArrays(arr1,arr2);
        System.out.println(result);
    }
}
