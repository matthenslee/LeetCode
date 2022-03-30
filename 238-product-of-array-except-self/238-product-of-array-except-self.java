class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // initalize to same size as input
        int[] output = new int[nums.length];
        int prefix = 1;
        int postfix = 1;
        
        // calculate product prefixes and store in output array
        // for each input given
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix;
            prefix = prefix * nums[i];
        }
        
        // starting at the end of the output array, take the
        // product of each number in existing output array
        // without the current position num[i]'s product
        // and insert back into the array and num[i]'th position
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= postfix;
            postfix *= nums[i];
        }
        
        return output;
        
    }
}