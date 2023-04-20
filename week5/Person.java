package Week5;

import java.time.LocalDate;

public class Person {

    private String name;
    private LocalDate born;
    private LocalDate died;
    public String getName() {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public LocalDate getBorn()
    {
        return born;
    }
    public void setBorn(LocalDate born)
    {
        this.born=born;
    }
    public LocalDate getDied()
    {
        return died;
    }
    public void setDied(LocalDate died)
    {
        this.died=died;

    }
    private static boolean consistent(LocalDate born, LocalDate died)
    {
        if(died==null)
        {
            return false;
        }
        else if(born==null)
        {
            return true;
        }
        else if(born.compareTo(died)<=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String result="Name: "+name+", Born in: "+ born.getMonth()+"/"+born.getDayOfMonth()+"/"+born.getYear();
        if(died!=null)
        {
            result+=", died in: "+died.getMonth()+"/"+died.getDayOfMonth()+"/"+died.getYear();
        }
        return result;
    }

    boolean equals(Person other)

    {
        if((other.name==name)&& datesMatch(other.born,born)&& datesMatch(other.died,died))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    private static boolean datesMatch(LocalDate date1, LocalDate date2)
    {
        if(date1.equals(date2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    public Person(String name,LocalDate born,LocalDate died)
    {
        if(!consistent(born,died))
        {
            System.out.println("Inconsistent dates");
            System.exit(0);
        }
        else {
            this.name=name;
            this.born=born;
            if(died!=null)
                this.died=died;
            else
                this.died=null;
        }
    }

}

