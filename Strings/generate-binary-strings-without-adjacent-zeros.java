// Q. 3211 Medium
// T.C. => O(n * C^n)     C(no. of valid strings)
// S.C. => O(n)

class Solution {
    public List<String> validStrings(int n) {
        List<String> res = new ArrayList<>();
        generateBinaryString("", n, res);

        return res;
    }

    private void generateBinaryString(String ans, int n, List<String> res) {
        if(ans.length() == n) {
            res.add(ans);
            return;
        }

        // choice 0
        if(ans.length() == 0 || ans.charAt(ans.length()-1) == '1') {
            generateBinaryString(ans + "0", n, res);
        }
        // choice 1
        generateBinaryString(ans + "1", n, res); 
    }
}
