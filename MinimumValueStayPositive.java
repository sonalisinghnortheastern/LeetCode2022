class Solution {
    int initialStartValue=1;
    public int minStartValue(int[] nums) {
        int startValue=initialStartValue;
       for(int num:nums){
           startValue=startValue+num;
           if(startValue<1){
               initialStartValue++;
               return minStartValue(nums);
           }
       }
       return initialStartValue;

    }
}
