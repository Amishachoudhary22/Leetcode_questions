// in the given list if there is a duplicate number then print the number
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++){
            if(nums[i]== nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
