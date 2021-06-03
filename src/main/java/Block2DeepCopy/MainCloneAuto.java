package Block2DeepCopy;

import java.lang.reflect.Field;

public class MainCloneAuto {
    public static void main(String[] args) throws CloneNotSupportedException {

        Auto auto = new Auto("Дмитрий","Ford","Focus");
        System.out.println(auto);

        Auto villageAuto = auto.clone();
        villageAuto.setName("Вася");
        villageAuto.setBrand("Енисей");
        villageAuto.setModel("Комбайн");
        System.out.println(villageAuto);

        Auto autoVillage2 = auto.clone();
        Engine engine = new Engine("Cummins",+ 15);
        autoVillage2.setName("Вася");
        autoVillage2.setBrand("Енисей");
        autoVillage2.setModel("Комбайн");
        autoVillage2.setEngine(engine);
        System.out.println(autoVillage2);
    }
}