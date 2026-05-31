class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        int n = asteroids.length;
        long curMass = mass;
        for(int i=0; i<n; i++){
            if(curMass >= asteroids[i]){
                curMass += asteroids[i];
            }else return false;
        }
        return true;
    }
}
