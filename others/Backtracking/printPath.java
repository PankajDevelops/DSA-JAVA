package Backtracking;

public class printPath {

     static void countWays(int sR, int sC, int endR, int endC, String path,boolean flag[][]){

        if(sR>endR || sC>endC) return;
        
        if(sR<0 || sC<0) return ;

        if(sR==endR && sC==endC){ 
            System.out.println(path);
            return;
        }

        if(flag[sR][sC]==true) return;

        flag [sR][sC] = true;
        
        //Down
        countWays(sR+1,sC,endR,endC,path+"D",flag);
        //up
        countWays(sR-1,sC,endR,endC,path+"U",flag);
        //right
        countWays(sR,sC+1,endR,endC,path+"R",flag);
        //left
        countWays(sR,sC-1,endR,endC,path+"L",flag);

        flag[sR][sC] = false;


    }
    
    public static void main(String[] args) {
        
        int row = 3;
        int col = 3;

        boolean flag[][] = new boolean[row][col];
        
        countWays(0,0,row-1,col-1,"",flag);
        
        
    }
    
}
