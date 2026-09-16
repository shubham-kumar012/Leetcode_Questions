// Time Complexity - O(n)
// Space Complexity - O(1)

class Solution {
    public int[] frequencySort(int[] nums) {
        int count[] = new int[201];
        for(int num : nums) {
            count[num + 100]++;
        }

        Integer[] newArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(newArr, (a, b) -> {
            if(count[a+100] == count[b+100]) {
                return b - a;
            }
            return count[a+100] - count[b+100];
        });

        return Arrays.stream(newArr).mapToInt(Integer::intValue).toArray();
    }
}
