package EnumTutorial;

public class EnumPractice {
    public static void checkWeekend(DaysOfTheWeek day) {
        if(day == DaysOfTheWeek.FRIDAY || day == DaysOfTheWeek.SATURDAY) {
            System.out.println("Hurray!!! It's weekend day");
        }else {
            System.out.println("Alas! It's work day");
        }
    }
    public static void main(String[] args) {
        System.out.println("*********Enum is for pre-defined values*******");

        DaysOfTheWeek day_one = DaysOfTheWeek.FRIDAY;

        System.out.println(day_one);
        System.out.println(day_one.ordinal());

        checkWeekend(day_one);

        DaysOfTheWeek[] days = DaysOfTheWeek.values();

        for(DaysOfTheWeek day: days) {
            System.out.println(day);
        }
        
        System.out.println(days);

        System.out.println(DaysOfTheWeek.valueOf("FRIDAY"));


        for(DaysOfTheWeek myDay: DaysOfTheWeek.values()) {
            System.out.println(myDay.ordinal());
            // System.out.println(myDay.compareTo(day_one));
            // System.out.println(myDay.toString());
            // System.out.println(myDay.name());
        }

    }
}
