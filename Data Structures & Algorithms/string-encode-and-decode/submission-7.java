class Solution {

    public String encode(List<String> strs) {
            StringBuilder res = new StringBuilder();
            for(String str: strs){
                res.append(str.length()).append('#').append(str);
            }
            return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res= new ArrayList<>();
        int i=0;
        int j=0;

        while(i<str.length()){

            while(str.charAt(j)!='#'){
                j++;
            }

            int count = Integer.parseInt(str.substring(i,j++));
            res.add(str.substring(j,j+count));
            j+=count;
            i=j;
        }
        return res;
    }
}
