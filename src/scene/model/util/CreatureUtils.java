package scene.model.util;

import scene.model.Creatures.Creature;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CreatureUtils {
    public static String toString(Creature... creatures) {
        final String names = Arrays.stream(creatures)
                .map(Creature::getName)
                .map(name -> String.join(" ", name, "и", ""))
                .collect(Collectors.joining());
        return names.substring(0, names.length() - 2);
    }
}
