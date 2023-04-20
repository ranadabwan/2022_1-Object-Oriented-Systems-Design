package Week8;
 import java.util.*;

public abstract class Taxi {
    int carNum;
    double distance, income;
    public Taxi (int cNum) {
        carNum = cNum;
        distance = income = 0;
    }
    public String toString () {
        return "Car No: " + String.valueOf (carNum) + " Distance: " + String.valueOf (distance) +
                " Income: " + String.valueOf (income);
    }
    abstract void getPaid (double dist);
    public void doDrive (double dist) {
        getPaid (dist);
    }
    public boolean earnMore (Taxi t) { return income > t.income; }
}


