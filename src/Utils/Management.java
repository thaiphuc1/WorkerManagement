/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import Controller.Execute;
import Model.Worker;
import View.Menu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thaip
 */
public class Management extends Menu<String>{
    private static String[] mc={"Add Worker","Up Salary","Down Salary","Display Information salary","Exit"};
    private Execute wList = new Execute();
    public Management() {
        super("========= Worker Management ==========",mc);
     }
    @Override
    public void execute(int n) {
        switch(n){
            case 1: {
               try{
                    addWoker();}
                catch (Exception ex) {
                    
                }
            }break;
            case 2: changeSalary();break;
            case 3: changeSalary();break;
            case 4: {
                try {
                    displayHistory();
                } catch (Exception ex) {
                    
                }
            }break;
            case 5: System.exit(0);
        }
    }
    public void addWoker() {
        try{
            System.out.println("---------- Add Worker ----------");
            String code = Menu.getString("Enter Code : ");
            String name = Menu.getString("Enter Name : ");
            int age = Integer.parseInt(Menu.getString("Enter Age : "));
            double salary = Double.parseDouble(Menu.getString("Enter Salary : "));
            String location = Menu.getString("Enter Location Work : ");
            Date date = inputDate();
            wList.addWorker(new Worker(code, name, age, salary, location, date));
            
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
    }
    private Date inputDate() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = Menu.getString("Enter Date (dd/MM/yyyy): ");
        return dateFormat.parse(dateString);
    }
    public void changeSalary(){
        try{
            displayWorker();
            System.out.println("---------- UP/DOWN Worker ----------");
            String code = Menu.getString("Enter Code : ");
            double salary = Double.parseDouble(Menu.getString("Enter Salary : "));
            wList.changeSalary(code, salary);
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
    }
    public void displayWorker(){
        wList.display();
    }
    public void displayHistory(){
        wList.displayHis();
    }
}
