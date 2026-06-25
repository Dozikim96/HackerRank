class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {

        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int prefix = 0;
        int ans = 0;

        for (int num : nums) {
            if (num == target) {
                prefix += 1;
            } else {
                prefix -= 1;
            }
            for (int key : freq.keySet()) {
                if (key < prefix) {
                    ans += freq.get(key);
                }
            }

            freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
        }

        return ans;
    }
}
