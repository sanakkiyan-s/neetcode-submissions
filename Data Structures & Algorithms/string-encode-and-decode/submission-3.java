class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        if (strs.isEmpty()) return "";
        for (String word: strs){
            res.append(word.length()).append('#').append(word);
        }

        return res.toString();

    }

    public List<String> decode(String str) {
                if (str.isEmpty()) return new ArrayList<>();
        List<String> res = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));



            res.add(str.substring(++j,j+length));

            i=j+length;

        }

        return res;

    }
}
