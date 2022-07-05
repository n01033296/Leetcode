class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] ans = new int[2];
        
        for(i=0;i<nums.length;i++){
            for(j=1;j<nums.length;j++){
                if(i == j)
                    j++;
                if(target == nums[i]+nums[j]){
                    ans[0] = j;
                    ans[1] = i;
                    return ans;
                }
            }
        }
        return ans;
    }
}