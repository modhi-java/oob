package com.app;

public class Start {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.code = 4587;
        emp1.name = "أحمد";
        emp1.salary = 4300;
        emp1.master = "بكالورويس";


        Employee emp2 = new Employee();
        emp2.id = 2;
        emp2.code = 4487;
        emp2.name = "خالد";
        emp2.salary = 4200;
        emp2.master = "بكالورويس";


        Employee emp3 = new Employee();
        emp3.id = 3;
        emp3.code = 1187;
        emp3.name = "محمد";
        emp3.salary = 2300;
        emp3.master = "دبلوم";

        Employee emp4 = new Employee();
        emp4.id = 4;
        emp4.code = 8887;
        emp4.name = "فارس";
        emp4.salary = 7500;
        emp4.master = "ماجستير";

        Employee emp5 = new Employee();
        emp5.id = 5;
        emp5.code = 4107;
        emp5.name = "علي";
        emp5.salary = 3100;
        emp5.master = "بكالورويس";

        Employee emp6 = new Employee();
        emp6.id = 6;
        emp6.code = 7087;
        emp6.name = "حسن";
        emp6.salary = 3330;
        emp6.master = "بكالورويس";


        Employee emp7 = new Employee();
        emp7.id = 7;
        emp7.code = 9997;
        emp7.name = "فهد";
        emp7.salary = 9200;
        emp7.master = "دكتوراة";


        Employee emp8 = new Employee();
        emp8.id = 8;
        emp8.code = 2224;
        emp8.name = "إبراهيم";
        emp8.salary = 8500;
        emp8.master = "بكالورويس";

        Employee emp9 = new Employee();
        emp9.id = 9;
        emp9.code = 0127;
        emp9.name = "سالم";
        emp9.salary = 5500;
        emp9.master = "بكالورويس";

        Employee emp10 = new Employee();
        emp10.id = 10;
        emp10.code = 4587;
        emp10.name = "أحمد";
        emp10.salary = 4300;
        emp10.master = "بكالورويس";

        Employee[] arar = new Employee[10];
        arar[0] = emp1;
        arar[1] = emp2;
        arar[2] = emp3;
        arar[3] = emp4;
        arar[4] = emp5;
        arar[5] = emp6;
        arar[6] = emp7;
        arar[7] = emp8;
        arar[8] = emp9;
        arar[9] = emp10;

        for (int i = 0; i < 10; i++) {
            System.out.println();
            System.out.println(arar[i].name);
            System.out.println(arar[i].code);
            System.out.println(arar[i].id);
            System.out.println(arar[i].salary);
            System.out.println(arar[i].master);
        }


    }
}
