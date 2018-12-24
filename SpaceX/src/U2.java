import java.util.concurrent.ThreadLocalRandom;

public class U2 extends Rocket{
    public U2() {
        this.cost = 120;
        this.weight = 18000;
        this.maxWeight = 29000;
        this.launchExplosion = 0.04;
        this.landingExplosion = 0.08;
    }
    public boolean launch() {
        /**Override the launch and land methods, to calculate the % with the weight*/
        double randNumber = ThreadLocalRandom.current().nextDouble();
        double probability = this.launchExplosion * (this.weight / this.maxWeight);
        return randNumber < probability;
    }
    public boolean land() {
        double randNumber = ThreadLocalRandom.current().nextDouble();
        double probability = this.landingExplosion * (this.weight / this.maxWeight);
        return randNumber < probability ;
    }
}
