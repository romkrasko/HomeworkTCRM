public class Pet extends Animal {
    protected int age;
    public String name;
    protected Person owner;

    public Pet() {
    }

    public Pet(String speakWord, int age, String name, Person owner) {
        super(speakWord);
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void speak(){
        System.out.println(name);
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}