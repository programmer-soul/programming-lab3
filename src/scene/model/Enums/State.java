package scene.model.Enums;

public enum State {
    NIGHT("ночь"),
    GEN_NIGHT("ночи");
    String state;
    State(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
}
