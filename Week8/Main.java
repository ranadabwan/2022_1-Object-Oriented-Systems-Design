package Week8;

//given skeleton code
public class Main {
    public static void main(String[] args) {
        Taxi t1 = new GeneralTaxi(12345, 2.1);
        //double v = 6.1;
        Taxi t2 = new DeluxeTaxi(2345, 6.1);


        System.out.println(t1.toString());
        System.out.println(t2.toString());


        t1.doDrive( 5.2);
        t1.doDrive(2.4);

        t2.doDrive(5);


        System.out.println(t1.toString());
        System.out.println(t2.toString());
        if (t1.earnMore(t2)){
            System.out.println("t1 earn more than t2");
        }else {
            System.out.println("t2 earn more than t1");
        }
    }
}