public int arrayCount9(int[] nums) {
    int result = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]==9){
            result++;
        }
    }
    return result;
}