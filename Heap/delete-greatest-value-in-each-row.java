// Q.2500 Easy
// Leetcode - https://leetcode.com/problems/delete-greatest-value-in-each-row/description


class Solution {
    public int deleteGreatestValue(int[][] grid) {
      // Method 1 - Uinsg Heap(max)
      // T.C. -> O(m*nlogn)
      // S.C. -> O(m*n)
      // Creating a list of priority queue. It will store the rows.
    	ArrayList<PriorityQueue<Integer>> list=new ArrayList<>();
    	
    	int m=grid.length; // total number of rows in grid.
    	int n=grid[0].length; // total number of columns in grid.

        // Let's fill the list.
    	for (int i=0;i<grid.length;i++) {
    		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    		for (int j=0;j<grid[0].length;j++) {
    			pq.add(grid[i][j]);
    		}
    		list.add(pq);
			}
			
    	int result=0;
    	for (int i=0;i<n;i++) {
    		int num=-1;
    		for (int j=0;j<m;j++) {
    			PriorityQueue<Integer> pq=list.get(j);
    			int temp = pq.poll();
					
    			num=Math.max(num, temp);
    		}
    		result+=num;
    	}
    	return result;


      // Method 2 - Using Sorting
      // T.C. -> O(m*nlogn)
      // S.C. -> O(1)
      int max = 0;
        for(int[] row:grid) {
            Arrays.sort(row);
        }
        for(int i=0; i<grid[0].length; i++) {
            int tempMax = Integer.MIN_VALUE;
            for(int j=0; j<grid.length; j++) {
                tempMax = Math.max(grid[j][i], tempMax);
            }
            max += tempMax;
        }
        return max;
    }
}
