package com.example.amrizalns.backind;

/**
 * Created by amrizalns on 4/21/17.
 */

public class ItemObject {

    private String location;
    private String name;
    private int img;
    private String desc;

    public ItemObject(String Location, String name, String desc, int img) {
        this.location = Location;
        this.name = name;
        this.desc = desc;
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
