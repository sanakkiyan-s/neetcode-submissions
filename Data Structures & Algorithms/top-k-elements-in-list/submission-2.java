class Solution{
    public int[] topKFrequent(int[] nums, int k){
        List<List<Integer>> freq = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
            freq.add(new ArrayList<>());
        }
        
        for ( Map.Entry<Integer,Integer> entry : map.entrySet() ){
            freq.get(entry.getValue()-1).add(entry.getKey());
        }
        int[] res= new int[k];
        int index=0;
        for (int i=nums.length-1; i>=0 && index < k; i--){
            for (int num:freq.get(i)){
                res[index]=num;
                index++;
                if(index  == k){
                    break;
                }
            }
             

        }
        return res;
  



    }



}
