// Q.1108 Easy
// Leetcode - https://leetcode.com/problems/defanging-an-ip-address/description

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public String defangIPaddr(String address) {
        char[] res = new char[address.length()+6];
        int j=0;
        for(int i=0; i<address.length(); i++,j++) {
            if(address.charAt(i)=='.') {
                res[j] = '['; 
                j++;
                res[j] = '.';
                j++;
                res[j] = ']';
            } else {
                res[j] = address.charAt(i);
            }
        }
        return new String(res);
    }
}
