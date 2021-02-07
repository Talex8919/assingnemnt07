package subC;

import enums.GederFor;
import enums.MaterialMain;
import enums.typeOfClothes;
import interfaces.InterfMeth;
import superC.Clothes;

public class Jackets extends Clothes  implements InterfMeth {

    private MaterialMain materialMainJacket;
    private typeOfClothes clothesJ;
private GederFor gederForJ;



    public Jackets(String brand, String color, int size, MaterialMain materialMainJacket, typeOfClothes clothesJ, GederFor gederForJ) {
        super(brand, color, size);
        this.materialMainJacket = materialMainJacket;
        this.clothesJ = clothesJ;
        this.gederForJ=gederForJ;}

    public MaterialMain getMaterialMainJacket() {
        return materialMainJacket;
    }

    public void setMaterialMainJacket(MaterialMain materialMainJacket) {
        this.materialMainJacket = materialMainJacket;
    }

    public typeOfClothes getClothesJ() {
        return clothesJ;
    }


    public void setClothesJ(typeOfClothes clothesJ) {
        this.clothesJ = clothesJ;
    }

    public GederFor getGederForJ() {
        return gederForJ;
    }

    public void setGederForJ(GederFor gederForJ) {
        this.gederForJ = gederForJ;
    }
    @Override
    public  void wearingClothes(){
        System.out.println("I am puting on "+ super.getBrand()+" "+"which is  /n " +
                "color that I like is "+ super.getColor()+" "+ gederForJ+" "+"It is my style " + clothesJ);
    }
    @Override
    public void likeMyBrandS(){
        System.out.println(clothesJ+" "+ " is awesome in winter");

    }
    @Override
    public void printMat(){
        System.out.println(" It is " + " "+this.getBrand()+" " +"and it is made  of "+ materialMainJacket);
    }

}
