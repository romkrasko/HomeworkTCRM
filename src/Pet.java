public class Pet implements Animal {
    protected int age;
    public String name;
    protected Person owner;
    protected String speakWord;
    protected String type;

    public Pet() {
    }

    public Pet(int age, String name, Person owner) {
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    public void info() {
        System.out.println(Pet.class.getName()+" goes "+getSpeakWord());
    }

    public void speak(){
        System.out.println(name);
    }

    public Person getOwner() {
        return owner;
    }

    public String getSpeakWord() {
        return speakWord;
    }

    public void setSpeakWord(String speakWord) {
        this.speakWord = speakWord;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

}