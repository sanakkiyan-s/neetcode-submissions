class Solution {
    public void sortColors(int[] nums) {
        // lets try three pointer since we need to sort the array in one pass in pre difined order
        int i= 0;
        int j=0;
        int l=nums.length-1;

        while(j<=l){
            if(nums[j]==0){
              int  temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                            
            }else if (nums[j]==2){
              int  temp=nums[j];
                nums[j]=nums[l];
                nums[l]=temp;
                l--;
                j--;
            }
            j++;

        }
    }
}