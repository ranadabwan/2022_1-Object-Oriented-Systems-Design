package Week5;

//import Week5.util.Person;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        String name="Xiao";
        LocalDate born=LocalDate.of(2001,4,12);
        LocalDate died=LocalDate.of(2099, 8, 9);
        Person obj=new Person(name,born,died);
        System.out.println(obj.toString());

    }

}
