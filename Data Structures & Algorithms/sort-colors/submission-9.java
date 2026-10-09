class Solution {
    public void swap(int[] nums, int i, int j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int i = 0;
        int j = 1;
        int k = 2;

        int p1=0;
        int p2=0;
        int p3=nums.length-1;

        for(p2=0; p2<=p3; p2++) {
            if (nums[p2] == i) {
                swap(nums,p1,p2);
                p1++;
            }else if (nums[p2]==k) {
                 swap(nums,p2,p3);
                 p3--;
                 p2--;
            }
        }
    }
}