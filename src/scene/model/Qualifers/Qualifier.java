package scene.model.Qualifers;

import scene.model.Interface.Entity;

import java.util.Objects;

public class Qualifier implements Entity {
    String qualifier;
    public Qualifier(String qualifier){
        this.qualifier = qualifier;
    }
    @Override
    public String getName() {
        return this.qualifier;
    }
    @Override
    public String toString() {
        return "Qualifer {" +
                "qualifier='" + qualifier + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Qualifier qualifer = (Qualifier) o;
        return Objects.equals(qualifier, qualifer.qualifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(qualifier);
    }
}
