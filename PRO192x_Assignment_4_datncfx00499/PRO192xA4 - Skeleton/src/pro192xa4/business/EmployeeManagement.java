/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192xa4.business;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import pro192xa4.entity.EDegree;
import pro192xa4.entity.EPosition;
import pro192xa4.entity.Employee;
import pro192xa4.entity.Staff;
import pro192xa4.entity.Teacher;

/**
 * @author hp
 */
public class EmployeeManagement {

    //store all staff/teacher
    static ArrayList<Employee> listE;

    public EmployeeManagement() {
        listE = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        //add emp to listE
        listE.add(emp);
    }

    //search by staff/teacher's name
    public ArrayList<Employee> searchByName(String name) {
        //store all matching staff or teacher
        ArrayList<Employee> empFound = new ArrayList<>();
        for (int i = 0; i < listE.size(); i++) {
            if (listE.get(i).getFullName().contains(name) == true) { // Check FullName in listE at i with name
                empFound.add(listE.get(i)); // If true, add listE at k to empFound
            }
        }
        return empFound;
    }

    //search by staff/teacher's department/faculty
    public ArrayList<Employee> searchByDept(String dept) {
        ArrayList<Employee> empFound = new ArrayList<>();
        for (int i = 0; i < listE.size(); i++) {
            if (listE.get(i) instanceof Staff) { // Check listE.get(i) instance of Staff or Teacher
                ArrayList<Staff> deptStaff = new ArrayList<>(); // Creat list Staff
                deptStaff.add((Staff) listE.get(i)); // If instance of Staff, add listE.get(i) to list deptStaff
                for (int k = 0; k < deptStaff.size(); k++) {
                    if (deptStaff.get(k).getDepartment().contains(dept) == true) { // Check Department in deptStaff at k with dept
                        empFound.add(deptStaff.get(k)); // If true, add deptStaff at k to empFound
                    }
                }
            }
            if (listE.get(i) instanceof Teacher) { // Check listE.get(i) instance of Staff or Teacher
                ArrayList<Teacher> facTeacher = new ArrayList<>(); // Creat list Teacher
                facTeacher.add((Teacher) listE.get(i)); // If instance of Teacher, add listE.get(i) to list facTeacher
                for (int k = 0; k < facTeacher.size(); k++) {
                    if (facTeacher.get(k).getFaculty().contains(dept) == true) { // Check Faculty in facTeacher at k with dept
                        empFound.add(facTeacher.get(k)); // If true, add facTeacher at k to empFound
                    }
                }
            }
        }
        return empFound;
    }

    // Read data file
    public static void readFile() {
            listE = SerializeFile.readFile();
    }

    // Save data file
    public static void saveFile() {
        boolean result = SerializeFile.saveFile(listE);
    }

    //public ArrayList<Employee> editEmployee
    public ArrayList<Employee> listAll() {
        //sort the list of staff/teacher before return
        Collections.sort(listE);
        return listE;
    }

}
