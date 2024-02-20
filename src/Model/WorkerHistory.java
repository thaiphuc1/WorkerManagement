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
public class WorkerHistory {
    private String id, name, status;
    private int age;
    private double salary;
    private Date dateWorker;

    public WorkerHistory() {
    }

    public WorkerHistory(String id, String name, String status, int age, double salary, Date dateWorker) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.age = age;
        this.salary = salary;
        this.dateWorker = dateWorker;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateWorker() {
        return dateWorker;
    }

    public void setDateWorker(Date dateWorker) {
        this.dateWorker = dateWorker;
    }

    public String displayDate(Date date){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(date);
    }
    @Override
    public String toString() {
        return String.format("%-5s %-15s %-10s %-10s %-10s %-15s", id, name,age,salary, status, displayDate(dateWorker));
    }
    
}
