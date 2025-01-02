// Q.1974 Easy

class Solution {
    public int minTimeToType(String word) {
        char currentLetter = 'a';
        int sum = 0;

        for(int i=0; i<word.length(); i++) {
            char targetLetter = word.charAt(i);

            int distance = Math.abs(targetLetter - currentLetter);
            sum += Math.min(distance, 26 - distance);    

            // update the current letter
            currentLetter = word.charAt(i);
        }

        return sum+word.length();
    }
}
