class Solution {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        for(int i=1;i<n;i++){
            char c=word.charAt(i);
            if(!Character.isUpperCase(c)) 
            return false;
        }
        return true;
    }
}
