package Solution;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] first = {1, 2, 3};
        int[] second = {4, 5, 6, 7};
        findMedianSortedArrays(first, second);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        int[] result = new int[nums1Length + nums2Length];

        System.arraycopy(nums1, 0, result, 0, nums1Length);
        System.arraycopy(nums2, 0, result, nums1Length, nums2Length);

        Arrays.sort(result);
        double finalResult;
        if (result.length % 2 != 0) {
            finalResult = result[result.length / 2];
        } else {
            int mid1 = result[result.length / 2 - 1];
            int mid2 = result[result.length / 2];
            finalResult = (double) (mid1 + mid2) / 2;
        }
        return finalResult;
    }
}
