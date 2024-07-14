// package JAVAabdulBari.12. OOPS.Interfaces;

class Laptop {

    int price;
    int weight;
    int thickness;
}

interface features01 {

    void playHeavyGames();

    void threeDAnimation();
}

interface features02 {

    void editVideos();

    void noramlOfficeWork();
}

class Dell extends Laptop implements features01, features02 {

    public void playHeavyGames() {
        System.out.println("playHeavyGames");
    };

    public void threeDAnimation() {
        System.out.println("threeDAnimation");
    };

    public void editVideos() {
        System.out.println("editVideos");
    };

    public void noramlOfficeWork() {
        System.out.println("noramlOfficeWork");
    };

}

public class interfaceLaptop {

    public static void main(String[] args) {

        features02 d1 = new Dell();

        // d1.price = 90;
        // d1.weight = 4;

        d1.noramlOfficeWork();

    }

}
