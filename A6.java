public class A6
{
    public static void main(String[] args)    {
        Date d1=new Date();
        Date d2=new Date(30,12,2020);
        Date d3=new Date(31,12,2020);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d1.equals(d2));
        System.out.println(d1.equals(d3));
    }
}
class Date {
    private int year,month,day;

    public Date()    {
        this.year=2020;
        this.month=12;
        this.day=30;
    }

    public Date(int day, int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }

    //4. Write getters and setters for year, month, and day
    //(getYear, setYear, getMonth, setMonth, getDay, setDay).
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }

    public String toString() {
        return month + "/" + day + "/" + year;
    }

    public boolean equals(Date d1)
    {
        return d1.year == this.year && this.month == d1.month && this.day == d1.day;
    }

}