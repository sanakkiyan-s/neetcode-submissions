class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for (int num : nums){
            sets.add(num);
        }
        int longest = 0;
        for( int set : sets){
            int count = 0;
            if(sets.contains(set-1)) continue;
            while(sets.contains(set++)){
                count++;
            }
            if(longest<count){
                longest= count;
            }
        }
        return longest;
    }
}
