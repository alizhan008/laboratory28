package com.products;

public enum Products {

    EAT("мясо",400,1),
    DRIED_FRUITS("сухофрукты",200,1),
    GRAIN("зерно",300,1),
    FLOUR("мука",100,1),
    FABRICS("ткани",350,1),
    PAINT("краска",700,5);

    private String name;
    private int price;
    private int weight;

    Products(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


}
