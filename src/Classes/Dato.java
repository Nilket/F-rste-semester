package Classes;

public class Dato {
    private int day;
    private int month;
    private int year;

    public Dato(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public Dato(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);

    }

    public void setDay(int day){
        this.day = day;
    }

    public void setMonth(int month){
        this.month = month;
    }

    public void setYear(int year){
        this.year = year;
    }

    public String setToday(){
        return ("dag: " + day + " Måned " + month + " Årstal " + year);
    }
}
