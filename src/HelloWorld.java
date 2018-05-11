public class HelloWorld {
    public static void main(String[] args) {
        int john[] = {1, 2, 3, 4, 5};
        int sum = 0;

        for(int i : john) {
            sum += i;
        }

        System.out.println("The sum of these numbers is: " + sum);
    }
}
