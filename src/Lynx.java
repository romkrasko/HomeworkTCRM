public class Lynx extends Animal {
    public Lynx() {
        this.type = "Lynx";
    }

    @Override
    public void speak(){
        System.out.println("I'm a Lynx");
    }

    @Override
    public void info(){
        System.out.println(Cat.class.getName()+" goes I'm a Lynx");
    }

}
