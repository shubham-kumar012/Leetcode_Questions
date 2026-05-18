// Time complexity - O(n logn)
// Space Complexity - O(log n)
// Leetcode - https://leetcode.com/problems/count-largest-group/

class Solution {
    public int digitSum(int n) {
        int sum = 0;
        while(n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n/10;
        }

        return sum;
    }

    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=1; i<=n; i++) {
            int sum = digitSum(i);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        int largest = 1;
        int res = 0;
        for(int key : map.keySet()) {
            if(map.get(key) == largest) {
                res++;
            } else if(map.get(key) > largest) {
                largest = map.get(key);
                res = 1;
            }
        }

        return res;


    }
}
