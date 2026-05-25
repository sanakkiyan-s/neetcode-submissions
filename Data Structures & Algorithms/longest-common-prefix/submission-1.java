class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len= strs.length;
        for(int i=0; i<strs[0].length(); i++){
            for (String word: strs){
                if( i==word.length()  ||  word.charAt(i) != strs[0].charAt(i)){
                    return word.substring(0,i);
                }
            }
        }
        return strs[0];
    }
}