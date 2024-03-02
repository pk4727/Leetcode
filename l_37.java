package leetcode;

public class l_37 {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        // if (sudokuSolver(board)) {
            // display(board);
// 
        // } else {
            // System.out.println("Cannot solve");
        // }
    }

    static boolean sudokuSolver(int[][] board) {
        int row = -1;
        int col = -1;
        int size = board.length;
        boolean isempty = true;

        for (int i = 0; i < size; i++) // this is how we are replacing the r,c from arguments
        {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    isempty = false;
                    break;
                }
            }
            if (!isempty) // if you found some empty element in row, then break (isempty == false)
            {
                break;
            }
        }

        if (isempty) // sudoku is solved (isempty == true)
        {
            return true;
        }
        // backtrack
        for (int number = 1; number <= 9; number++) {
            if (isSudokuSafe(board, row, col, number)) {
                board[row][col] = number;
                if (sudokuSolver(board)) // found the answer
                {
                    display(board);
                    System.out.println("\n");
                    return true;
                } else // backtrack
                {
                    board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSudokuSafe(int[][] board, int row, int col, int ans) {
        for (int[] i : board) // check in current row
        {
            if (i[col] == ans) {
                return false;
            }
        }
        for (int i : board[row]) // check in current col
        {
            if (i == ans) {
                return false;
            }
        }
        // find coordinate for check in current sub-board part
        int sizeOfSubboard = (int) (Math.sqrt(board.length)); // 3
        int[] start = { row - row % sizeOfSubboard, col - col % sizeOfSubboard }; // 3,6
        for (int srow = start[0]; srow < start[0] + sizeOfSubboard; srow++) {
            for (int scol = start[1]; scol < start[1] + sizeOfSubboard; scol++) {
                if (board[srow][scol] == ans) {
                    return false;
                }
            }

        }
        return true;
    }

    private static void display(int[][] board) {
        for (int[] row : board) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}