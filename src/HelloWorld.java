public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(average(39,49,393,29,404,493,2939));
      }

      public static int average(int...numbers) {
        int total = 0;
        for(int i : numbers) {
            total += i;
        }

        return total/numbers.length;

      }
    }
