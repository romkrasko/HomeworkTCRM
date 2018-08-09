public class Person {
    private String name;
    private Pet pet;

    public Person(String name) {
        this.name = name;
    }

    public void acquiringPet(Pet pet){
        this.pet=pet;
    }
    public void acquiringPet(String name){
        this.pet=pet;
        this.pet.name=name;
    }
}
