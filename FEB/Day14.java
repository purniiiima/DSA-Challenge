class Day14 {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        for(int i=0; i<nums.length; i++){
           if(nums[i]==target){
               res = i; break;
           }
        }
        if(res==0){
            for(int j=0; j<nums.length; j++){
                if(nums[j]>=target){
                    res = j;
                    break;
                }
                else{
                    res = nums.length;
                }
            }
        }
        return res;
    }
}