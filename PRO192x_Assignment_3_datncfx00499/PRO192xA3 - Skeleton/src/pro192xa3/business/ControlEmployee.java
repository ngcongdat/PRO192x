package pro192xa3.business;

import java.util.Scanner;

import pro192xa3.entity.EDegree;
import pro192xa3.entity.EPosition;
import pro192xa3.entity.Staff;
import pro192xa3.entity.Teacher;

public class ControlEmployee {
	
	public static Staff createNewEmployee(Staff s) {
		Scanner scan = new Scanner(System.in);
		boolean validate;
		// Set name
		validate = true;
		System.out.print("Name: ");
		while (validate) {
			String name = scan.nextLine();
			if (name.trim().isEmpty()) {
				System.err.print("NAME - Please input staff name: ");
			}
			else {
				s.setFullName(name);
				validate = false;
			}
		}
        // Set salary ratio
		validate = true;
        System.out.print("Salary ratio: ");
        while (validate) {
        	
        	if (scan.hasNextFloat()) {
        		s.setSalaryRatio(scan.nextFloat());
        		validate = false;
        	}
        	else {
        		System.err.print("SALARY RATIO - Please input number: ");
        	}
        	scan.nextLine();
		}
        // Set department
        validate = true;
        System.out.print("Department: ");
        while (validate) {
        	String department = scan.nextLine();
        	if (department.trim().isEmpty()) {
        		System.err.print("DEPARTMENT - Please input staff department: ");
        	}
        	else {
        		s.setDepartment(department);
        		validate = false;
        	}
        }
        // Set position
        validate = true;
        System.out.print("Position (1=HEAD; 2=VICE HEAD; 3=STAFF): "); 
        while (validate) {
        	if (scan.hasNextByte()) {
        		byte staffPosition	= scan.nextByte();
                switch(staffPosition) {
                case 1:
                	s.setPosition(EPosition.HEAD);
                	validate = false;
                	break;
                case 2:
                	s.setPosition(EPosition.VICE_HEAD);
                	validate = false;
                	break;
                case 3:
                	s.setPosition(EPosition.STAFF);
                	validate = false;
                	break;
                }
        	}
        	else {
        		System.err.print("POSITION - Please input from 1,2 or 3: ");
        	}
        	scan.nextLine();
        }
        // Set working day
        validate = true;
        System.out.print("Number of working days: ");
        while (validate) {
        	if (scan.hasNextFloat()) {
        		s.setNoOfWorkingDay(scan.nextFloat());
        		validate = false;
			}
        	else {
        		System.err.print("WORKING DAY - Please input number: ");
        	}
		}
		return s;
	}
	
	// Create new teacher
	public static Teacher createNewEmployee(Teacher t) {
		Scanner scan = new Scanner(System.in);
		boolean validate;
		// Set name
		validate = true;
		System.out.print("Name: ");
		while (validate) {
			String name = scan.nextLine();
			if (name.trim().isEmpty()) {
				System.err.print("NAME - Please input teacher name: ");
			}
			else {
				t.setFullName(name);
				validate = false;
			}
		}
        // Set salary ratio
		validate = true;
        System.out.print("Salary ratio: ");
        while (validate) {
        	if (scan.hasNextFloat()) {
        		t.setSalaryRatio(scan.nextFloat());
        		validate = false;
        	}
        	else {
        		System.err.print("SALARY RATIO - Please input number: ");
        	}
        	scan.nextLine();
        }
        // Set faculry
        validate = true;
        System.out.print("Faculry: ");
        while (validate) {
        	String facury = scan.nextLine();
        	if (facury.trim().isEmpty()) {
        		System.err.print("FACULRY - Please input teacher faculry: ");
        	}
        	else {
        		t.setFaculty(facury);
        		validate = false;
        	}
        }
        // Set degree
        validate = true;
        System.out.print("Degree (1=BACHELOR; 2=MASTER; 3=DOCTOR): ");
        while (validate) {
        	if (scan.hasNextByte()) {
        		byte teacherDegree = scan.nextByte();
                switch(teacherDegree) {
                case 1:
                	t.setDegree(EDegree.BACHELOR);
                	validate = false;
                	break;
                case 2:
                	t.setDegree(EDegree.MASTER);
                	validate = false;
                	break;
                case 3:
                	t.setDegree(EDegree.DOCTOR);
                	validate = false;
                	break;
                }
        	}
        	else {
        		System.err.print("DEGREE - Please input from 1,2 or 3: ");
        	}
        	scan.nextLine();
        }
        // Set teaching hours
        validate = true;
        System.out.print("Number of teaching hours: ");
        while (validate) {
        	if (scan.hasNextFloat()) {
        		t.setTeachingHours(scan.nextInt());
        		validate = false;
        	}
        	else {
        		System.err.print("TEACHING HOURS - Please input number: ");
        	}
        }
		return t;
	}
}
