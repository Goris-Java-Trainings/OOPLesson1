package enums;

public enum WeakDay {
    MONDAY("MONDAY", 8),
    TUESDAY("TUESDAY", 8),
    WEDNESDAY("WEDNESDAY", 8),
    THURSDAY("THURSDAY", 8),
    FRIDAY("FRIDAY", 8),
    SATURDAY("SATURDAY", 4),
    SUNDAY("SUNDAY", 0);

    public final String dayName;
    public final int workingHours;

    WeakDay(String dayName, int workingHours) {
        this.dayName = dayName;
        this.workingHours = workingHours;
    }

    // TODO final, static will be covered for next Lessons
}
