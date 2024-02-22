package factorymethod;

public class OrdinaryRoom extends Room {
    public void connect(Room room) {
        System.out.println("ordinary room.");
    }
}