package OOPS.Abstraction;

public class learnAnonymous {
    
    OuterClass obj = new OuterClass(){

        void sing(){
            System.out.println("Singing");
        }

        public void outerMethod(){
            
        }
    };
    
}

class OuterClass{

}