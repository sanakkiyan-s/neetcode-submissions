class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<List<Integer>> bucketOut = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        for(int i =0; i<nums.length+1; i++){
            bucketOut.add(i,new ArrayList<>());
        }

        
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            bucketOut.get(entry.getValue()).add(entry.getKey());
        }

        int[] res =new int[k];
        int index=0;
        for(int i=nums.length; i>0 && index<k; i--){
                for(int n: bucketOut.get(i)){
                    if(index==k) return res;
                    res[index]=n;
                    index++;
                }
        }

        return res;
    }
}
