public int minSubArrayLen(int target, int[] nums) {
        int count= Integer.MAX_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum<target) return 0;
        int i=0; int j=0;
        sum=0;
        while(i<nums.length){
            sum+=nums[i];
            i++;
            while(sum>=target){
                count=Math.min(count,i-j);
                sum-=nums[j];
                j++;
            }
        }
        
        return count == Integer.MAX_VALUE? 0:count ;
    }
