class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> resultList = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            int[] arr = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                arr[strs[i].charAt(j)-'a']++;
            }
            map.computeIfAbsent(Arrays.toString(arr),k->new ArrayList<>()).add(strs[i]);
            
        }

        for(Map.Entry<String,List<String>> set: map.entrySet()){
                resultList.add(set.getValue());
        }

        return resultList;
    }
}
