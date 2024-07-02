package Backtracking.RatMazeProblem;

// four ways direction
public class ratMazeFour {

    public static void main(String[] args) {

        int rows = 4;
        int cols = 6;

        int maze[][] = { { 1, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 1 },
                { 0, 1, 1, 1, 1, 1 },
                { 0, 0, 1, 0, 1, 1 } };

        boolean[][] isVisited = new boolean[rows][cols];

        printMaze(0, 0, rows - 1, cols - 1, "", maze, isVisited);

    }

    private static void printMaze(int sr, int sc, int er, int ec, String s, int[][] maze, boolean[][] isVisited) {

        if (sr < 0 || sc < 0)
            return;
            
        if (sr > er || sc > ec)
            return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        if (maze[sr][sc] == 0) {
            return;
        }

        if (isVisited[sr][sc] == true)
            return;

        //check
        isVisited[sr][sc] = true;

        // go right
        printMaze(sr, sc + 1, er, ec, s + "R", maze, isVisited);

        // go down
        printMaze(sr + 1, sc, er, ec, s + "D", maze, isVisited);

        // go up
        printMaze(sr - 1, sc, er, ec, s + "U", maze, isVisited);

        // go left
        printMaze(sr, sc - 1, er, ec, s + "L", maze, isVisited);

        // backtracking
        isVisited[sr][sc] = false;
    }

}
