package Stock;

public enum InstrumentType {

    KEYBOARD("Keyboard"),
    STRING("String"),
    BRASS("Brass");

    private String name;

    InstrumentType(String name) {
        this.name = name;
    }

    public String getType() {
        return name;
    }
}
