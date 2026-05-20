class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length-1;
        int res=0;
        int sum=0;

        while(left<right){
            sum=  Math.min(heights[left],heights[right])*(right-left);
            res= Math.max(sum,res);
            if (heights[left]<=heights[right]){
                left++;
            }else{
                right--;
            }

        }
        return res;
        
    }
}
