package enums;

public enum fashionTypes {
    VINTAGE{
        @Override
        public void printFashion(){
            System.out.println("Coming  from eighties  ");
        }
    },
    BOHEMIAN{
        @Override
        public void printFashion(){
            System.out.println("No War, Do love");
        }
    },
    CHIC{
        @Override
        public  void printFashion(){
            System.out.println("Element and Modern");
        }

    },
    ARTSY(){
        @Override
        public void printFashion(){
            System.out.println("Look Stylish and bright as  a Domini art  ");
        }
    },
    SEXY(){
        @Override
        public void printFashion(){
            System.out.println("Dress To KILL");
        }
    },
    CASUAL(){
        @Override
        public void printFashion(){
            System.out.println("Casual clothes for daily routine");
        }
    },
    ROCKER(){
        @Override
        public void printFashion(){
            System.out.println("Hot, sexy and  look like  the RockStar" );
        }
    },
    PREPPY(){
        @Override
        public void printFashion()
        {
            System.out.println("Look as a geeky and stylish  at the same time " );
        }
    };

    String phrase;

    fashionTypes(String phrase) {
        this.phrase = phrase;
    }
    public void printFashion(){

    }
    fashionTypes(){

    }
}
