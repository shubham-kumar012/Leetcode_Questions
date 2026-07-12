// Time Complexity - O(1)
// Space Complexity - O(1)/
// Leetcode - https://leetcode.com/problems/number-of-elapsed-seconds-between-two-times/

class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int[] stTime = Arrays.stream(startTime.split(":")).mapToInt(Integer::parseInt).toArray();
        int[] enTime = Arrays.stream(endTime.split(":")).mapToInt(Integer::parseInt).toArray();

        int totalSecondsStart = (stTime[0]*3600) + (stTime[1]*60) + stTime[2];
        int totalSecondsEnd = (enTime[0]*3600) + (enTime[1]*60) + enTime[2];

        return totalSecondsEnd - totalSecondsStart;
        
    }
}
