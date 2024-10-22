package com.example.entity;

public class ElectronicProduct extends Product{
    private String baoHanh; // Warranty period
    private String congSuat; // Power rating


    public ElectronicProduct(int maMh, String name, int price, String category, int quantity,String dvt, String baoHanh, String congSuat) {
        super(maMh, name, price, category, quantity,dvt);
        this.baoHanh = baoHanh;
        this.congSuat = congSuat;
    }

    // Getters
    public String getBaoHanh() { return baoHanh; }
    public String getCongSuat() { return congSuat; }
}