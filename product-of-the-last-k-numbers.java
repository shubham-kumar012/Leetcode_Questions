// Q.1352 Medium
// Leetcode - https://leetcode.com/problems/product-of-the-last-k-numbers/description/

class ProductOfNumbers {
    List<Integer> prod; // dynamically store products
    int zeroIdx = -1;

    public ProductOfNumbers() {
        prod = new ArrayList<>();
    }
    
    public void add(int num) { // O(1)
        if(num == 0) { // storing the index of 0
            zeroIdx = prod.size();
        }
        
        // if prod has no element
        if(prod.size() == 0) {
            prod.add(num);
            return;
        }

        int prev = prod.get(prod.size()-1);
        if(prev == 0) {
            prod.add(num);
        } else {
            prod.add(prev*num); // add num after multiply with prev.
        }

    }
    
    public int getProduct(int k) { // O(1)
        int divisor = (prod.size()-k)-1; // find divisor

        if(divisor == zeroIdx) {
            return prod.get(prod.size()-1);
        }
        else if(divisor < zeroIdx) { 
            return 0;
        } 
        else {
            //       <-----last element---->  <--divisor element-->      
            return ((prod.get(prod.size()-1)) / prod.get(divisor));
        }

    }
}
