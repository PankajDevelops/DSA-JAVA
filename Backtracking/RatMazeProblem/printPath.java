package Backtracking;

public class printPath {

    public static void main(String[] args) {

        int rows = 3;
        int cols = 3;

        printMaze(0, 0, rows - 1, cols - 1,"");

    }

    private static void printMaze(int sr, int sc, int er, int ec, String s) {

        if (sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }

        // go right
        printMaze(sr, sc + 1, er, ec, s + "R");

        // go down
        printMaze(sr + 1, sc, er, ec, s + "D");

    }

}
