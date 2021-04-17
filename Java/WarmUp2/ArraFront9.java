public boolean arrayFront9(int[] nums) {
    int checkLimit = 4;
    if(nums.length<4){
        checkLimit=nums.length;
    }
    for(int i=0;i<checkLimit;i++){
        if(nums[i]==9){
            return true;
        }
    }
    return false;
}
