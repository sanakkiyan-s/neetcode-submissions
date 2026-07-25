class Solution {
    public int appendCharacters(String s, String t) {
        int result = t.length();
        int i=0;
        int j=0;
        while(s.length()>i && t.length()>j){
          if(s.charAt(i)==t.charAt(j)){
            j++;
            result--;
          }
          i++;
        }
        return result;
    }
}