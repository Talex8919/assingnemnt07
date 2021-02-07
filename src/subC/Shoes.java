package subC;

import enums.GederFor;
import enums.MaterialMain;
import enums.typeOfClothes;
import superC.Clothes;

public class Shoes extends Clothes {
    private typeOfClothes clothesS;
    private MaterialMain materialMainSH;
private GederFor genderFS;

    public GederFor getGenderFS() {
        return genderFS;
    }

    public void setGenderFS(GederFor genderFS) {
        this.genderFS = genderFS;
    }


    public MaterialMain getMaterialMainSH() {
        return materialMainSH;
    }

    public void setMaterialMainSH(MaterialMain materialMainSH) {
        this.materialMainSH = materialMainSH;
    }

    public Shoes(String brand, String color, int size, typeOfClothes clothesS, MaterialMain materialMainSH, GederFor genderFS) {
        super(brand, color, size);
        this.clothesS = clothesS;
        this.materialMainSH = materialMainSH;
    this.genderFS=genderFS;}


    public typeOfClothes getClothesS() {
        return clothesS;
    }

    public void setClothesS(typeOfClothes clothesS) {
        this.clothesS = clothesS;
    }
    @Override
    public void wearingClothes(){
        System.out.println  ("I am puting on " + super.getBrand() + " " + "which is  /n " +
                "color that I like is " + super.getColor() + " " + genderFS + " " + "It is my style " + clothesS);
    }
    @Override
    public void likeMyBrandS(){
        System.out.println(clothesS+" "+ " is awesome in summer");

    }
    @Override
    public void printMat(){
        System.out.println(" It is " + " "+this.getBrand()+" " +"and it is made  of "+ materialMainSH);
    }




}

