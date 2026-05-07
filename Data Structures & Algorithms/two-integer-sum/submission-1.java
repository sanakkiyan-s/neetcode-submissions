class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> maps = new HashMap<>();
        for (int i = 0; i<nums.length; i++){
            int needed = target - nums[i];

            if ( maps.containsKey(needed)){
                return new int[]{maps.get(needed),i};
            }else{
                maps.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
