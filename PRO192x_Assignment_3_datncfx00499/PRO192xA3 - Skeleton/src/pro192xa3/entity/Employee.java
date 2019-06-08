/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192xa3.entity;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public abstract class Employee implements Comparable<Employee>, Serializable {
    private String fullName;
    private float salaryRatio;//hệ số lương    
    private float allowance;//phụ cấp  

	public Employee() {
    	
    }
    
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalaryRatio() {
        return salaryRatio;
    }

    public void setSalaryRatio(float salaryRatio) {
        this.salaryRatio = salaryRatio;
    }

    public float getAllowance() {        
        return allowance;
    }

    public void setAllowance(float allowance) {
        this.allowance = allowance;
    } 
    
    public abstract float getSalary();
    @Override
    public int compareTo(Employee emp){
        return this.fullName.compareTo(emp.fullName);
    }
    
}
