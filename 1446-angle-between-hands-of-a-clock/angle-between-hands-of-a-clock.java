class Solution {
    public double angleClock(int hour, int minutes) {
        double min_angle = 6 * minutes;
        double hour_angle = 30 * hour + 0.5 * minutes;
        double diff = Math.abs(min_angle - hour_angle);

        return Math.min(diff, 360-diff);
    }
}