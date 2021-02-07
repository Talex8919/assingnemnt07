package subC;

import enums.GederFor;
import enums.MaterialMain;
import enums.typeOfClothes;
import superC.Clothes;

public class Tshirt extends Clothes {


private MaterialMain materialMainT;
    private typeOfClothes clothesT;
private GederFor genderFT;

    public GederFor getGenderFT() {
        return genderFT;
    }

    public void setGenderFT(GederFor genderFT) {
        this.genderFT = genderFT;
    }

    public typeOfClothes getClothesT() {
        return clothesT;
    }

    public void setClothesT(typeOfClothes clothesT) {
        this.clothesT = clothesT;
    }

    public MaterialMain getMaterialMainT() {
        return materialMainT;
    }

    public void setMaterialMainT(MaterialMain materialMainT) {
        this.materialMainT = materialMainT;
    }

    public Tshirt(String brand, String color, int size, MaterialMain materialMainT, typeOfClothes clothesT, GederFor genderFT) {
        super(brand, color, size);
        this.materialMainT = materialMainT;
        this.clothesT = clothesT;
    this.genderFT=genderFT;}
    @Override
    public void wearingClothes(){
        System.out.println  ("I am puting on " + super.getBrand() + " " + "which is  /n " +
                "color that I like is " + super.getColor() + " " + genderFT + " " + "It is my style " + clothesT);
    }
    @Override
    public void likeMyBrandS(){
        System.out.println(clothesT+" "+ " is awesome in autumn");
    }
    @Override
    public void printMat(){
        System.out.println(" It is " + " "+this.getBrand()+" " +"and it is made  of "+ materialMainT);
    }
}
