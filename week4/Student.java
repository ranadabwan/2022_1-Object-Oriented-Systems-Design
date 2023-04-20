package Week4;
import java.util.*;

// Declared a class Student with all attributes and methods
class Student
{
    private String name;
    private int year,month,day;
    // The Random object is used to get day and month for the second student.
    Random rand = new Random();
    //  Initializes the attributes in the respective variables.
    Student(String name, int year, int month, int day)
    {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }
    // The second Student gets only name and year which is initialized.
    Student(String name,int year)
    {
        this.name = name;
        this.year = year;
        // the year is same as first Student.
        // month and day is generated randomly.
        // rand.nextInt(number) generates from 0 to number-1
        // So we add +1 to get from 0 to number.
        this.month = rand.nextInt(12)+1;
        // If the month is february and the year is a leap year then we generate a number upto 29
        if(this.month==2 && ((this.year%4==0) && (this.year%100!=0)) || (this.year%400==0))
        {
            this.day = rand.nextInt(29)+1;
        }
        //  If the month is february but not a leap year then we generate a number upto 28
        else if(this.month==2)
        {
            this.day = rand.nextInt(28)+1;
        }
        // Then we check the months which contains 31 days, and we generate a number upto 31 for those months
        else if(this.month==1 || this.month==3 || this.month==5 || this.month==7 || this.month==8 || this.month==10 || this.month==12)
        {
            this.day = rand.nextInt(31)+1;
        }
        //  else the month will contain 30 days, so we generate a number till 30.
        else
        {
            this.day = rand.nextInt(30)+1;
        }
    }
    // Since our attributes are private we use getters to get the attribute.
    // Here getName returns the name of the called object.
    String getName()
    {
        return this.name;
    }
    // getYear returns the year of the object.
    int getYear()
    {
        return this.year;
    }
    // getMonth returns the month of the object.
    int getMonth()
    {
        return this.month;
    }
    // getDay returns the day of the object
    int getDay()
    {
        return this.day;
    }
    // checkDate checks if the passed date is a valid date or not.
    boolean checkDate(int year,int month,int day)
    {
        // The month should be within 1-12 else returns false.
        if(month<1 || month>12)
        {
            return false;
        }
        // If the month is february and the year is leap year then the day should be within 29 else returns false.
        if(month==2 && ((year%4==0) && (year%100!=0)) || (year%400==0))
        {
            if(day>29)
            {
                return false;
            }
        }
        // If the month is february and the year is not a leap year then the day should be within 28 days else return false.
        else if(month==2 && day>28)
        {
            return false;
        }
        // Checks if the months contain within 31 days else returns false.
        else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        {
            if(day>31)
            {
                return false;
            }
        }
        // Checks if the months contain within 30 days else returns false.
        else if(day>30)
        {
            return false;
        }
        return true;

    }
    // Calculates the age of the date of birth that is passed.
    int calAge(int year, int month, int day)
    {
        // Creates an object for the passed date of birth and the current date.
        Calendar birth = new GregorianCalendar(year,month,day);
        Calendar today  = new GregorianCalendar();
        // Subtracts both the years to get the age with a few conditions.
        int age = today.get(Calendar.YEAR)-birth.get(Calendar.YEAR);
        // If the birth month is less than current month then we decrement age as the person has not yet celebrated the birthday.
        if(today.get(Calendar.MONTH)>birth.get(Calendar.MONTH))
        {
            age--;
        }
        //  If both month and year is same then we check with the day if the person has celebrated or not.
        // If not then decrement age by 1.
        else if(today.get(Calendar.MONTH)==birth.get(Calendar.MONTH) && (today.get(Calendar.DAY_OF_MONTH)<birth.get(Calendar.DAY_OF_MONTH)))
        {
            age--;
        }
        return age;
    }
    // Checks which object has the older age.
    boolean isOlder(Student stu)
    {
        // The calling object is accessed using this.
        // The passed object is accessed using the variable in parameter.
        // we Calculate the age of both objects and check who is older
        int prevAge = calAge(this.getYear(),this.getMonth(),this.getDay());
        int age = calAge(stu.getYear(),stu.getMonth(),stu.getDay());
        if(prevAge>age)
        {
            return true;
        }
        // If age is equal then we consider the month.
        else if(prevAge==age && this.month<stu.getMonth())
        {
            return true;
        }
        // If both age and month are equal then we consider the day.
        else if(prevAge==age && this.month==stu.getMonth() && this.day<stu.getDay())
        {
            return true;
        }
        return false;
    }
}