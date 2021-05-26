package com.example.ghimheesphoneappproject;

public class OptionsModel {
    private String item_name,item_cost;
    private int imgid;

    public OptionsModel(String item_name, String item_cost, int imgid) {
        this.item_name = item_name;
        this.item_cost = item_cost;
        this.imgid = imgid;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_cost() {
        return item_cost;
    }

    public void setItem_cost(String item_cost) {
        this.item_cost = item_cost;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}
