class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        // Traverse rows
        for (int r = 0; r < 9; r++) {

            // Traverse columns
            for (int c = 0; c < 9; c++) {

                // Current cell value
                char current = board[r][c];

                // Skip empty cells
                if (current == '.') {
                    continue;
                }

                // Unique row identifier
                String rowKey = current + " in row " + r;

                // Unique column identifier
                String colKey = current + " in col " + c;

                // Unique 3x3 square identifier
                String squareKey =
                        current + " in square "
                        + (r / 3) + "-" + (c / 3);

                /*
                    HashSet.add(value)

                    RETURNS:
                    true  -> if value is NOT already present
                    false -> if duplicate already exists

                    Example:

                    seen.add("5 in row 0") -> true
                    seen.add("5 in row 0") -> false

                    Because the second one is duplicate.
                */

                // If duplicate exists anywhere
                if (!seen.add(rowKey) ||
                    !seen.add(colKey) ||
                    !seen.add(squareKey)) {

                    return false;
                }
            }
        }

        // No duplicates found
        return true;
    }
}
