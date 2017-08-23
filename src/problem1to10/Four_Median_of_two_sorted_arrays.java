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

        if(nums1.length<=0){
            return arrMid(nums2);
        }
        if(nums2.length<=0){
            return arrMid(nums1);
        }
        // 1.rename
        int[] small;
        int[] large;
        if(nums1[nums1.length-1]<nums2[nums2.length-1]){
            small = nums1;
            large = nums2;
        }else {
            small=nums2;
            large=nums1;
        }




        return 0;
    }
    private double findKth(int[] arr1,int[] arr2,int kth){
        return 0;
    }


    private double arrMid(int[] arr){
        if(arr.length%2==0){
            //ou shu
            return (arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }else {
            return arr[arr.length/2];
        }
    }

    public static void main(String[] args) {



    }
}
