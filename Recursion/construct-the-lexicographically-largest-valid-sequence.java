// Q.1718 Medium
// Leetcode - https://leetcode.com/problems/construct-the-lexicographically-largest-valid-sequence/description

// T.C. -> O(n!)
// S.C. -> O(n)
class Solution {

    public boolean solve(int n, int i, int[] result, Set<Integer> used) {
        if(i >= result.length) {
            return true;
        } 

        if(result[i] != 0) {
            return solve(n, i+1, result, used);
        }

        for(int num=n; num>=1; num--) {
            if(used.contains(num)) continue;
            // Try
            used.add(num);
            result[i] = num;

            // Explore
            if(num == 1) {
                if(solve(n, i+1, result, used)) return true;
            } else { // range from 2 to n
                int j = i+result[i];
                if(j < result.length && result[j] == 0) {
                    result[j] = num;
                    if(solve(n, i+1, result, used)) return true;
                    result[j] = 0;
                }
            }

            // Undo
            used.remove(num);
            result[i] = 0;
        }

        return false;
    }
    
    public int[] constructDistancedSequence(int n) {
        int[] result = new int[n*2-1];
        Set<Integer> used = new HashSet<>();

        solve(n, 0, result, used);

        return result;
    }
}
