package mx.com.hittechs.model;

public class Job {
    public int id;
    public String title;
    public double minSalary;
    public double maxSalary;

    public void getDetails() {

        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("MinSalary: " + minSalary);
        System.out.println("MaxSalary: " + maxSalary);

    } 
}
