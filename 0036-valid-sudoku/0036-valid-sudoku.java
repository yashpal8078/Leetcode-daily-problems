class Solution {

    boolean isValid(char[][] board, int row, int col, char d) {

        for (int i = 0; i < 9; i++) {

            if (board[row][i] == d)
                return false;

            if (board[i][col] == d)
                return false;
        }

        int start_i = (row / 3) * 3;
        int start_j = (col / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[start_i + i][start_j + j] == d)
                    return false;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] != '.') {

                    char ch = board[i][j];
                    board[i][j] = '.';      

                    if (!isValid(board, i, j, ch))
                        return false;

                    board[i][j] = ch;       
                }
            }
        }

        return true;
    }
}