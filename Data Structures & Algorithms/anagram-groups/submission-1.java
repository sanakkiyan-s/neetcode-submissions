class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> res = new HashMap<>();
        for (String str : strs){
            char[] chararray = str.toCharArray();
            Arrays.sort(chararray);
            String key=Arrays.toString(chararray);
            if (!res.containsKey(key))
                res.put(key,new ArrayList<>());
            res.get(key).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for (String s: res.keySet()){
        result.add(res.get(s));
        }
    return result;
    }
}
