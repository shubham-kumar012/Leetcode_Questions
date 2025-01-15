// Q.2037 Easy
// Leetcode - https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

// T.C. - O(nlogn)
// S.C. - O(1)
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for(int i = 0; i < students.length; i++) {
            moves += Math.abs(seats[i] - students[i]);
        }

        return moves;
    }
}
