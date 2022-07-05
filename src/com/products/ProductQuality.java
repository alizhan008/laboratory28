package com.products;

public enum ProductQuality {
    NORMAL(1.2),
    SLIGHTLY_FLAWED(0.95),
    HALF_OF_IS_SPOILED(0.55),
    ALMOST_ALL_GONE(0.25),
    RUINED_IN_THE_TRASH(0.1);

    private double num;

    ProductQuality(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }
}
