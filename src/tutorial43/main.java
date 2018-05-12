package tutorial43;

/* Tutorial 43
 */

public class main {
    public static void main(String[] args) {
        date johnDate = new date(1, 1, 1990);
        person john = new person("John", johnDate);

        System.out.println(john.toString());
    }
}
