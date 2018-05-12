package tutorial43;

public class person {
    private String name;
    private date dateOfBirth;

    public person(String personName, date dateOfBirth) {
        this.name = personName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("My name %s; date of birth is %s.", this.name, this.dateOfBirth);
    }
}
