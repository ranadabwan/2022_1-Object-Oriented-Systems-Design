package Week8;

public class DeluxeTaxi extends Taxi {
    double farePerKilometer;
    double baseDistance;
    double baseFee;
    public DeluxeTaxi (int cNum, double kmRate) {
        super (cNum);
        baseDistance = 3;
        baseFee = 5;
        farePerKilometer = Math.max (baseFee / baseDistance, kmRate);
    }
    public String toString () {
        return "Deluxe: " + super.toString () + " Rate per km: " + String.valueOf (farePerKilometer);
    }
    void getPaid (double d) {
        income = baseFee + Math.max (0, d - baseDistance) * farePerKilometer;
    }
}
