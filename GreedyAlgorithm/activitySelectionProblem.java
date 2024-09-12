package GreedyAlgorithm;
import java.util.*;

public class activitySelectionProblem{

    public static void main(String[] args) {

        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //sorting
        int act [][] = new int [end.length][3];

        for(int i=0; i<end.length; i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }

        //imp lambda fucntion
        // Arrays.sort(act,Comparator.comparingDouble(o->o[2]));

        ArrayList<Integer> ls = new ArrayList<>();

        int maxAct = 0;
        ls.add(act[0][0]);
        maxAct = 1;

        int currAct = act[0][2];

        for(int i=1; i<end.length; i++){
            if(act[i][1]>=currAct){
                maxAct++;
                currAct = act[i][2];
                ls.add(act[i][0]);
            }
        }

        System.out.println("Maximum Activites:" + maxAct);

        for(int i=0; i<ls.size(); i++){

            System.out.print("A"+ls.get(i)+" ");
        }
        
    }
    
}
