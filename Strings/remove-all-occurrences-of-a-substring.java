// Q.1910 Medium
// Leetcode - https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/


class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length(); // string length
        int m = part.length(); // part length

        StringBuilder sb = new StringBuilder(s);

        // Method 1 - Checking each character manually
        // T.C. -> O(n/m * n) => O(n^2/m)  ----- if m is small so, O(n^2)
        // S.C. -> O(n)
        boolean changed = true;
        while(changed) { // O(n/m) -> in worst case per iteration sb decrease by length m
            changed = false;

            for(int i=0; i <= sb.length()-m; i++) { // it ensure the string can be matched // O(n)
                int k = i; // for every match it increase
                int j = 0; // iterator for part

                while(j < m && sb.charAt(k) == part.charAt(j)) { // O(m)
                    k++;
                    j++;
                }

                if(j == m) {// it means all part match are found
                    sb.delete(i, i+m);
                    changed = true;
                    break;
                }
            }
        }

      
        // Method 2 - With built-In method
        // T.c. -> O(n*m + n) =>(approx) O(n*m) 
        // S.C. -> O(n)
        // while(sb.indexOf(part) != -1) { // O(n*m)
        //     int idx = sb.indexOf(part); // O(n)
        //     sb.delete(idx, idx + part.length());
        // }

        return sb.toString();
    }
}
