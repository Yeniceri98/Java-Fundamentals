package sections.sec44_Inheritance;

public class EngineArranged extends Part {
    private String engineType;

    public EngineArranged(String engineType, String identifier, String manufacturer, String description) {
        super(identifier, manufacturer, description);       // NOTE: super, contructor'ın ilk satırında olmak zorundadır
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }
}


/*
    The class definition "public class EngineArranged extends Part" indicates that the class "EngineArranged" inherits the functionality of the class "Part"
    We also define an object variable "engineType" in the class Engine.

    The constructor of the EngineArranged class is worth some consideration.
    On its first line we use the keyword "super" to call the constructor of the superclass.
    The call super(identifier, manufacturer, description) calls the constructor public Part(String identifier, String manufacturer, String description) which is defined in the class Part.
    Through this process the object variables defined in the superclass are initiated with their initial values.
    After calling the superclass constructor, we also set the proper value for the object variable "engineType"

    The super call bears some resemblance to the this call in a constructor.
    "this" is used to call a constructor of this class
    "super" is used to call a constructor of the superclass.
    If a constructor uses the constructor of the superclass by calling super in it, the super call must be on the first line of the constructor.
    This is similar to the case with calling this (must also be the first line of the constructor).
*/
