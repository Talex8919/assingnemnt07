package subC;

import enums.GederFor;
import enums.MaterialMain;
import enums.typeOfClothes;
import superC.Clothes;

public class Shirt extends Clothes {

    private typeOfClothes clothsS;
 private MaterialMain materialMainS;
 private GederFor genderforS;

    public GederFor getGenderforS() {
        return genderforS;
    }

    public void setGenderforS(GederFor genderforS) {
        this.genderforS = genderforS;
    }

    public typeOfClothes getClothsS() {
        return clothsS;
    }

    public void setClothsS(typeOfClothes clothsS) {
        this.clothsS = clothsS;
    }

    public MaterialMain getMaterialMainS() {
        return materialMainS;
    }

    public void setMaterialMainS(MaterialMain materialMainS) {
        this.materialMainS = materialMainS;
    }

    public Shirt(String brand, String color, int size, typeOfClothes clothsS, MaterialMain materialMainS, GederFor genderforS) {
        super(brand, color, size);
        this.clothsS = clothsS;
        this.materialMainS = materialMainS;
        this.genderforS=genderforS;
    }
    @Override
    public void wearingClothes(){
        System.out.println  ("I am puting on " + super.getBrand() + " " + "which is  /n " +
                "color that I like is " + super.getColor() + " " + genderforS + " " + "It is my style " + clothsS);
    }
    @Override
    public void likeMyBrandS(){
        System.out.println(clothsS+" "+ " is awesome in spring");
    }
    @Override
    public void printMat(){
        System.out.println(" It is " + " "+this.getBrand()+" " +"and it is made  of "+ materialMainS);
    }
}
