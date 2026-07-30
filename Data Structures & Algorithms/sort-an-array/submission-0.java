class Solution {
    public int[] quicksort(int[] nums,int low,int high){
        if(low<high){
            int pivot = partition(nums,low,high);
            quicksort(nums,low,pivot-1);
            quicksort(nums,pivot+1,high);
        }
        return nums;
    }

    public int partition(int[] nums,int low,int high){
                  int i=low-1;
        if(low<high){
            int pivot = nums[high];
  
            for(int j=low; j<high; j++){
                if(nums[j]<pivot){
                    i++;
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
            int temp=nums[++i];
            nums[i]=nums[high];
            nums[high]=temp;
        }
        return i;
    }

    public int[] sortArray(int[] nums) {
        int high = nums.length-1;
        int low= 0;
        return quicksort(nums,low,high);
    }
}