class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //HashMap

        // key is the alphabetical string version of the word
        // value is list of strings that map to that anagram
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for(String s: strs) {
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String a = new String(temp);
            if(!anagrams.containsKey(a)) {
                anagrams.put(a, new ArrayList<>());
            }
            anagrams.get(a).add(s);
        }

        List<List<String>> result = new ArrayList<>();
        for(String s: anagrams.keySet()) {
            result.add(anagrams.get(s));
        }
        return result;
    }
        
        








        
        
        
        
        
        
        
        
        
        
        
        
        
        // HashMap<String, List<String>> anagrams = new HashMap<>();
        // for(String s: strs) {
        //     int count[] = new int[26];
        //     for(int i = 0; i < s.length(); i++) {
        //         count[s.charAt(i) - 'a']++;
        //     }
        //     String key = Arrays.toString(count);
        //     if(!anagrams.containsKey(key)) {
        //         anagrams.put(key, new ArrayList<>());
        //     }
        //     anagrams.get(key).add(s);
        // }

        // List<List<String>> res = new ArrayList<>();
        // for(List<String> sec: anagrams.values()) {
        //     res.add(sec);
        // }
        // return res;
    
}
