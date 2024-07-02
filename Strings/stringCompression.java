package Strings;

public class stringCompression {

    public static void printArray(Character arr[], int length){
    for(int i = 0; i < length; i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        
        Character chars[] = {'a','a','b','b','c','c','c'};

        int index = 0; 
        int i = 0; 

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        printArray(chars, chars.length-1);
        System.out.println("");
        System.out.println(index);

    }
    
}
