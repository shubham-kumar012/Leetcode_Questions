// Q.2342 Medium
// Leetcode - https://leetcode.com/problems/max-sum-of-a-pair-with-equal-sum-of-digits/description

class Solution {

    public int digitSum(int num) {
        int res = 0;
        while(num > 0) {
            int rem = num % 10;
            res += rem;
            num = num/10;
        }
        return res;
    }
    public int maximumSum(int[] nums) {
        int n = nums.length;
        int ans = -1;


        // brute force
        // T.C. -> O(n^2)
        // S.C. -> O(1)
        // for(int i=0; i<n-1; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         if(i==j) continue;
        //         if(digitSum(nums[i]) == digitSum(nums[j])) {
        //             ans = Math.max(ans, nums[i] + nums[j]);
        //         }
        //     }
        // }



        // Better Approach (using hashmap & set)
        // T.C. -> O(nlognum)
        // S.C. -> O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(digitSum(nums[0]), nums[0]);

        for(int i=1; i<n; i++) {
            int DS = digitSum(nums[i]); // digit sum of value
            if(map.containsKey(DS)) { // if digit sum exist
                int sum = map.get(DS) + nums[i]; 
                ans = Math.max(ans, sum);
                map.put(DS, Math.max(map.get(DS), nums[i])); // maximum from prev and curr nums value
            } 

            map.putIfAbsent(DS, nums[i]); // if key(digit sum) doesn't exist
        }


        return ans;
    }
}
