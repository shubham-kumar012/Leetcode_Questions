// Q.2349 Medium
// Leetcode - https://leetcode.com/problems/design-a-number-container-system/description

// T.C. -> O(logn) -> change | O(1) -> find
// S.C. -> O(n)
class NumberContainers {
    private HashMap<Integer, Integer> idxToNum;
    private HashMap<Integer, TreeSet<Integer>> numToIdx;

    public NumberContainers() {
        idxToNum = new HashMap<>();
        numToIdx = new HashMap<>();
    }
    
    public void change(int index, int number) { // O(logn)
        if(idxToNum.containsKey(index)) { // If index already exists
            int prevVal = idxToNum.get(index);
            if(prevVal != number) {
                numToIdx.get(prevVal).remove(index); // removing old index from set

                if(numToIdx.get(prevVal).isEmpty()) {
                    numToIdx.remove(prevVal);
                }
            }
        }

        // Insert values
        idxToNum.put(index, number);
        numToIdx.putIfAbsent(number, new TreeSet<>());
        numToIdx.get(number).add(index);
    }
    
    public int find(int number) { // O(1)
        if(!numToIdx.containsKey(number)) {
            return -1;
        }

        return numToIdx.get(number).first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
