package com.app.com.FirstApp;

public class Main {
    public static void main(String[] args) {

        Student omr = new Student();
        omr.setName("عمر");
        omr.setDegree1(5);
        omr.setDegree2(20);
        System.out.println("اسم الطالب/" + omr.getName());
        System.out.println("مجموع العلامات/" + omr.getsum());
        System.out.println("نسبة الاختبار العملي/" + omr.getnesbah());
        System.out.println("الدرجة النهائية/" + omr.getnehaai());
        System.out.println("//////////////////////////////");


        Student ali = new Student();
        ali.setName("علي");
        ali.setDegree1(20);
        ali.setDegree2(20);
        System.out.println("اسم الطالب/" + ali.getName());
        System.out.println("مجموع العلامات/" + ali.getsum());
        System.out.println("نسبة الاختبار العملي/" + ali.getnesbah());
        System.out.println("الدرجة النهائية/" + ali.getnehaai());
        System.out.println("//////////////////////////////");


        Student otman = new Student();
        otman.setName("عثمان");
        otman.setDegree1(5);
        otman.setDegree2(20);
        System.out.println("اسم الطالب/" + otman.getName());
        System.out.println("مجموع العلامات/" + otman.getsum());
        System.out.println("نسبة الاختبار العملي/" + otman.getnesbah());
        System.out.println("الدرجة النهائية/" + otman.getnehaai());
        System.out.println("//////////////////////////////");


    }
}
