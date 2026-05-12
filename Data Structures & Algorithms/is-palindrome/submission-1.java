class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder rs = new StringBuilder();
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                rs.append(Character.toLowerCase(c));
            }
        }
        String clean = rs.toString();
        String rev = rs.reverse().toString();
        return clean.equals(rev);

    }
}
