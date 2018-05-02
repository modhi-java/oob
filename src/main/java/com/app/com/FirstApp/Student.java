package com.app.com.FirstApp;

public class Student {
    private int id;
    private String name;
    private int degree1;
    private int degree2;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegree1() {
        return degree1;
    }

    public void setDegree1(int degree1) {
        this.degree1 = degree1;
    }

    public int getDegree2() {
        return degree2;
    }

    public void setDegree2(int degree2) {
        this.degree2 = degree2;
    }

    public int getsum() {
        int getsum = this.degree1 + this.degree2;
        return getsum;
    }

    public double getnesbah() {
        double getnesbah = (10 * this.getsum()) / 100;
        return getnesbah;
    }

    public double getnehaai() {
        double getnehaai = this.getsum() + this.getnesbah();
        return getnehaai;
    }
}
