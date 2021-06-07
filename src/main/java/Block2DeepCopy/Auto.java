package Block2DeepCopy;

public class Auto implements Cloneable {
    private String name;
    private String brand;
    private String model;
    private Engine engine;

    public Auto(String name, String brand, String model){
        this.name = name;
        this.brand = brand;
        this.model = model;
    }
    public Auto(String name, String brand, String model, Engine engine){
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
       this.engine = engine;
    }
    public Engine getEngine(){
        return engine;
    }
    @Override
    public Auto clone() throws CloneNotSupportedException {
        Auto newAuto = (Auto) super.clone();
        //Engine engine = this.getEngine().clone();
        newAuto.setEngine(engine);
        return newAuto;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Auto{" +
                ",name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ((engine != null) ?", motor='" + engine + '\'' : "") +
                '}';
    }
}