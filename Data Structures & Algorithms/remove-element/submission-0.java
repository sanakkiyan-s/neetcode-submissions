class Solution {
    public int removeElement(int[] nums, int val) {
        int point1 = 0;
        int point2 = 0;
        int k=0;

        for(int i=0; i<nums.length; i++){
        
                while(point2<nums.length && nums[point2]==val ){
                    point2++;
                }
            if(point2<nums.length){
                nums[point1]=nums[point2];
                point1++;
                point2++;}

        }
        return point1;
    }
}