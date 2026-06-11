class Solution {
    public boolean validDigit(int n, int x) {
        String k = String.valueOf(n);
        String l = String.valueOf(x);
        boolean g = (l.charAt(0)!=k.charAt(0));
        boolean u = k.contains(l);
        boolean m = u && g;
        return m;
    }
}
