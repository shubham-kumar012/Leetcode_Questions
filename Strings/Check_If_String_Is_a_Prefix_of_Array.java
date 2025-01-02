// Q.1961 Easy
// T.C. -> O(n^2)
// S.C. -> O(n)

class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        boolean flag = false;
        StringBuilder sb = new StringBuilder("");
        for(String word : words) {
            sb.append(word);
            if(sb.toString().equals(s)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
