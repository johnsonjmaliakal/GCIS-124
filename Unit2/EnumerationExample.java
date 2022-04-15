

public class EnumerationExample {

    public static enum Day {Sunday, Saturday, Monday, Tuesday, Wednesday, Thursday, Friday};

    public static boolean isHoliday(Day day){
        if(day == Day.Friday || day == Day.Saturday)
            return true;
        else
            return false;   
    }
    public static void main(String[] args){   
        Day day1 = Day.Wednesday;
        
        if(isHoliday(day1))
            System.out.println(day1.name() + " is a holiday");
        else
            System.out.println(day1.name() + " is not a holiday");    
    }
}

