public class HelloWorld {
    public static void main(String[] args) {
        tuna tunaObject1 = new tuna();
        tuna tunaObject2 = new tuna(5);
        tuna tunaObject3 = new tuna(5, 13);
        tuna tunaObject4 = new tuna(5, 13, 42);

        System.out.printf("%s\n", tunaObject1.toMilitaryTime());
        System.out.printf("%s\n", tunaObject2.toMilitaryTime());
        System.out.printf("%s\n", tunaObject3.toMilitaryTime());
        System.out.printf("%s\n", tunaObject4.toMilitaryTime());
      }
    }
