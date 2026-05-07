class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> pre=new HashMap<>();
        

        for(int i=0;i<nums.length;i++){
        int num=nums[i];
            int need=target-nums[i];

            if(pre.containsKey(need)){
                return new int[]{pre.get(need),i};
            }   

            pre.put(num,i);

        }

        return new int[]{}; 

    }
}
