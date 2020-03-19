package com.example.a20200319_02_fragment02.datas;

import java.io.Serializable;

public class Room implements Serializable {

//    가격, 주소만 표현
    private int price;
    private String address;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Room(int price, String address) {
        this.price = price;
    }
}
