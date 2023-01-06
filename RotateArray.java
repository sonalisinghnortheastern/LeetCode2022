class Solution {
    public void rotate(int[] nums, int k) {
        int n= k%nums.length;
        int size= nums.length-1;
        rotateParts(nums,0,size);
        rotateParts(nums,0,n-1);
        rotateParts(nums,n,size);
    }
    private void rotateParts(int[] nums, int start, int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
