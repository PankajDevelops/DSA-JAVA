// package JAVAabdulBari.12. OOPS.SingletonClass;

class coffeeMachine{

    private float coffeeQty;
    private float waterQty;
    private float sugerQty;
    private float milkQty;

    static private coffeeMachine our = null;

    private coffeeMachine(){
        
        coffeeQty = 1;
        waterQty = 1;
        milkQty = 1;
        sugerQty = 1;
    }

    public void fillSugar(float qty){
        sugerQty = qty;
    }
    
    public void fillwater(float qty) {
        waterQty = qty;
    }
    
    public float getCoffee() {
        return 0.23f;
    }

    static public coffeeMachine getInstance(){

        if(our==null){
            our = new coffeeMachine();
        }

        return our;
    }

}


public class Main {

    public static void main(String[] args) {

        coffeeMachine c1 = coffeeMachine.getInstance();
        coffeeMachine c2 = coffeeMachine.getInstance();
        coffeeMachine c3 = coffeeMachine.getInstance();

        System.out.println(c1+" "+c2+" "+c3+" ");

    }
    
}
