package subC;

import com.sun.org.glassfish.gmbal.ManagedObject;
import enums.GederFor;
import enums.MaterialMain;
import enums.typeOfClothes;
import superC.Clothes;

public class Jeans extends Clothes {

    private typeOfClothes clothesJean;
    private MaterialMain materialMadeJ;
    private GederFor genderForJean;


    public GederFor getgenderForJean() {
        return genderForJean;
    }

    public void setgenderForJean(GederFor genderForJean) {
        this.genderForJean = genderForJean;
    }

    public void setGenderForJean(GederFor genderForJean) {
        this.genderForJean = genderForJean;
    }

    public void setMaterialMadeJ(MaterialMain materialMadeJ) {
        this.materialMadeJ = materialMadeJ;
    }

    public typeOfClothes getclothesJean() {
        return clothesJean;
    }

    public void setclothesJean(typeOfClothes clothesJean) {
        this.clothesJean = clothesJean;
    }

    public Jeans(String brand, String color, int size, typeOfClothes clothesJ, MaterialMain materialMade, GederFor genderForJ) {
        super(brand, color, size);
        this.clothesJean = clothesJean;
        this.materialMadeJ = materialMadeJ;
        this.genderForJean = genderForJean;
    }

    @Override
    public void wearingClothes() {
        System.out.println  ("I am puting on " + super.getBrand() + " " + "which is  /n " +
                "color that I like is " + super.getColor() + " " + genderForJean + " ," + "It is my style " + clothesJean);
    }
    @Override
    public void likeMyBrandS(){
        System.out.println(clothesJean+" "+ " is awesome in summer");
    }
    @Override
    public void printMat(){
        System.out.println(" It is " + " "+this.getBrand()+" " +"and it is made  of "+ materialMadeJ);
    }


    }

