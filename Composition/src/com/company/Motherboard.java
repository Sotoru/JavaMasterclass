package com.company;

public class Motherboard {

    private String model;
    private String manufacture;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacture, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacture = manufacture;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String progName) {
        System.out.println("Program" + progName + " is now loading.....");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}

