package com.example.sandeeprecycler;

public class ModelClass {
    private int imageview1;
    private String tex;
    private String textview1;
    private String textview2;
    private String divider;

    ModelClass(int imageview1,String tex,String textview1,String textview2,String divider)
    {
        this.imageview1=imageview1;
        this.tex=tex;
        this.textview1=textview1;
        this.textview2=textview2;
        this.divider=divider;
    }


    public int getImageview1() {
        return imageview1;
    }

    public String getTex() {
        return tex;
    }

    public String getTextview1() {
        return textview1;
    }

    public String getTextview2() {
        return textview2;
    }

    public String getDivider() {
        return divider;
    }
}
