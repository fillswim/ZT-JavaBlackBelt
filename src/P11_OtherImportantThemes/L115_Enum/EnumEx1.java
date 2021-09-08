package P11_OtherImportantThemes.L115_Enum;

public class EnumEx1 {
    public static void main(String[] args) {

        EnumEx1 enumEx = new EnumEx1(WeekDays.SATURDAY);
        enumEx.daysInfo();
    }

    WeekDays weekDay;

    public EnumEx1(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Go to work");
            case SATURDAY, SUNDAY -> System.out.println("Free day");
        }
    }
}

enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}
