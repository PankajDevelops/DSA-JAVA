// package JAVAabdulBari.12. OOPS.Interfaces;


class phone{

    public void call(){
        System.out.println("Phone Call");
    }
    
    public void sms() {
        System.out.println("Phone sending SMS");
    }
}

interface camera{

    void click();
    void record();
}

interface musicPlayer {

    void play();
    void stop();
}

class SmartPhone extends phone implements camera, musicPlayer{

    public void videoCall(){
        System.out.println("SmartPhone VideoCalling");
    }
    
    public void click() {
        System.out.println("SmartPhone click");
    }
    
    public void record() {
        System.out.println("SmartPhone record");
    }
    
    public void play() {
        System.out.println("SmartPhone play");
    }
    
    public void stop() {
        System.out.println("SmartPhone stop");
    }
}

public class interfaceExample {

    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();
        sp.call();
        


    }
    
}
