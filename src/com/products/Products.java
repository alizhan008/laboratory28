package com.products;

public enum Products {

    EAT("����",400,1),
    DRIED_FRUITS("����������",200,1),
    GRAIN("�����",300,1),
    FLOUR("����",100,1),
    FABRICS("�����",350,1),
    PAINT("������",700,5);

    private String name;
    private int price;
    private int weight;

    Products(String name, int price, int weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }


}
