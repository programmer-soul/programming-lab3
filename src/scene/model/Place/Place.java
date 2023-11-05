package scene.model.Place;

import scene.model.Interface.Entity;

import java.util.Objects;

public class Place implements Entity {
    String destination;
    String genCaseDestination;
    String prepCaseDestination;

    public Place(String destination, String genCaseDestination, String prepCaseDestination) {
        this.destination = destination;
        this.genCaseDestination = genCaseDestination;
        this.prepCaseDestination = prepCaseDestination;
    }
    public String getDestinationName() {
        return this.destination;
    }
    public String getGenCaseDestinationName() {
        return this.genCaseDestination;
    }
    public String getPrepCaseDestinationName() {
        return this.prepCaseDestination;
    }


    @Override
    public String getName() {
        return this.destination;
    }
    @Override
    public String toString() {
        return "Место {" +
                "name='" + destination + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return Objects.equals(destination, place.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination);
    }
}
