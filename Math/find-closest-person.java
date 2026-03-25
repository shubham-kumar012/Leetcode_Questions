class Solution {
    public int findClosest(int x, int y, int z) {
        int timeX = Math.abs(z - x);
        int timeY = Math.abs(z - y);

        if(timeX == timeY) return 0;

        return (timeX > timeY) ? 2 : 1;
    }
}
