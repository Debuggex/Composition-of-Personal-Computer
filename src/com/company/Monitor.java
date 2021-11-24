package com.company;

public class Monitor {
    private String Model;
    private String Manufacturer;
    private int Size;
    private Resolution NativeResoultion;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResoultion) {
        Model = model;
        Manufacturer = manufacturer;
        Size = size;
        NativeResoultion = nativeResoultion;
    }

    public void DrawPixelAt(int x, int y, String color){
        System.out.println("Drawing Pixel at "+ x +","
                +y+" In Color "+color);
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public int getSize() {
        return Size;
    }

    public Resolution getNativeResoultion() {
        return NativeResoultion;
    }
}
