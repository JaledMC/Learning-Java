import java.util.concurrent.ThreadLocalRandom;

public class U1 extends Rocket{
    public U1() {
        this.cost = 100;
        this.weight = 10000;
        this.maxWeight = 18000;
        this.launchExplosion = 0.05;
        this.landingExplosion = 0.01;
    }
    public boolean launch() {
        /**Override the launch and land methods, to calculate the % with the weight*/
        double randNumber = ThreadLocalRandom.current().nextDouble();
        double probability = this.launchExplosion * (((double) this.weight )/ this.maxWeight);
        return randNumber > probability;
    }
    public boolean land() {
        double randNumber = ThreadLocalRandom.current().nextDouble();
        double probability = this.landingExplosion * (((double) this.weight )/ this.maxWeight);
        return randNumber > probability ;
    }
}
