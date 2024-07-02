package Backtracking.RatMazeProblem;

public class ratMazeFinal {

    public static void main(String[] args) {

        int rows = 4;
        int cols = 6;

        int maze[][] = { { 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 1, 0, 1, 1 } };

        printMaze(0, 0, rows - 1, cols - 1, "", maze);

    }

    private static void printMaze(int sr, int sc, int er, int ec, String s, int[][] maze) {

        if (sr < 0 || sc < 0)
            return; //for directions

        if (sr > er || sc > ec)
            return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if (maze[sr][sc] == 0) {
            return; //blocked
        }

        if(maze[sr][sc]==-1) return; //this is already visited

        //check

        maze[sr][sc] = -1;


        // go right
        printMaze(sr, sc + 1, er, ec, s + "R", maze);

        // go down
        printMaze(sr + 1, sc, er, ec, s + "D", maze);

        // go up
        printMaze(sr - 1, sc, er, ec, s + "U", maze);

        // go left
        printMaze(sr, sc - 1, er, ec, s + "L", maze);

        // backtracking
        maze[sr][sc] = 1;

    }
    
}
