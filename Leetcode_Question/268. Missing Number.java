class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int EXP = n*(n+1)/2;
        int ACT = 0;
        for(int i=0; i<n; i++){
            ACT += nums[i];
        }
        return EXP - ACT;
    }
}
