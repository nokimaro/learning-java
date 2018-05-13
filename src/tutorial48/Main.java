package tutorial48;
/* Tutorial 48: Final keyword
 */

public class Main {
    public static void main(String[] args) {
        Apple appleObject = new Apple(10);

        for(int i = 0; i < 5; i++) {
            appleObject.add();
            System.out.printf("%s", appleObject.toString());
        }
    }
}
