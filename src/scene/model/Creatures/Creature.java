package scene.model.Creatures;

import scene.model.Action.Action;
import scene.model.Interface.Entity;
import scene.model.Place.Place;
import scene.model.Qualifers.Qualifier;
import scene.model.Things.Thing;

public interface Creature extends Entity {
    String describe();
    String action(Action action);
    String thing(Thing thing);
    String genCaseThingName(Thing thing);
    String instCaseThingName(Thing thing);
    String datCaseThingName(Thing thing);
    String plurThingName(Thing thing);
    String genPlurThingName(Thing thing);
    String getDestionation(Place place);
    String getPrepDestionation(Place place);
    String getGenDestionation(Place place);
    String getGenName();
    String actionWith(Action action, Creature... creatures);
    Gender getGender();
    int getAge();
    String qualify(Qualifier qualifier);
    String qualifyWith(Qualifier qualifier, Creature... creatures);



}
