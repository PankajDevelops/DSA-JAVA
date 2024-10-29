package Backtracking.RatMazeProblem;

public class mazePathTwo {

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        boolean[][] isVisited = new boolean[rows][cols]; // by def it is alreday "False"

        printMaze(0, 0, rows - 1, cols - 1, "", isVisited);

    }

    private static void printMaze(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {

        if (sr < 0 || sc < 0)
            return;

        if (sr > er || sc > ec)
            return;

        if (isVisited[sr][sc] == true)
            return;

        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        isVisited[sr][sc] = true;

        // go right
        printMaze(sr, sc + 1, er, ec, s + "R", isVisited);

        // go down
        printMaze(sr + 1, sc, er, ec, s + "D", isVisited);

        // go left
        printMaze(sr, sc - 1, er, ec, s + "L", isVisited);

        // go up
        printMaze(sr - 1, sc, er, ec, s + "U", isVisited);

        // backtracking
        isVisited[sr][sc] = false;

    }

}
