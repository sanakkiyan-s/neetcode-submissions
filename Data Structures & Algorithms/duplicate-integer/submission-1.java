class Solution {
    public boolean hasDuplicate(int[] nums) {

        List<Integer> num=Arrays.stream(nums).boxed().distinct().toList();

        if(num.size()==nums.length){
            return false;
        }
        return true;
    }
}