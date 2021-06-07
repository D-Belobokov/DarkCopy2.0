package Block2DeepCopy;

public class Engine implements Cloneable{
    private final String model;
    private final int volume;

    @Override
    public Engine clone() throws CloneNotSupportedException {
        return (Engine) super.clone();
    }
    public Engine(String model, int volume){
        this.model = model;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + model + '\'' +
                "volume='" + volume + '\'' +
                '}';
    }
}
