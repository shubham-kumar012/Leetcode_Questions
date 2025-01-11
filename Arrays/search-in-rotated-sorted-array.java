// Q.33 Medium
// Leetcode - https://leetcode.com/problems/search-in-rotated-sorted-array/description/

// O(logn)
// O(logn)
class Solution {

    int searchInRoatated(int[] nums, int target, int si, int ei) {
        // base case
        if(si > ei) {
            return -1;
        }

        // calculate mid
        int mid = si + (ei - si)/2;

        // check if mid are that element
        if(nums[mid] == target) return mid;

        // mid on L1
        if(nums[si] <= nums[mid]) {
            // case a: L1 left
            if(nums[si] <= target && nums[mid] >= target) {
                return searchInRoatated(nums, target, si, mid-1);
            } 
            else { // case b: mid Right
                return searchInRoatated(nums, target, mid+1, ei);
            }
        }
        else { // mid on L2
            // case c: L2 Right
            if(nums[mid] <= target && nums[ei] >= target) {
                return searchInRoatated(nums, target, mid+1, ei);
            }
            else { // case d: mid left
                return searchInRoatated(nums, target, si, mid-1);
            }
        }

    }

    public int search(int[] nums, int target) {
        return searchInRoatated(nums, target, 0, nums.length-1);
    }
}
