class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix = 0;
        int res= 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for (int i=0; i< nums.length; i++){
            prefix+=nums[i];
            int diff = prefix -k;
            res+=map.getOrDefault(diff,0);

            map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
        return res;
    }
}