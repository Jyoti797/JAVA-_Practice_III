public class demo13 {
    public static void main(String[] args) {
        for(DayOfWeek d : DayOfWeek.values()){
            System.out.println(d);
        }

        
    }
     public enum DayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
   
}

