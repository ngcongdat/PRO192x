package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pro192xa4.business.AllowanceCalulator;
import pro192xa4.business.EmployeeManagement;
import pro192xa4.entity.EDegree;
import pro192xa4.entity.EPosition;
import pro192xa4.entity.Employee;
import pro192xa4.entity.Staff;
import pro192xa4.entity.Teacher;

public class TestJUnit {
	Staff s = new Staff();
	Staff s1 = new Staff();
	Staff s2 = new Staff();
	Teacher t = new Teacher();
	Teacher t1 = new Teacher();
	Teacher t2 = new Teacher();
	
	// Contructor
	public TestJUnit() {
		s1.setFullName("Senda");
		s1.setDepartment("Developer");
		s2.setFullName("Susan");
		s2.setDepartment("Marketing");
		t1.setFullName("Tiny");
		t1.setFaculty("Java");
		t2.setFullName("Akichan");
		t2.setFaculty("Japan");
	}
	
	@Test
	public void testStaffSalary() {
		s.setSalaryRatio(2.0f);
		s.setNoOfWorkingDay(10.0f);
		s.setPosition(EPosition.HEAD);
		s.setAllowance(AllowanceCalulator.calculateAllowance(s));
		float result = s.getSalary();
		assertEquals(3760, result, 0);
	}
	
	@Test
	public void testTeacherSalary() {
		t.setSalaryRatio(2.0f);
		t.setTeachingHours(10);
		t.setDegree(EDegree.BACHELOR);
		t.setAllowance(AllowanceCalulator.calculateAllowance(t));
		float result = t.getSalary();
		assertEquals(2210, result, 0);
	} 

	@Test
	public void testSeachByName() {
		EmployeeManagement e = new EmployeeManagement();
		ArrayList<Employee> listE = new ArrayList<>();
		e.addEmployee(s1);
		e.addEmployee(s2);
		e.addEmployee(t1);
		e.addEmployee(t2);
		// Test Case
		listE.add(s1);
		listE.add(s2);
		listE.add(t1);
		listE.add(t2);
		assertEquals(listE, e.searchByName("n"));
	}
	
	@Test
	public void testSearchByDept() {
		EmployeeManagement e = new EmployeeManagement();
		ArrayList<Employee> listE = new ArrayList<>();
		e.addEmployee(s1);
		e.addEmployee(s2);
		e.addEmployee(t1);
		e.addEmployee(t2);
		// Test Case 1
		listE.add(s1);
		listE.add(s2);
		assertEquals(listE, e.searchByDept("e"));
		// Test Case 2
		listE.clear();
		listE.add(s2);
		listE.add(t1);
		listE.add(t2);
		assertEquals(listE, e.searchByDept("a"));
	}
}
