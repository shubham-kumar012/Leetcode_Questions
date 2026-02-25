class Solution {
    public int countBits(int num) {
        int res = 0;
        while(num>0) {
            if((num & 1) == 1) res++;
            num >>= 1;
        }
        return res;
    }

    public int[] sortByBits(int[] arr) {
        int n = arr.length; 

        // Method 1: Using selection sort approach
        // Time Complexity - O(n^2 * m)
        // Space Complexity - O(1)
        // for(int i=0; i<n; i++) {
        //     for(int j=i+1; j<n; j++) {
        //         int bit1 = countBits(arr[i]);
        //         int bit2 = countBits(arr[j]);

        //         if(bit1 > bit2) {
        //             int temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         } 
        //         else if(bit1 == bit2) {
        //             if(arr[i] > arr[j]) {
        //                 int temp = arr[i];
        //                 arr[i] = arr[j];
        //                 arr[j] = temp;
        //             }
        //         }
        //     }
        // }



        // Method 2: Using custom comparator
        // Time Complexity - O(n logn)
        // Space Complexity - O(n)
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]:new);

        Arrays.sort(temp, (a,b) -> {
            int diff = Integer.bitCount(a) - Integer.bitCount(b);
            if(diff == 0) return a - b;
            return diff;
        });

        for(int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}
