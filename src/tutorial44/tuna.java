package tutorial44;

/* Tutorial 44 AND 45: Enum
https://www.youtube.com/watch?v=r-_6fJpC-pk&list=PLFE2CE09D83EE3E28&index=44
 */
public enum tuna {
    IDEA("abcd", "lorem"),
    OUT("ad;fkadsf", "slakfsdf"),
    SRC("SDflkasdf", "sssssssssss"),
    JOHNSMITHAPPLES("lemme get uhhhh", "WHOSE MANS IS THIS??"),
    LEEDLELEEDLELEEDLELEE("yoooooooooteeeeeeee", "ahhhhhhhhhhhhhhhhh");

    private final String desc;
    private final String desc2;

    tuna(String description, String description2) {
        desc = description;
        desc2 = description2;
    }

    public String getDesc() {
        return desc;
    }

    public String getDesc2() {
        return desc2;
    }
//
//    @Override
//    public String toString() {
//        return getDesc();
//    }
}