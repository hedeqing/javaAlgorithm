package MedianOfTwoSortedArrays;

import java.util.HashSet;

public class Demo {
    public static void main(String[] args) {
        int [] a = {1,2,9};
        int []b = {6,7,8};
        double c = findMedianSortedArrays(a,b);
        System.out.println(c);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0,j = 0;
        double mid;
        int sum = 0;
        double [] num = new double[nums1.length+nums2.length];
        while (i<nums1.length&&j<nums2.length){
            if(nums1[i]<nums2[j]){
                num[sum++] =nums1[i++];

            }else{
                num[sum++] = nums2[j++];

            }
        }
        while (i<nums1.length){
            num[sum++] = nums1[i++];
        }
        while (j<nums2.length){
            num[sum++] = nums2[j++];
        }
        for (double a:num
             ) {
            System.out.println(a);
        }
        if(sum ==1){
            return  num[0];
        }
        else  if(sum%2==0){
            return  (num[sum/2]+num[sum/2-1])/2;
        }else
            return num[(sum-1)/2];
//        int m = nums1.length;
//        int n = nums2.length;
//        if (m > n) { // to ensure m<=n
//            int[] temp = nums1; nums1 = nums2; nums2 = temp;
//            int tmp = m; m = n; n = tmp;
//        }
//        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
//        while (iMin <= iMax) {
//            int i = (iMin + iMax) / 2;
//            int j = halfLen - i;
//            if (i < iMax && nums2[j-1] > nums1[i]){
//                iMin = i + 1; // i is too small
//            }
//            else if (i > iMin && nums1[i-1] > nums2[j]) {
//                iMax = i - 1; // i is too big
//            }
//            else { // i is perfect
//                int maxLeft = 0;
//                if (i == 0) { maxLeft = nums2[j-1]; }
//                else if (j == 0) { maxLeft = nums1[i-1]; }
//                else { maxLeft = Math.max(nums1[i-1], nums2[j-1]); }
//                if ( (m + n) % 2 == 1 ) { return maxLeft; }
//
//                int minRight = 0;
//                if (i == m) { minRight = nums2[j]; }
//                else if (j == n) { minRight = nums1[i]; }
//                else { minRight = Math.min(nums2[j], nums1[i]); }
//
//                return (maxLeft + minRight) / 2.0;
//            }
//        }
//        return 0.0;
    }
}
