import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int n2 : nums2){
            if(mp.containsKey(n2)){
                mp.put(n2,mp.get(n2)+1);
            }else{
                mp.put(n2,1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int n1 : nums1){
            if(mp.containsKey(n1) && mp.get(n1) > 0){
                list.add(n1);
                mp.put(n1,mp.get(n1)-1);
            }
        }

        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        return arr;

    }
}
