import java.util.Scanner;
public class LAB4 {
    public enum DayOfWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
        public boolean isWorkday(){
            return (this!=SATURDAY && this!=SUNDAY);
        }
    }
    public  static void main(String[] args){
        System.out.println("Is Monday a workday?"+DayOfWeek.MONDAY.isWorkday());
        System.out.println("Is SATURDAY a workday?"+DayOfWeek.SATURDAY.isWorkday());
    }
}
