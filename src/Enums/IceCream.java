package Enums;

enum IceCream {
    Vanilla(8, "Creamy white"),
    Chocolate(10, "Brown"),
    Strawberry(7, "Pink"),
    Mint(6, "Green"),
    Citrus(8, "Yellow" ),
    Cookies_and_Cream(10, "White and black"),
    Pistachio(9, "Greeen");

    private int deliciousnessLevel;
    private String colour;

    IceCream(int deliciousnessLevel, String colour){
        this.deliciousnessLevel = deliciousnessLevel;
        this.colour = colour;
    }

    public int getDeliciousnessLevel(){
        return deliciousnessLevel;
    }
    public String getColour(){
        return colour;
    }
}
