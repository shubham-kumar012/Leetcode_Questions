class Solution {
    public static int digitSum(int n) {
        int k = n;
        int sum = 0;
        while(k>0){
            int rem = k % 10;
            sum += rem;
            k /= 10;
        }
        return sum;
    }

    public int countEven(int num) {
        int count = 0;
        for(int i=2; i<=num; i++) {
            if(digitSum(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
