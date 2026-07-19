// Time complexity - O(n)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/

class Solution {
    public boolean isChar(char c) {
        if(c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    public boolean isSymbol(char c) {
        String s = "!@#$%^&*()";
        if(s.indexOf(c) == -1) {
            return false;
        }
        return true;
    }

    public String reverseByType(String s) {
        int n = s.length();

        char[] arr = s.toCharArray();

        int ch1 = 0, ch2 = n-1, sym1 = 0, sym2 = n-1;
        
        while(ch1 <= ch2) {
            if(!isChar(arr[ch1])) {
                ch1++;
                continue;
            }
            if(!isChar(arr[ch2])) {
                ch2--;
                continue;
            }

            if(isChar(arr[ch1]) && isChar(arr[ch2])) {
                char temp = arr[ch1];
                arr[ch1] = arr[ch2];
                arr[ch2] = temp;
                ch1++;
                ch2--;
            }
        }

        while(sym1 <= sym2) {
            if(!isSymbol(arr[sym1])) {
                sym1++;
                continue;
            }
            if(!isSymbol(arr[sym2])) {
                sym2--;
                continue;
            }

            if(isSymbol(arr[sym1]) && isSymbol(arr[sym2])) {
                char temp = arr[sym1];
                arr[sym1] = arr[sym2];
                arr[sym2] = temp;
                sym1++;
                sym2--;
            }
        }


        return new String(arr);
    }
}
