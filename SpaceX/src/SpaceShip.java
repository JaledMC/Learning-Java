public interface SpaceShip {
    /**An interface to describe the rocket class**/
    boolean launch();
    boolean land();
    boolean canCarry(Item item);
    void carry(Item item);
}
