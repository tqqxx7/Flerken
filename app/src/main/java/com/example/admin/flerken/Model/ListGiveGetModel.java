package com.example.admin.flerken.Model;

/**
 * Created by wolfsoft3 on 17/7/18.
 */

public class ListGiveGetModel {
    private int image;
    private String txt1,txt2,txt3;
    public ListGiveGetModel(int img, String tt1, String tt2, String txt3){
        image = img;
        txt1=tt1;
        txt2=tt2;
        this.txt3 = txt3;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }
}
