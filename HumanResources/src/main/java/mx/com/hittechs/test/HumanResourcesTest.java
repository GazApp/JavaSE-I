package mx.com.hittechs.test;

import mx.com.hittechs.model.Employee;


public class HumanResourcesTest {

    public static void main(String[] args) {
        
        // Creacion de Objetos, a partir de los campos de la clase Employee.java:
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.id = 1;
        e1.firstName = "Edgar";
        e1.lastName="Gomez";
        e1.age = 27;
        e1.email = "e.gomez@hittechs.com.mx";
        e1.phoneNumber = "123.456.7890";
        e1.salary = 4500.25;
        e1.hireDate = "11-02-2017";

        e2.id = 2;
        e2.firstName = "Marya";
        e2.lastName ="Estrada";
        e2.age = 19;
        e2.email = "m.estrada@hittechs.com.mx";
        e2.phoneNumber = "987.456.1230";
        e2.salary = 2800.33;
        e2.hireDate = "13-04-2017";
        
        e1.getDetails();
        System.out.println("------------------------------");
        e2.getDetails();
    }

}
