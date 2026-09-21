class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr1= new int[26];

        for(int i=0; i<s.length(); i++  ){
            arr1[s.charAt(i)-'a']++;
        }
        for(int i=0 ; i< t.length(); i++){
            
            arr1[t.charAt(i)-'a']--;
        }

        for(int num: arr1){
            if (num != 0){
                return false;
            }
        }

        return true;

    }
}
