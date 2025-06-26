package Practice;

class Phone{
   
    void network(){
        System.out.println("Phone is having Network");
    }
}

interface camera{

    void click();
    void record();
    void cinematicMode();
}

interface multimedia{

    void music();
    void memo();
    void fmRadio();
}

interface call{

    void call();
    void textMsg();
}

  class SmartPhone extends Phone implements camera,multimedia,call{

    public void click(){
        System.out.println("Clicking Photo");
    };
    public void record(){
        System.out.println("Recording vidoe");
    };
    public void cinematicMode(){
        System.out.println("Cinematic MODE is ON");
    };
    public void music(){
        System.out.println("Playing muisc");
    };
    public void memo(){
        System.out.println("recording audio");
    };
    public void fmRadio(){
        System.out.println("FM is ON");
    };
    public void call(){
        System.out.println("Calling");
     };
    public void textMsg(){
        System.out.println("SMS Sent Successfully");
    };

}

public class thisVsSuper {

    public static void main(String[] args) {

        SmartPhone MI = new SmartPhone();
        MI.cinematicMode();

    }

}
