package app;

public class DaysAdvice implements Motivator {

    @Override
    public void advice(Day day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY:
                System.out.println("Have no fear of perfection; " +
                        "you’ll never reach it.");
                break;
            case FRIDAY:
                System.out.println("Happy Friday!");
                break;
            case SATURDAY:
                System.out.println("Let`s go to the sea!");
                break;
            case SUNDAY:
                System.out.println("Lets` go home");
            default:
                System.out.println("You made a mistake somewhere");
        }
    }
}
