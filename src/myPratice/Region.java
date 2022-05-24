package myPratice;

public enum Region {
    NE("Ajegunle", "Ikeja","Abuja"),
    SE("VI","BI"),
    SW("Mushin","ketu", "okoko","Ipaja"),
    NC("Ibadan", "Ekiti","Ijebu"),
    SS("Sabo","Bariga","Somolu"),
    NW("Challenge","Molete","Mowe");

    private String[ ]states;

    Region(String... states){
        this.states = states;
    }
}
