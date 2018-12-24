public class Mathematical {
    private double temp;

    Mathematical(){
        temp = 0;
    }
    Mathematical(double temperature){
        temp = temperature;
    }
    public double sum(double num1, double num2){
        return num1 + num2;
    }
    public double subtract(double num1, double num2){
        return num1 - num2;
    }
    public double celsius2fahrenheit(){
        double fahrenheit = this.temp * 9.0 /5.0 + 32;
        return fahrenheit;
    }
    public double fahrenheit2celsius(){
        double celsius = (this.temp - 32) * 5.0 / 9.0;
        return celsius;
    }
}
