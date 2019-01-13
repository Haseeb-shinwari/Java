
public class Date {

   int day;
   int month;
   int year;
   public Date(int  day,int month,int year){
       this.day=day;
       this.month=month;
       this.year=year;
       
   }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
   
    public String toString(){
        return String.format("%d/%d/%d", getDay(),getMonth(),getYear());
    }
    
}
