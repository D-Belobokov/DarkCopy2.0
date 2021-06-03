package Block2DeepCopy;

public class Engine implements Cloneable{
    private String model;
    private int volume;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public Engine(String model, int volume){
        this.model = model;
        this.volume = volume;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
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
