class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Integer,List<Character>> row =  new HashMap<>();
        HashMap<Integer,List<Character>> col =  new HashMap<>();
        HashMap<String,List<Character>> square =  new HashMap<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if (board[i][j]=='.') continue;
                String squareKey = (i/3) +"," +  (j/3);
                if(row.computeIfAbsent(i,k->new ArrayList<>()).contains(board[i][j]) ||
                col.computeIfAbsent(j,k->new ArrayList<>()).contains(board[i][j]) ||
                square.computeIfAbsent(squareKey,k->new ArrayList<>()).contains(board[i][j])){
                    return false;
                }

                row.get(i).add(board[i][j]);
                col.get(j).add(board[i][j]);
                square.get(squareKey).add(board[i][j]);

            }
        }

        return true;

    }
}
