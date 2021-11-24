package com.company;

public class Case {
    private String Model;
    private String Manufacturer;
    private String PowerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        Model = model;
        Manufacturer = manufacturer;
        PowerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void PressPowerButton(){
        System.out.println("Power Button is Pressed. System is Booting");
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public String getPowerSupply() {
        return PowerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
