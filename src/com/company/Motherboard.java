package com.company;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int Ramslots;
    private int Cardslots;
    private String BIOS;

    public Motherboard(String model, String manufacturer, int ramslots, int cardslots, String BIOS) {
        this.model = model;
        this.manufacturer = manufacturer;
        Ramslots = ramslots;
        Cardslots = cardslots;
        this.BIOS = BIOS;
    }

    public void LoadProgram(String ProgramName ){
        System.out.println("Program "
        + ProgramName +
                " is Loading.");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamslots() {
        return Ramslots;
    }

    public int getCardslots() {
        return Cardslots;
    }

    public String getBIOS() {
        return BIOS;
    }
}
