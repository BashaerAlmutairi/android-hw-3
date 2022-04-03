package com.example.humanbody;

import java.io.Serializable;

public class humanbody implements Serializable {
    private String itemName;
    private int itemImage;
    private int itemPrice;

    public String getItemName () {
        return itemName;
    }

    public void setItemName ( String itemName ) {
        this.itemName = itemName;
    }

    public int getItemImage () {
        return itemImage;
    }

    public void setItemImage ( int itemImage ) {
        this.itemImage = itemImage;
    }

    public int getItemPrice () {
        return itemPrice;
    }

    public void setItemPrice ( int itemPrice ) {
        this.itemPrice = itemPrice;
    }

    public humanbody ( String itemName, int itemImage, int itemPrice ) {
        this.itemName = itemName;
        this.itemImage = itemImage;
        this.itemPrice = itemPrice;

    }
}

