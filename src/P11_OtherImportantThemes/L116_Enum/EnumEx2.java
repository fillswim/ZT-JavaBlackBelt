package P11_OtherImportantThemes.L116_Enum;

public class EnumEx2 {
    public static void main(String[] args) {

        EnumEx2 enumEx = new EnumEx2(WeekDays.SATURDAY);
        enumEx.daysInfo();
        System.out.println(enumEx.getWeekDay().getMood());

    }

    WeekDays weekDay;

    public EnumEx2(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    public WeekDays getWeekDay() {
        return weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("Go to work");
            case SATURDAY, SUNDAY -> System.out.println("Free day");
        }
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("great"),
    SUNDAY("good");

    private String mood;

    WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
