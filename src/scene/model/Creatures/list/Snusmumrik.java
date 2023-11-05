package scene.model.Creatures.list;

import scene.model.Creatures.CreatureImpl;
import scene.model.Creatures.Gender;


public class Snusmumrik extends CreatureImpl {
    private Snusmumrik(){
        super("Снусмумрик","Снусмурика",30,Gender.MALE);
    }
    private static Snusmumrik instance = null;

    public static Snusmumrik getInstance() {
        if (instance == null) instance = new Snusmumrik();
        return instance;
    }
}
