package sections.sec44_Inheritance;

/*
    NOTE: Bu class inheritance yapılmadan nasıl olduğunu gösteriyor
    NOTE: "EngineArranged" adında yeni bir class oluşturdum ve inheritance yapısını orada gösterdim

    One part of the car is the engine.
    As is the case with all parts, the engine also has a manufacturer, an identifier and a description.
    In addition, each engine has a type: for instance, an internal combustion engine, an electric motor, or a hybrid engine.

    We notice a significant amount of overlap between the contents of Engine and Part.
    It can confidently be said the Engine is a special case of Part.
    The Engine is a Part, but it also has properties that a Part does not have, which in this case means the "engine type"

*/

public class Engine {
    private String engineType;
    private String identifier;
    private String manufacturer;
    private String description;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        this.engineType = engineType;
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getIdentifier() {
        return identifier;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }
}


