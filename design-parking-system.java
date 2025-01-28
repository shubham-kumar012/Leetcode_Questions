// Q.1603 Easy
// Leetcode - https://leetcode.com/problems/design-parking-system/description

class ParkingSystem {
    // slot -> [big, medium, small]
    // public int[] slot = new int[3];
    // Second Way
    int[] slot;
    public ParkingSystem(int big, int medium, int small) {
        // slot[0] = big;
        // slot[1] = medium;
        // slot[2] = small;
        slot = new int[]{big, medium, small};
    }
    
    public boolean addCar(int carType) {
        if(slot[carType-1] > 0) {
            slot[carType-1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
