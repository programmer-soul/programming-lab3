package scene.model.Action;

import scene.model.Interface.Entity;

import java.util.Objects;

public class Action implements Entity {
    String action;
    public Action(String action){
        this.action = action;
    }

    @Override
    public String getName() {
        return this.action;
    }

    @Override
    public String toString() {
        return "Действие {" +
                "action='" + action + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Action action1 = (Action) o;
        return Objects.equals(action, action1.action);
    }

    @Override
    public int hashCode() {
        return action.hashCode();
    }
}
