package tutorial42;

/* Tutorial 42: toString
https://www.youtube.com/watch?v=l0N6WvIVoUI&list=PLFE2CE09D83EE3E28&index=41
 */
public class tutorial42 {
    private int month;
    private int day;
    private int year;

    public tutorial42(int m, int d, int y) {
        month = m;
        day = d;
        year = y;

        System.out.printf("The constructor for this is: %s \n", this);
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
