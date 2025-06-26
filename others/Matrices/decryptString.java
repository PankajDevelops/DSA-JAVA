package Matrices;

public class decryptString {

    public static void main(String[] args) {
        
        String message = "PLEASESAVEME";
        int rows = 3;
        int cols = 4;
        char[][] grid = new char[rows][cols];

        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (index < message.length()) {
                    grid[i][j] = message.charAt(index++);
                } else {
                    grid[i][j] = ' ';
                }
            }
        }

        StringBuilder encryptedMessage = new StringBuilder();
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                encryptedMessage.append(grid[i][j]);
            }
            encryptedMessage.append(' ');
        }

        System.out.println("Encrypted Message: " + encryptedMessage.toString().trim());
    }
}

