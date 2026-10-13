class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer>[] buckets = new List[nums.length+1];

        for(int i=0;i< buckets.length;i++){
            buckets[i] = new ArrayList<Integer>();
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet() ){
            buckets[entry.getValue()].add(entry.getKey());
        }

        int j=k;

        int[] result= new int[k];
        for (int i= buckets.length-1; i>=0; i--){
            
            for(Integer num: buckets[i]){
                if(j>0){

                    j--;
                    result[j] = num;
                    }else {
                        return result;
                    }
            }

        }

        return result;
    }
}
