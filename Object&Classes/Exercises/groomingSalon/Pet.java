package Exercises.groomingSalon;

public class Pet {
    private String name;
    private int age;
    private String owner;

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
//        return name + " " + age + " - " + "(" + owner + ")";
        return String.format("%s %d - (%s)", name, age, owner);
    }
}
