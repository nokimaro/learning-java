package tutorial48;
/* Tutorial 48: Final keyword
 */
public class Apple {
    private int sum;
    private final int NUMBER;

    public Apple(int x) {
        NUMBER = x;
    }

    public void add() {
        sum += NUMBER;
    }

    public  String toString() {
        return String.format("sum = %d\n", sum);
    }
}
