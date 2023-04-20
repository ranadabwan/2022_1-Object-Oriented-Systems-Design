package Week8;

public class GeneralTaxi extends Taxi {
    double farePerKilometer;
    double baseDistance;
    double baseFee;
    public GeneralTaxi (int cNum, double kmRate) {
        super (cNum);
        farePerKilometer = kmRate;
        baseDistance = baseFee = 3;
    }
    public String toString () {
        return super.toString () + " Rate per km: " + String.valueOf (farePerKilometer);
    }
    void getPaid (double d) {
        income = baseFee + Math.max (0, d - baseDistance) * farePerKilometer;
    }
}
