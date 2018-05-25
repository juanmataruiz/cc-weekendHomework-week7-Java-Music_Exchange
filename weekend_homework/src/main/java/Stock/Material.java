package Stock;

public enum Material {

    PLASTIC("Plastic"),
    WODO("Wood"),
    METAL("Metal");

    private String name;

    Material(String name) {
        this.name = name;
    }

    public String getMaterialName() {
        return name;
    }
}
