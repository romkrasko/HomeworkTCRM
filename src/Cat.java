public class Cat extends Pet{
    private String sex;
    private String breed;
    private boolean inCafe;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //default
    public Cat(){
        inCafe=true;
        type="Cat";
    }

    //name and sex
    public Cat(String name, String sex){
        this.name=name;
        this.sex=sex;
        this.inCafe = true;
        this.type="Cat";
    }

    //all fields
    public Cat(String name, String sex, String breed, boolean inCafe){
        this.name=name;
        this.sex=sex;
        this.breed=breed;
        this.inCafe=inCafe;
        this.type="Cat";
    }

    public String getName() {
        return name;
    }
    public String getSex() {
        return sex;
    }
    public String getBreed() {
        return breed;
    }
    public boolean isInCafe() {
        return inCafe;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public void setInCafe(boolean inCafe) {
        this.inCafe = inCafe;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }


    public void takeAwayFromCafe(Person owner) {
        if (isInCafe()){
            setInCafe(false);
            setOwner(owner);
        }
    }

    @Override
    public void speak(){
        System.out.println("Meow");
    }

    @Override
    public void info(){
        System.out.println(Cat.class.getName()+" goes Meow");
    }

}
