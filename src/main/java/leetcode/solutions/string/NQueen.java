package leetcode.solutions.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {

        List<List<String>> result = new ArrayList<>();

        public List<List<String>> solveNQueens(int n) {

            char[][] board = new char[n][n];

            // fill board with '.'
            for (int i = 0; i < n; i++) {
                Arrays.fill(board[i], '.');
            }

            backtrack(board, 0, n);

            return result;
        }

        private void backtrack(char[][] board, int row, int n) {

            // all queens placed
            if (row == n) {
                result.add(createBoard(board));
                return;
            }

            // try every column
            for (int col = 0; col < n; col++) {

                if (isSafe(board, row, col, n)) {

                    board[row][col] = 'Q';

                    backtrack(board, row + 1, n);

                    // undo choice
                    board[row][col] = '.';
                }
            }
        }

        private boolean isSafe(char[][] board, int row, int col, int n) {

            // check same column
            for (int i = 0; i < row; i++) {
                if (board[i][col] == 'Q') {
                    return false;
                }
            }

            // check upper-left diagonal
            for (int i = row - 1, j = col - 1;
                 i >= 0 && j >= 0;
                 i--, j--) {

                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            // check upper-right diagonal
            for (int i = row - 1, j = col + 1;
                 i >= 0 && j < n;
                 i--, j++) {

                if (board[i][j] == 'Q') {
                    return false;
                }
            }

            return true;
        }

        private List<String> createBoard(char[][] board) {

            List<String> temp = new ArrayList<>();

            for (char[] row : board) {
                temp.add(new String(row));
            }

            return temp;
        }
    }
