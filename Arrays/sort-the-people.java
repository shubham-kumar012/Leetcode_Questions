// Leetcode - https://leetcode.com/problems/sort-the-people/

class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;

        // Method 1 - Using bubble sort 
        // Time complexity - O(N^2)
        // Space Complexity - O(1)
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         if(heights[j] > heights[i]) {
        //             // swap heights
        //             int tempH = heights[i];
        //             heights[i] = heights[j];
        //             heights[j] = tempH;
                    
        //             // swap names
        //             String tempN = names[i];
        //             names[i] = names[j];
        //             names[j] = tempN;
        //         }
        //     }
        // }
        // return names;

        // Method 2 - Using hashmap
        // Time complexity - O(n logn)
        // Space Complexity - O(n)
        HashMap<Integer, String> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.put(heights[i], names[i]);
        }

        Arrays.sort(heights);

        String[] res = new String[n];
        int j = 0;
        for(int i=n-1; i>=0; i--) {
            res[j++] = map.get(heights[i]);
        }

        return res;
    }
}
