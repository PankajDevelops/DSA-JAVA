public class test_01 {

    static void print(int srr[]){
        for(int i=0; i<srr.length; i++){
            System.out.print(srr[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int arr[] =  {1,2,3,1,4,5,3,2,1,1,1,5,6,7};
        int n = arr.length;
        int x = 6;

        int ans[] = new int[x];

        for(int num : arr){
            if(num<=x){
                ans[num-1]++;
            }
        }

        print(ans);

    }
    
}
