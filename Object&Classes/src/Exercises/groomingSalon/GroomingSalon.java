package Exercises.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.data.size() < this.capacity)
            data.add(pet);
    }

    public boolean remove(String name) {
        for (Pet pet : data) {
            if (pet.getName().equals(name)) {
                data.remove(pet);
                return true;
            }
        }
        return false;
    }

    //    public Pet getPet(String name, String owner) {
//        for (Pet pet : data) {
//            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
//                return pet;
//            }
//        }
//        return null;
//    }
    public Pet getPet(String name, String owner) {
        return this.data.stream()
                .filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String getStatistics() {
        String result = "The grooming salon has the following clients:" + "\n";
        for (Pet pet : data) {
            result += pet.getName() + " " + pet.getOwner() + "\n";
        }
        return result;
    }
}
