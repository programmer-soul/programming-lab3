package scene.model.Creatures;

import scene.model.Action.Action;
import scene.model.Place.Place;
import scene.model.Qualifers.Qualifier;
import scene.model.Things.Thing;
import scene.model.util.CreatureUtils;

import java.util.Objects;

public class CreatureImpl implements Creature{
    String name;
    int age;
    Gender gender;
    String genCaseName;

    public CreatureImpl(String name, String genCaseName, int age, Gender gender) {
        this.name = name;
        this.genCaseName = genCaseName;
        this.age = age;
        this.gender = gender;

    }
    @Override
    public String describe() {
        return String.format("%s, %s, %d лет",
                this.name, this.gender.getName(), this.age);
    }

    @Override
    public String getDestionation(Place place) {
        return place.getDestinationName();
    }

    @Override
    public String getPrepDestionation(Place place) {
        return place.getPrepCaseDestinationName();
    }

    @Override
    public String getGenDestionation(Place place) {
        return place.getGenCaseDestinationName();
    }

    @Override
    public String getGenName() {
        return this.genCaseName;
    }

    @Override
    public String action(Action action) {
        return action.getName();
    }

    @Override
    public String thing(Thing thing) {
        return thing.getName();
    }
    @Override
    public String genCaseThingName(Thing thing) {
        return thing.getGenCaseName();
    }
    @Override
    public String datCaseThingName(Thing thing) {
        return thing.getDatCaseName();
    }
    @Override
    public String instCaseThingName(Thing thing) {
        return thing.getInstCaseName();
    }

    @Override
    public String plurThingName(Thing thing) {
        return thing.getPlurName();
    }

    @Override
    public String genPlurThingName(Thing thing) {
        return thing.getGenPlurName();
    }

    @Override
    public String actionWith(Action action, Creature... creatures) {
        return String.join(" ",CreatureUtils.toString(creatures), "исполнили", action.getName());
    }

    @Override
    public Gender getGender() {
        return this.gender;
    }


    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String qualify(Qualifier qualifier) {
        return qualifier.getName();
    }

    @Override
    public String qualifyWith(Qualifier qualifier, Creature... creatures) {
        return String.join(" ", CreatureUtils.toString(creatures), "и", this.name, "выразили", qualifier.getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return "Человек {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreatureImpl creature = (CreatureImpl) o;
        return age == creature.age && Objects.equals(name, creature.name) && gender == creature.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
