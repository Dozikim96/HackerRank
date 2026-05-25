class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merge = new int[m + n];
        System.arraycopy(nums1, 0, merge, 0, m);
        System.arraycopy(nums2, 0, merge, m, n);

        Arrays.sort(merge);

        int k = merge.length;
        double medium;

        if(k%2 == 0){
           medium = (merge[k/2 - 1] + merge[k/2]) / 2.0;
        }else
            medium = merge[k/2];
        
        return medium;        
    }
}
