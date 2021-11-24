package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions=new Dimensions(20,60,5);
        Case Case=new Case("320B","DELL.Inc","240",dimensions);
        Resolution resolution=new Resolution(1920,1080);
        Monitor monitor=new Monitor("440B","DELL.Inc",24,resolution);
        Motherboard motherboard=new Motherboard("6948C","DELL.INC",4,2,"v2.44");

        PersonalComputer personalComputer=new PersonalComputer(Case,monitor,motherboard);
        personalComputer.getCase().PressPowerButton();
        personalComputer.getMotherboard().LoadProgram("Windows 11");
        personalComputer.getMonitor().DrawPixelAt(45,54,"RED");




    }
}
