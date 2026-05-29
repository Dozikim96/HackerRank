class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int ele : nums){
            int sum = 0;
            int temp = ele;

            while(temp>0){
                sum += temp%10;
                temp /= 10;
            }
            min = Math.min(min, sum);  
        }
        return min;
    }
}
