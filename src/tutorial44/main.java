package tutorial44;
import java.util.EnumSet;
/* Tutorial 44 AND 45: Enum
https://www.youtube.com/watch?v=r-_6fJpC-pk&list=PLFE2CE09D83EE3E28&index=44
 */
public class main {
    public static void main(String[] args) {
        for (tuna people : tuna.values()) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getDesc2());
        }

        System.out.println("\n And now for the range\n");

        for(tuna people : EnumSet.range(tuna.IDEA, tuna.LEEDLELEEDLELEEDLELEE)) {
            System.out.printf("%s\t%s\t%s\n", people, people.getDesc(), people.getDesc2());

        }

    }
}
