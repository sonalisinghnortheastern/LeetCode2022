public int pivotIndex(int[] nums) {
       int pivot = -1;
        int n = nums.length;
        int left=0; int right=0;
        for(int i = 0; i < n; i++){
            right += nums[i];
        }
        for(int i = 0; i < n; i++){
            right -= nums[i];
            if(left == right) return i;
            left += nums[i];
        }
        return -1;
    }
