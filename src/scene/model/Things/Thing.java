package scene.model.Things;

import scene.model.Interface.Entity;

import java.util.Objects;

public class Thing implements Entity {
    String thing;
    String instCaseThing;
    String genCaseThing;
    String datCaseThing;
    String plurThings;
    String genCasePlurThings;

    public Thing(String thing, String instCaseThing, String genCaseThing, String datCaseThing, String plurThings, String genCasePlurThings){
        this.thing = thing;
        this.instCaseThing = instCaseThing;
        this.genCaseThing = genCaseThing;
        this.datCaseThing = datCaseThing;
        this.plurThings = plurThings;
        this.genCasePlurThings = genCasePlurThings;
    }
    @Override
    public String getName() {
        return this.thing;
    }
    public String getGenCaseName() {
        return this.genCaseThing;
    }
    public String getDatCaseName() {
        return this.datCaseThing;
    }

    public String getInstCaseName() {
        return this.instCaseThing;
    }

    public String getPlurName() {
        return this.plurThings;
    }

    public String getGenPlurName() {
        return this.genCasePlurThings;
    }

    @Override
    public String toString() {
        return "Thing {" +
                "thing=" + thing +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing stuff = (Thing) o;
        return Objects.equals(thing, stuff.thing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thing);
    }
}
