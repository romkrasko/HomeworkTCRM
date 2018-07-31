public class Parrot extends Pet {

    private boolean isWave;

    public Parrot(int age, String name, Person owner, boolean isWave) {
        super(age, name, owner);
        this.isWave = isWave;
    }

    public boolean isWave() {
        return isWave;
    }

    public void setWave(boolean wave) {
        isWave = wave;
    }
}
