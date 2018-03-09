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


}
