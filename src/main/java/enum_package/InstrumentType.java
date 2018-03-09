package enum_package;

public enum InstrumentType {

    WIND("Wind Instrument"),
    STRING("String Instrument"),
    PERCUSSION("Percussion Instrument");

    private final String decriptionType;

    InstrumentType(String decriptionType){
        this.decriptionType = decriptionType;
    }

    public String getDecriptionType(){
        return this.decriptionType;
    }


    //return the enum constant as contained in InstrumentType enum class
    public static String getValue() {
        InstrumentType result = null;
        for (InstrumentType value : InstrumentType.values()) {
            if (value == WIND) {
                result = value;
            }
            else if (value == STRING) {
                result = value;
            }
            else if (value == PERCUSSION) {
                result = value;
            }
        }
        return result.toString();
    }

}
