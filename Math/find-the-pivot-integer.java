// Q.2485 Easy
// Leetcode - https://leetcode.com/problems/find-the-pivot-integer/description/

// T.C. - O(n)
// S.C. - O(1)
class Solution {
    public int pivotInteger(int n) 
    {
        if(n==1) return n;

        int s=0,s1=0,s2=0;
        
        s = n*(n+1)/2; // addition of all element till n

        s=(int)Math.sqrt(s); //square root of total sum
        
        s1 = s*(s+1)/2; //Addition of elements till sqrt of total sum

        for(int i=s; i<=n; i++) {
            s2 = s2+i;//Addition of elements from sqrt of total sum till n
        }
      
        return (s1 == s2) ? s : -1;
    }
}
