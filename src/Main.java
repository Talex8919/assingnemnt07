import enums.GederFor;
import enums.MaterialMain;
import enums.fashionTypes;
import enums.typeOfClothes;
import subC.*;
import superC.Clothes;

import static jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType.W;

public class Main {

    public static void main(String[] args) {

        Dresses dressT1= new Dresses(" LOUIS VUITTON", " Pinky",45, typeOfClothes.CLASSIC, MaterialMain.SILK, GederFor.FEMALE);
        Dresses dressT2= new Dresses(" GUCCI", " Black Metallic",43, typeOfClothes.CLASSIC, MaterialMain.WOOL,GederFor.FEMALE);
        Dresses dressT3= new Dresses(" HERMES", " Mixed Colors",50, typeOfClothes.SPORT, MaterialMain.MIXED,GederFor.FEMALE);
        Dresses dressT4= new Dresses("PRADA", "Pinky-red", 35, typeOfClothes.CLASSIC, MaterialMain.COTTON,GederFor.FEMALE);
        Dresses dressT5= new Dresses("CHANEL","Black Metall",48 ,typeOfClothes.CLASSIC, MaterialMain.FLAX,GederFor.FEMALE);
        Dresses dressT6= new Dresses("RALPH LAUREN","White-Grey",50 ,typeOfClothes.SPORT, MaterialMain.NYLON,GederFor.FEMALE);
        Dresses dressT7= new Dresses("BURBERRY","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC,GederFor.FEMALE);
        Dresses dressT8= new Dresses("HOUSE OF VERSACE","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC,GederFor.FEMALE);
        Dresses dressT9= new Dresses("FENDI","Black",55 ,typeOfClothes.CLASSIC, MaterialMain.ASBESTOS,GederFor.FEMALE);
        Dresses dressT10= new Dresses("ARMANI","MIXED",45 ,typeOfClothes.SPORT, MaterialMain.SILK, GederFor.FEMALE);

        Jeans jeansT1= new Jeans(" LOUIS VUITTON", " Pinky",45, typeOfClothes.CLASSIC, MaterialMain.SILK,GederFor.FEMALE);
        Jeans jeansT2= new Jeans(" GUCCI", " Black Metallic",43, typeOfClothes.CLASSIC, MaterialMain.WOOL,GederFor.MALE);
        Jeans jeansT3= new Jeans(" HERMES", " Mixed Colors",50, typeOfClothes.SPORT, MaterialMain.MIXED, GederFor.UNISEX);
        Jeans jeansT4= new Jeans("PRADA", "Pinky-red", 35, typeOfClothes.CLASSIC, MaterialMain.COTTON,GederFor.UNISEX);
        Jeans jeansT5= new Jeans("CHANEL","Black Metall",48 ,typeOfClothes.CLASSIC, MaterialMain.FLAX,GederFor.CHILDREN);
        Jeans jeansT6= new Jeans("RALPH LAUREN","White-Grey",50 ,typeOfClothes.SPORT, MaterialMain.NYLON,GederFor.CHILDREN);
        Jeans jeansT7= new Jeans("BURBERRY","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC,GederFor.FEMALE);
        Jeans jeansT8= new Jeans("HOUSE OF VERSACE","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC, GederFor.FEMALE);
        Jeans jeansT9= new Jeans("FENDI","Black",55 ,typeOfClothes.CLASSIC, MaterialMain.ASBESTOS,GederFor.CHILDREN);
        Jeans jeansT10= new Jeans("ARMANI","MIXED",45 ,typeOfClothes.SPORT, MaterialMain.SILK, GederFor.MALE);

        Shirt shirtT1= new Shirt(" LOUIS VUITTON", " Pinky",45, typeOfClothes.CLASSIC, MaterialMain.SILK,GederFor.CHILDREN);
        Shirt shirtT2= new Shirt(" GUCCI", " Black Metallic",43, typeOfClothes.CLASSIC, MaterialMain.WOOL,GederFor.MALE);
        Shirt shirtT3= new Shirt(" HERMES", " Mixed Colors",50, typeOfClothes.SPORT, MaterialMain.MIXED,GederFor.FEMALE);
        Shirt shirtT4= new Shirt("PRADA", "Pinky-red", 35, typeOfClothes.CLASSIC, MaterialMain.COTTON,GederFor.UNISEX);
        Shirt shirtT5= new Shirt("CHANEL","Black Metall",48 ,typeOfClothes.CLASSIC, MaterialMain.FLAX,GederFor.UNISEX);
        Shirt shirtT6= new Shirt("RALPH LAUREN","White-Grey",50 ,typeOfClothes.SPORT, MaterialMain.NYLON,GederFor.FEMALE);
        Shirt shirtT7= new Shirt("BURBERRY","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC,GederFor.FEMALE);
        Shirt shirtT8= new Shirt("HOUSE OF VERSACE","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC,GederFor.CHILDREN);
        Shirt shirtT9= new Shirt("FENDI","Black",55 ,typeOfClothes.CLASSIC, MaterialMain.ASBESTOS,GederFor.UNISEX);
        Shirt shirtT10= new Shirt("ARMANI","MIXED",45 ,typeOfClothes.SPORT, MaterialMain.SILK,GederFor.CHILDREN);

        Tshirt tShirtT1= new Tshirt(" LOUIS VUITTON", " Pinky",45, MaterialMain.SILK, typeOfClothes.CLASSIC,GederFor.UNISEX);
        Tshirt tShirtT2= new Tshirt(" GUCCI", " Black Metallic",43, MaterialMain.WOOL, typeOfClothes.CLASSIC,GederFor.UNISEX);
        Tshirt tShirtT3= new Tshirt(" HERMES", " Mixed Colors",50, MaterialMain.MIXED, typeOfClothes.SPORT,GederFor.CHILDREN);
        Tshirt tShirtT4= new Tshirt("PRADA", "Pinky-red", 35, MaterialMain.COTTON, typeOfClothes.CLASSIC,GederFor.UNISEX);
        Tshirt tShirtT5= new Tshirt("CHANEL","Black Metall",48 , MaterialMain.FLAX, typeOfClothes.CLASSIC,GederFor.CHILDREN);
        Tshirt tShirtT6= new Tshirt("RALPH LAUREN","White-Grey",50 , MaterialMain.NYLON, typeOfClothes.SPORT,GederFor.CHILDREN);
        Tshirt tShirtT7= new Tshirt("BURBERRY","Grey",45 , MaterialMain.ACRYLIC, typeOfClothes.SPORT,GederFor.MALE);
        Tshirt tShirtT8= new Tshirt("HOUSE OF VERSACE","Grey",45 , MaterialMain.ACRYLIC, typeOfClothes.SPORT,GederFor.FEMALE);
        Tshirt tShirtT9= new Tshirt("FENDI","Black",55 , MaterialMain.ASBESTOS, typeOfClothes.CLASSIC,GederFor.MALE);
        Tshirt tShirtT10= new Tshirt("ARMANI","MIXED",45 , MaterialMain.SILK, typeOfClothes.SPORT,GederFor.FEMALE);


        Shoes shoesT1= new Shoes(" LOUIS VUITTON", " Pinky",45, typeOfClothes.CLASSIC, MaterialMain.SILK,GederFor.MALE);
        Shoes shoesT2= new Shoes(" GUCCI", " Black Metallic",43, typeOfClothes.CLASSIC, MaterialMain.WOOL,GederFor.MALE);
        Shoes shoesT3= new Shoes(" HERMES", " Mixed Colors",50, typeOfClothes.SPORT, MaterialMain.MIXED,GederFor.MALE);
        Shoes shoesT4= new Shoes("PRADA", "Pinky-red", 35, typeOfClothes.CLASSIC, MaterialMain.COTTON,GederFor.FEMALE);
        Shoes shoesT5= new Shoes("CHANEL","Black Metall",48 ,typeOfClothes.CLASSIC, MaterialMain.FLAX,GederFor.FEMALE);
        Shoes shoesT6= new Shoes("RALPH LAUREN","White-Grey",50 ,typeOfClothes.SPORT, MaterialMain.NYLON,GederFor.CHILDREN);
        Shoes shoesT7= new Shoes("BURBERRY","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC,GederFor.CHILDREN);
        Shoes shoesT8= new Shoes("HOUSE OF VERSACE","Grey",45 ,typeOfClothes.SPORT, MaterialMain.ACRYLIC,GederFor.CHILDREN);
        Shoes shoesT9= new Shoes("FENDI","Black",55 ,typeOfClothes.CLASSIC, MaterialMain.ASBESTOS,GederFor.UNISEX);
        Shoes shoesT10= new Shoes("ARMANI","MIXED",45 ,typeOfClothes.SPORT, MaterialMain.JUTE,GederFor.UNISEX);

        Jackets jacketT1= new Jackets(" LOUIS VUITTON", " Pinky",45, MaterialMain.SILK, typeOfClothes.CLASSIC,GederFor.UNISEX);
        Jackets jacketT2= new Jackets(" GUCCI", " Black Metallic",43, MaterialMain.WOOL, typeOfClothes.CLASSIC,GederFor.UNISEX);
        Jackets jacketT3= new Jackets(" HERMES", " Mixed Colors",50, MaterialMain.MIXED, typeOfClothes.SPORT,GederFor.CHILDREN);
        Jackets jacketT4= new Jackets("PRADA", "Pinky-red", 35, MaterialMain.COTTON, typeOfClothes.CLASSIC,GederFor.CHILDREN);
        Jackets jacketT5= new Jackets("CHANEL","Black Metall",48 , MaterialMain.FLAX, typeOfClothes.CLASSIC,GederFor.FEMALE);
        Jackets jacketT6= new Jackets("RALPH LAUREN","White-Grey",50 , MaterialMain.NYLON, typeOfClothes.SPORT,GederFor.FEMALE);
        Jackets jacketT7= new Jackets("BURBERRY","Grey",45 , MaterialMain.ACRYLIC, typeOfClothes.SPORT,GederFor.FEMALE);
        Jackets jacketT8= new Jackets("HOUSE OF VERSACE","Grey",45 , MaterialMain.ACRYLIC, typeOfClothes.SPORT,GederFor.MALE);
        Jackets jacketT9= new Jackets("FENDI","Black",55 , MaterialMain.ASBESTOS, typeOfClothes.CLASSIC,GederFor.MALE);
        Jackets jacketT10= new Jackets("ARMANI","MIXED",45 , MaterialMain.JUTE, typeOfClothes.SPORT,GederFor.MALE);

dressT1.wearingClothes();
        dressT2.wearingClothes();
        jacketT3.wearingClothes();
    jacketT4.wearingClothes();
        jeansT5.wearingClothes();
        jeansT6.wearingClothes();
        shirtT7.wearingClothes();
        dressT8.wearingClothes();
        shoesT1.wearingClothes();
        tShirtT3.wearingClothes();

        Clothes[] clothess= new Clothes[20];

                clothess[0]= dressT1;
        clothess[1]=dressT2;
                clothess[2]= dressT3;
        clothess[3]= dressT4;
                clothess[4]=dressT5;
        clothess[5]=dressT6;
                clothess[6]=jeansT1;
        clothess[7]=jeansT2;
                clothess[8]=jeansT5;
        clothess[9]=shirtT1;
                clothess[10]=shirtT5;
        clothess[11]=shirtT9;
                clothess[12]=shirtT3;
        clothess[13]=tShirtT1;
                clothess[14]=tShirtT8;
        clothess[15]=tShirtT10;
                clothess[16]=tShirtT4;
        clothess[17]=shoesT1;
                clothess[18]=shoesT2;
        clothess[19]=shoesT4;
                for (Clothes e:clothess){
                    e.likeMyBrandS();
                    System.out.println();
                }

                switch (shoesT2.getMaterialMainSH()){

                    case FLAX: shoesT2.printMat();

                      break;
                    case JUTE: shoesT2.printMat();

                        break;
                    case SILK:shoesT2.printMat();
                        break;
                    case WOOL:shoesT2.printMat();

                        break;
                    case MIXED:shoesT2.printMat();

                        break;
                    case NYLON:shoesT2.printMat();

                        break;
                    case COTTON:shoesT2.printMat();

                        break;
                    case ACRYLIC:shoesT2.printMat();

                        break;
                    case ASBESTOS:shoesT2.printMat();

                        break;
                }
for(fashionTypes fashionTypes: fashionTypes.values()){
    System.out.println(fashionTypes + " ");
    fashionTypes.printFashion();
    System.out.println();
}


    }

}
