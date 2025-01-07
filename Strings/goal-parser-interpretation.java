// Q.1678 Easy

// T.C. -> O(n)
// S.C. -> O(n)
class Solution {
    public String interpret(String command) {
        // Using Map 
        // int n = command.length();
        // StringBuilder res = new StringBuilder();
        // Map<String, String> mp = new HashMap<>();
        // mp.put("G", "G");
        // mp.put("()", "o");
        // mp.put("(al)", "al");

        // for(int i=0; i<n; i++) {
        //     String s = command.charAt(i)+"";

        //     while(i < n && command.charAt(i)!=')' && command.charAt(i) != 'G') {
        //         i++;
        //         if(i < n)
        //             s += command.charAt(i);
        //     }

        //     res.append(mp.get(s));
        // }
        
        // return res.toString();


        // Without Map
        // int n = command.length();
        // StringBuilder res = new StringBuilder();

        // for(int i=0; i<n; i++) {
        //     String s = command.charAt(i)+"";

        //     while(i < n && command.charAt(i)!=')' && command.charAt(i) != 'G') {
        //         i++;
        //         if(i < n)
        //             s += command.charAt(i);
        //     }
        //     System.out.print(s+" ");
        //     if(s.equals("G")) res.append("G");
        //     else if(s.equals("()")) res.append("o");
        //     else res.append("al");
        // }

        // return res.toString();


        //Optimal Approach
        int n = command.length();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<n; i++) {
            if(command.charAt(i)=='(' && command.charAt(i+1)==')') {
                res.append('o');
                i++;
            }
            else if(command.charAt(i)=='(' && command.charAt(i+1) != ')') {
                res.append("al");
                i+=3;
            }
            else {
                res.append("G");
            }
        }

        return res.toString();
    }
}
