public class Dog extends Pet {

    public Dog() {
        this.type = "Dog";
        setOwner(owner);
    }

    @Override
    public void speak(){
        System.out.println("Woof");
    }

    @Override
    public void info(){
        System.out.println(Cat.class.getName()+" goes Woof");
    }
}
