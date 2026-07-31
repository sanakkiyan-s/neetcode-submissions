class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];
        for(int i =0; i<bucket.length; i++){
            bucket[i]= new ArrayList<>();
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            bucket[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        for(int i=bucket.length-1; i>=0 && k>=0; i--){
            for(int num: bucket[i]){
                if(k>0){
                    res[--k]=num;
            }}
        }
        return res;
    }
}
