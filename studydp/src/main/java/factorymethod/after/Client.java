package factorymethod.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "e4033jh@daum.com");
        client.print(new BlackshipFactory(), "blackship", "e4033jh@daum.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}