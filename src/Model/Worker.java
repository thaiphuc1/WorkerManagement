/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thaip
 */
public class Worker {
    private String id, name;
    private int age;
    private Date dateWork;
    private double salary;
    private String workLocation;
    
    public Worker() {
    }

    public Worker(String id, String name, int age, double salary, String workLocation, Date dateWork) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.dateWork = dateWork;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDateWork() {
        return dateWork;
    }

    public void setDateWork(Date dateWork) {
        this.dateWork = dateWork;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public String displayDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(date);
    }

    @Override
    public String toString() {
        return String.format("%-5s %-15s %-10s %-10s %-10s %-15s", id, name,age,salary, workLocation, displayDate(dateWork));
    }

    

   
    
    
    
}
