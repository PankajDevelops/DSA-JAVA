class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
        char ch = s.charAt(i);
            if(ch =='(' || ch =='{' || ch =='['){
                st.push(ch);
            }
            else{
             if(st.size()!=0){

             if(st.peek()=='{' && ch =='}'  || st.peek()=='(' && ch ==')' || st.peek()=='[' && ch ==']' ){
                st.pop();
            }
            
            else{
                return false;
                 
            }
        }
        else{
            return false;
          }
        }
        
        }
        if(st.size()==0){
            return true;
        }
        else{
            return false;
        }
        
    }
}