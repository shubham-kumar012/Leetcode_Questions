class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        // result string array
        String[] result = new String[n];

        // sort in decreasing order -> [10,9,8,4,3]
        int[] scoreCopy = Arrays.copyOf(score, n);
        Arrays.sort(scoreCopy);

        // creating hashmap
        Map<Integer, String> mp = new HashMap<>();
        for(int i=n-1; i>=0; i--){
            if(i==n-1) mp.put(scoreCopy[i], "Gold Medal");
            else if(i==n-2) mp.put(scoreCopy[i], "Silver Medal");
            else if(i==n-3) mp.put(scoreCopy[i], "Bronze Medal");
            else mp.put(scoreCopy[i], Integer.toString(n-i));
        }


        for(int i=0; i<n; i++){
            result[i] = mp.get(score[i]);
        }

        return result;

    }
}
