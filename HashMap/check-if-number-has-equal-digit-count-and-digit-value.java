// Q.2283 Easy
// Leetcode -> https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/description/

// T.C. -> O(n)
// S.C. -> O(1)
class Solution {
    public boolean digitCount(String nums) {
        int n = nums.length();
        HashMap<Character, Integer> freq = new HashMap<>();

        // Storing frequency of each digit
        for(char num : nums.toCharArray()) {
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }

        for(int i=0; i<n; i++) {
            int canOccur = Character.getNumericValue(nums.charAt(i));
            if(!freq.containsKey((char) ('0' + i))) {
                if(canOccur > 0) {
                    return false;
                }
            }
            else if(!(freq.get((char) ('0' + i)) == canOccur)) {
                return false;
            }   
        }

        return true;
    }
}
