package test;

import app.gaz.hr.Employee;
import app.gaz.hr.Job;

public class HrTest {

    public static void main(String[] args) {

        // Creacion de Objetos, a partir de los campos de la clase Employee.java:

        Employee e1 = new Employee();
        Employee e2 = new Employee();

           e1.id = 1;
           e1.firstName = "Pablo";
           e1.lastName = " Guzman";
           e1.age = 41;
           e1.email = "guz@hotmail.com";
           e1.phoneNumber = "444-555-777";
           e1.salary = 2333.67;
           e1.hireDate = "03-02-2000";

           e2.id = 2;
           e2.firstName = "Isa";
           e2.lastName = " Gaz";
           e2.age = 24;
           e2.email = "isa@hotmail.com";
           e2.phoneNumber = "555-666-888";
           e2.salary = 33383.67;
           e2.hireDate = "03-02-2020";

        // Creacion de 2 Objetos tipo empelado, a partir de los campos de la clase Employee.java:
           e1.getDetails();
        System.out.println("--------------------------");
        e2.getDetails();




    }


}
