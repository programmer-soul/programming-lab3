package scene.model.Enums;

public enum Punctuation {
    DOT("."),
    COMMA(","),
    ELLIPSIS("..."),
    EXCL_POINT("!"),
    COLON(":");



    String punct;
    Punctuation(String punct){
        this.punct = punct;
    }
    public String getPunct(){
        return this.punct;
    }
}
