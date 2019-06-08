/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192xa4.ui;

import java.util.ArrayList;
import java.util.Scanner;
import pro192xa4.business.AllowanceCalulator;
import pro192xa4.business.ControlEmployee;
import pro192xa4.business.EmployeeManagement;
import pro192xa4.entity.Employee;
import pro192xa4.entity.Staff;
import pro192xa4.entity.Teacher;

/**
 *
 * @author hp
 */
public class PRO192xA4 {

    //create an employee by inputing it's attribute values from keyboard
    static Employee createNewImployee() {
        System.out.print("Do you want to create a Staff or a Teacher (enter S for Staff, otherwise for Teacher)?");
        //accept Staff or Teacher details from keyboard        
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
        if (choice.equalsIgnoreCase("s")) {
            Staff s = new Staff();
            //input staff details
            s = ControlEmployee.createNewEmployee(s);
            return s;

        } else {
            Teacher t = new Teacher();
            //inputs Teacher details
            t = ControlEmployee.createNewEmployee(t);
            return t;
        }
    }

    //display a list of employee
    static void display(ArrayList<Employee> listE) {
        System.out.println("Results:");
        System.out.println("Name, Fac/Dept, Deg/Pos, Sal Ratio, Allowance, T.Hours/W.Days, Salary");
        for (Employee e : listE) {
        	System.out.println(e);
        }
    }
    
    public static void main(String[] args) {
    	// create employee management object
        EmployeeManagement empMan = new EmployeeManagement();
        // read data employee
        EmployeeManagement.readFile();
        //menu
        Scanner scan = new Scanner(System.in);
        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("University Staff Management 1.0");
            System.out.println("\t1.Add staff");
            System.out.println("\t2.Search staff by name");
            System.out.println("\t3.Search staff by department/faculty");
            System.out.println("\t4.Display all staff");
            System.out.println("\t5.Exit");
            System.out.print("Select function (1,2,3,4 or 5): ");
            int choice = scan.nextInt();
            
            switch (choice) {
                case 1://add staff/teacher   
                    Employee emp = createNewImployee();
                    float allowance = AllowanceCalulator.calculateAllowance(emp);
                    emp.setAllowance(allowance);
                    empMan.addEmployee(emp);
                    EmployeeManagement.saveFile();
                    break;
                case 2://search by name                    
                    System.out.print("\tEnter name to search: ");
                    scan = new Scanner(System.in);
                    String name = scan.nextLine();
                    ArrayList<Employee> foundByName = empMan.searchByName(name);
                    display(foundByName);
                    break;
                case 3://search by dept/fac
                    System.out.print("\tEnter dept/fac to search: ");
                    scan = new Scanner(System.in);
                    String dept = scan.nextLine();
                    ArrayList<Employee> foundByDept = empMan.searchByDept(dept);
                    display(foundByDept);
                    break;
                case 4://display all
					ArrayList<Employee> listE = empMan.listAll();
                    display(listE);
                    break;
                case 5://exit
                    keepRunning = false;
            }
        }
    }
}
