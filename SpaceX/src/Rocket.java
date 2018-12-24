public class Rocket implements SpaceShip{
    /**Define the fields of the ships, and create methods to carry the items*/
    protected int cost;
    protected int weight;
    protected int maxWeight;
    protected double launchExplosion;
    protected double landingExplosion;

    public boolean launch() {
        return true;
    }
    public boolean land() {
        return true;
    }
    public boolean canCarry(Item item) {
        return this.maxWeight > (this.weight + item.weight);

    }
    public void carry(Item item) {
        this.weight = this.weight + item.weight;
    }
}
