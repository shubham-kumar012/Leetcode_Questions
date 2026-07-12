// Time Complexity - O(nlogn)
// Space Complexity - O(n)
// Leetcode - https://leetcode.com/problems/rank-transform-of-an-array/

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        HashMap<Integer, Integer> map = new HashMap<>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++) {
            if(i > 0 && arr[i] != arr[i-1]) {
                map.put(arr[i], i+1);
            }
        }


        for(int i=0; i<arr.length; i++) {
            arr2[i] = map.get(arr2[i]);
        }

        return arr2;
    }
}
