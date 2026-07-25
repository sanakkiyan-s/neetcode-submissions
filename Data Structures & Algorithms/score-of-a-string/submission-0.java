class Solution {
    public int scoreOfString(String s) {
        int score=0,j= 0;
        int i=1;
        while(s.length()>i && s.length()>j){
            score+=Math.abs(s.charAt(j)-s.charAt(i));
            i++;
            j++;
        }
        return score;
    }
}