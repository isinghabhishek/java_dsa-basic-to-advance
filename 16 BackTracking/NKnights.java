

public class NKnights{

    static int N = 8;
    public static boolean isSafe(int x, int y, int board[][]){
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    public static void printChessBoard(int board[][]){
        for(int x=0; x<N; x++){
            for(int y=0; y<N; y++){
                System.out.print(board[x][y]+" ");
            }
            System.out.println();
        }
    }

    public static boolean solveKT(){
        int board[][] = new int[8][8];
        for(int x = 0; x < N; x++)
            for(int y = 0; y < N; y++)
                board[x][y] = -1;

        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};
        // As the knight starts from cell(0, 0)
        board[0][0] = 0;

        if(!solveKTUtil(0, 0, 1, board, xMove, yMove)) {
            System.out.println("Solution does'nt exist");
            return false;
        } else
            printChessBoard(board);
            return true;
    }

    public static boolean solveKTUtil(int x, int y, int movei, int board[][], int xMove[], int yMove[]){
        int k, next_x, next_y;
        if(movei == N*N)
        return true;
        for(k=0; k<8; k++){
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            if(isSafe(next_x, next_y, board)) {
                board[next_x][next_y] = movei;
                if(solveKTUtil(next_x, next_y, movei+1, board, xMove, yMove))
                    return true;
                    else
                    board[next_x][next_y] = -1; // backtraking
            }
        }
        return false;
    }
    public static void main(String args[]) {
        solveKT();
    }
}