// Q.1769 Medium

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int res[] = new int[n];

        int cumValue = 0;
        int cumValueSum = 0;
        // Find moves to all left balls to index i
        for(int i = 0; i < n; i++) {
            res[i] = cumValueSum;

            cumValue += boxes.charAt(i) == '0' ? 0 : 1;

            cumValueSum += cumValue;
        }

        cumValue = 0;
        cumValueSum = 0;
        
        // Find moves to all right balls to index i
        for(int i = n-1; i >= 0; i--) {
            res[i] += cumValueSum;

            cumValue += boxes.charAt(i) == '0' ? 0 : 1;

            cumValueSum += cumValue;
        }

        return res;
    }
}
