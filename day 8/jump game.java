class Solution {
    public boolean canJump(int[] nums) {
        int maxreachable=nums[0];
        int i=1;
        while(i<nums.length && maxreachable>=i){
            if(i+nums[i]>maxreachable){
                maxreachable=i+nums[i];
            }
            i++;
        }
        if(maxreachable>=nums.length-1){
            return  true;
        }
        else {
            return false;
        }
    }
}
