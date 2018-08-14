import java.util.Map;
import java.util.HashMap;

public class Person {
    private String name;

    Map pet = new HashMap<String, Pet>();

    public Person(String name) {
        this.name = name;
    }

    public void acquiringPet(String name, Pet pet){
        this.pet.put(Pet.class.getName(),this.pet);
        pet.setOwner(this);
    }
}