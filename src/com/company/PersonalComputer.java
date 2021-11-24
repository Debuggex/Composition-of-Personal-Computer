package com.company;

public class PersonalComputer {
    private Case Case;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(com.company.Case aCase, Monitor monitor, Motherboard motherboard) {
        Case = aCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public com.company.Case getCase() {
        return Case;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
