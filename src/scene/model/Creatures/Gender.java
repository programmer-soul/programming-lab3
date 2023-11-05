package scene.model.Creatures;

public enum Gender {
    MALE("он", "мужчина"),
    FEMALE("она", "женщина");

    String prefix;
    String name;

    Gender( String prefix, String name) {
        this.prefix = prefix;
        this.name = name;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getName() {
        return name;
    }
}
