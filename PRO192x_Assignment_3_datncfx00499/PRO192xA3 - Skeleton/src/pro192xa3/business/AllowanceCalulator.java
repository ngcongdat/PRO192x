/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192xa3.business;

import pro192xa3.entity.EDegree;
import pro192xa3.entity.EPosition;
import pro192xa3.entity.Employee;
import pro192xa3.entity.Staff;
import pro192xa3.entity.Teacher;

/**
 *
 * @author hp
 */
public class AllowanceCalulator {
	/*
    for teacher:
    bachelor/cử nhân 300
    master/thạc sĩ 500
    doctor/tiến sĩ 1000
    
    for staff:
    head/trưởng phòng 2000
    vice-head/phó phòng 1000
    staff/nhân viên 500
    */
    public static float calculateAllowance(Employee emp){        
        float allowance = 0;
        if(emp instanceof Staff){
            Staff s = (Staff) emp;
            if(s.getPosition() == EPosition.HEAD) allowance = 2000;
            if(s.getPosition() == EPosition.VICE_HEAD) allowance = 1000;
            if(s.getPosition() == EPosition.STAFF) allowance = 500;
        }
        if(emp instanceof Teacher){
            Teacher t = (Teacher) emp;
            if(t.getDegree()==EDegree.DOCTOR) allowance = 1000;
            if(t.getDegree()==EDegree.MASTER) allowance = 500;
            if(t.getDegree()==EDegree.BACHELOR) allowance = 300;
        }
        return allowance;
    }
}
