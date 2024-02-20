/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Worker;
import Model.WorkerHistory;
import java.util.ArrayList;

/**
 *
 * @author thaip
 */
public class Execute {
    private ArrayList<Worker> listWork = new ArrayList<>();
    private ArrayList<WorkerHistory> listHis = new ArrayList<>();

    public Execute() {
    }

    
    public void checkId(String id) throws Exception{
        for (Worker worker : listWork) {
            if(worker.getId().equals(id)){
                throw new Exception("ID is exist!");
            }
        }
        
    }
    public void checkAge(int age) throws Exception{
        if(age < 18 || age > 50){
            throw new Exception("Invalid age !");
        }
    }
    public void checkSalary(double salary) throws Exception{
        if(salary <= 0){
            throw new Exception("Invalid salary !");
        }
    }
    
    public boolean addWorker(Worker a)throws Exception{
            checkAge(a.getAge());
            checkId(a.getId());
            checkSalary(a.getSalary());
            if(a == null){
                throw new Exception("Worker null");
            }
            listWork.add(a);
            System.out.println("Add worker successful!");
            return true;
        
    }
    
    public boolean changeSalary(String code, double amount){
        if(listWork.isEmpty()){
            System.out.println("List is Empty!");
        }
        for (Worker worker : listWork) {
            if(worker.getId().equals(code)){
                double current = worker.getSalary();
                worker.setSalary(amount);
                if(amount > current){
                    listHis.add(new WorkerHistory(worker.getId(), worker.getName(), "UP",worker.getAge(),worker.getSalary(), worker.getDateWork()));
                }else{
                    listHis.add(new WorkerHistory(worker.getId(),worker.getName() , "DOWN", worker.getAge(), worker.getSalary(), worker.getDateWork()));

                }
            }
            else{
                System.out.println("Code is not exist!");
            }
        }
 
        
        return false;
    }
    
    
    
    public void displayHis(){
        if(listHis.isEmpty()){
            System.out.println("List is empty!");
        }
        String form = String.format("%-5s %-15s %-10s %-10s %-10s %-15s", "Code","Name", "Age","Salary","Status","Date");
        System.out.println(form);
        for (WorkerHistory w : listHis) {
            System.out.println(w.toString());
        }
    }
    
    public void display(){
        for (Worker worker : listWork) {
            System.out.println(worker.toString());
        }
    }
    
}
