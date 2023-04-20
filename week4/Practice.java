package Week4;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice
{
    public static void main(String[] args) {
        // Gets the name along with date of birth for the first student.
        Scanner sc = new Scanner(System.in);
        String firstStu = sc.nextLine();
        // Using StringTokenizer first separates the name and date of birth.
        StringTokenizer a = new StringTokenizer(firstStu," ");
        String name = a.nextToken();
        // Next separates the date of birth into day month and year.
        StringTokenizer b = new StringTokenizer(a.nextToken(),"\\.");
        int year = Integer.parseInt(b.nextToken());
        int month = Integer.parseInt(b.nextToken());
        int day = Integer.parseInt(b.nextToken());
        // Creates a object for the first student
        Student first = new Student(name,year,month,day);
        String secondStu = sc.nextLine();
        // Creates a object for the second student with the inputted name and the year of first student.
        Student second = new Student(secondStu,year);
        // Checks if the first date is valid or not.
        if(!first.checkDate(year,month,day))
        {
            System.out.println("Invalid input");
        }
        // Now prints the students name and age.
        System.out.println(first.getName()+"  "+year+"/"+month+"/"+day+" age: "+first.calAge(year,month,day));
        System.out.println(second.getName()+"  "+year+"/"+second.getMonth()+"/"+second.getDay()+" age: "+second.calAge(year,month,day));
        // Checks and prints who is elder one.
        if(first.isOlder(second))
        {
            System.out.println(first.getName()+" is older than "+second.getName());
        }
        else if(second.isOlder(first))
        {
            System.out.println(second.getName()+" is older than "+first.getName());
        }
        else
        {
            System.out.println("Both are of same age.");
        }
    }
}