class Solution {
    public int maxSubArray(int[] nums) {
        int s=nums[0];
        int max =s;
        for(int i=1;i<nums.length;i++){
            if(s+nums[i]>nums[i]){
                s+=nums[i];
            }else{
                s=nums[i];
            }
            if(s>max){
                max=s;
            }
        }
return max;
    }
}
