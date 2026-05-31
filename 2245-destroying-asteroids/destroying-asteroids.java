class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long curr_mass = mass;
        for(int i = 0; i < asteroids.length; i++){
            if(curr_mass < asteroids[i]) return false;
            curr_mass += asteroids[i];
        }
        return true;
    }
}