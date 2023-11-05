package scene.model.Creatures.list;

import scene.model.Creatures.CreatureImpl;
import scene.model.Creatures.Gender;

public class MumiTroll extends CreatureImpl {
    private MumiTroll(){
        super("Муми-тролль","Муми-тролля",25, Gender.MALE);
    }
    private static MumiTroll instance = null;

    public static MumiTroll getInstance() {
        if (instance == null) instance = new MumiTroll();
        return instance;
    }
}
