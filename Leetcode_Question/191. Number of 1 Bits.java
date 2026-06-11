class Solution {
    public int hammingWeight(int n) {
        String Binary = Integer.toBinaryString(n);
        int count = 0;
        for(int i=0; i<Binary.length(); i++){
            if(Binary.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
}
