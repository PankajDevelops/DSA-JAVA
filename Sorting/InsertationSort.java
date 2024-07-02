public class InsertationSort {

    public static void swap(int brr[], int a, int b){
            int temp=brr[a];
            brr[a]=brr[b];
            brr[b]=temp;
        }
        public static void print(int brr[], int n){
            for(int i=0; i<=n-1; i++){
                System.out.print(brr[i]+" ");
            }
        }
        public static void main(String[] args) {
            
            int arr[] = {1,5,4,7,8,6,9};
            int n = 7;
            print(arr,7);
            System.out.println("");
            
            /*for(int i=1;i<n;i++){
                int temp=arr[i];
                int j = i-1;
                for(;j>=0;j--){
                    if(arr[j]>temp){
                        arr[j+1]=arr[j];
                    }
                    else{
                        break;
                    }	
                }
                arr[j+1]=temp;
            }*/

            // for(int i=0; i<n-1;i++){
            //     for(int j=i;j>=0;j--){
            //         if(arr[j]>arr[j+1]){
            //             int temp = arr[j];
            //             arr[j] = arr[j+1];
            //             arr[j+1] = temp;
            //         }
            //         else{
            //             break;
            //         }
            //     }
    
            // }

            //best method

            for(int i=1; i<n; i++){

                int curr = arr[i];
                int prev = i-1;

                while(prev>=0 && arr[prev] > curr){
                    arr[prev+1] = arr[prev];
                    prev--;
                }

                arr[prev+1] = curr;
                
            }

            
            print(arr,7);
            
        }
    }

    

