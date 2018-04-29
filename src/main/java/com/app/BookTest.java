package com.app;

public class BookTest {


    public static void main(String[] args) {

        Book b1 = new Book();
        b1.id = 1;
        b1.code = 3231;
        b1.name = "الجافا";
        b1.writer = "فهد";
        b1.price = 28;


        Book b2 = new Book();
        b2.id = 2;
        b2.code = 3221;
        b2.name = "التدريب";
        b2.writer = "علي";
        b2.price = 22;


        Book b3 = new Book();
        b3.id = 3;
        b3.code = 3331;
        b3.name = "الاستثناءات";
        b3.writer = "خالد";
        b3.price = 58;


        Book b4 = new Book();
        b4.id = 4;
        b4.code = 4431;
        b4.name = "الحياة";
        b4.writer = "أحمد";
        b4.price = 33;


        Book b5 = new Book();
        b5.id = 5;
        b5.code = 5231;
        b5.name = "اللغة العربية";
        b5.writer = "ناصر";
        b5.price = 42;

        Book[] mktbh = new Book[5];
        mktbh[0] = b1;
        mktbh[1] = b2;
        mktbh[2] = b3;
        mktbh[3] = b4;
        mktbh[4] = b5;

        for (int i = 0; i < 5; i++) {
            System.out.println();
            System.out.println(mktbh[i].name);
            System.out.println(mktbh[i].code);
            System.out.println(mktbh[i].id);
            System.out.println(mktbh[i].writer);
            System.out.println(mktbh[i].price);
        }
    }

}
