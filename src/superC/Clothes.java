package superC;

import enums.MaterialMain;
import interfaces.InterfMeth;

public abstract class Clothes implements InterfMeth {
    private String brand;
    private String color;
    private int size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Clothes(String brand, String color, int size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public void wearingClothes() {
        System.out.println("Looks Like");
    }

    public Clothes() {

    }

    public void likeMyBrandS() {

    }


    public void printMat() {
        System.out.println();
    }
}



