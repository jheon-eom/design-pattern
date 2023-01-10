package factorymethod.before;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "e4033jh@daum.net");
        System.out.println(whiteShip);

        Ship blackShip = ShipFactory.orderShip("BlackShip", "e4033jh@daum.net");
        System.out.println(blackShip);
    }

}
