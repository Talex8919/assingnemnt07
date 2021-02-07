package subC;

import enums.GederFor;
import enums.MaterialMain;
import enums.typeOfClothes;
import superC.Clothes;

public class Dresses extends Clothes  {
  private typeOfClothes clthesT;
  private MaterialMain materialMadeD;
  private GederFor genderForD;

    public MaterialMain getMaterialMadeD() {
        return materialMadeD;
    }

    public GederFor getGenderForD() {
        return genderForD;
    }

    public void setGenderForD(GederFor genderForD) {
        this.genderForD = genderForD;
    }

    public MaterialMain getGetMaterialMadeD() {
        return getGetMaterialMadeD();
    }



    public void setMaterialMadeD(MaterialMain materialMadeD) {
        this.materialMadeD = materialMadeD;
    }

    public Dresses(String brand, String color, int size, typeOfClothes clthesT, MaterialMain materialMadeD,GederFor genderForD) {
        super(brand, color, size);
        this.clthesT = clthesT;
        this.materialMadeD = materialMadeD;
        this.genderForD= genderForD;
    }

    public typeOfClothes getClthesT() {
        return clthesT;
    }

    public void setClthesT(typeOfClothes clthesT) {
        this.clthesT = clthesT;
    }
    @Override
    public void wearingClothes(){
        System.out.println  ("I am puting on " + super.getBrand() + " " + "which is  /n " +
                "color that I like is " + super.getColor() + " " + genderForD + " " + "It is my style " + clthesT);
    }

}
