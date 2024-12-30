class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        
        List<String> result = new ArrayList<>();
        for(int i=0; i<words.length; i++){
            boolean flag1 = true,flag2 = true,flag3 = true;
            String str = words[i];

            String s = str.toLowerCase();
            for(int j=0; j<s.length(); j++){
                if(flag1 == true && row1.indexOf(s.charAt(j)) < 0){
                    flag1 = false;;
                }
                if(flag2 == true && row2.indexOf(s.charAt(j)) < 0){
                    flag2 = false;
                }
                if(flag3 == true && row3.indexOf(s.charAt(j)) < 0){
                    flag3 = false;
                }
            }
            if(flag1 || flag2 || flag3){
                result.add(str);
            }
        }
        
        // converting the List to Array
        String[] ans = new String[result.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = result.get(i);
        }
        return ans;
    }
}
