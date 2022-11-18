/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class employeeData {
    private ArrayList<Employee>  empdata;
    
   public employeeData() {
       this.empdata=new ArrayList<Employee>();
}

    public ArrayList<Employee> getEmpdata() {
        return empdata;
    }

    public void setEmpdata(ArrayList<Employee> empdata) {
        this.empdata = empdata;
    }
    
    public Employee addDetails(){
    
    Employee emp = new Employee();
    empdata.add(emp);
    return emp;
    
    }
    public void deleteDetails(Employee em)
    {
    
    empdata.remove(em);
    
    
    }
    
    
    }
    
    
    
    

