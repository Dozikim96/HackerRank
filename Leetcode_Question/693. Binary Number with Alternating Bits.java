class Solution {
    public boolean hasAlternatingBits(int n) {
        int lastbit = n & 1;
        n >>=1;
        while (n>0){
            int currBit = n&1;
            if (currBit == lastbit){
                return false;
            }
            lastbit = currBit;
            n >>=1;
        }
        return true;
    }
}
