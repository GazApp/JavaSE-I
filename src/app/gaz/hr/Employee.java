package app.gaz.hr;

public class Employee {

    public int id;
    public String firstName;
    public String lastName;
    public int age;
    public String email;
    public String phoneNumber;
    public double salary;
    public String hireDate;


    public void getDetails() {

        System.out.println("Id: " + id);
        System.out.println("FirstName: " + firstName);
        System.out.println("LastName: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("HireDate: " + hireDate);
    }
}
