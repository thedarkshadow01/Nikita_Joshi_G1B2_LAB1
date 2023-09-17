/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;
import gl.super_department;
import gl.admin_department;
import gl.hr_department;
import gl.tech_department;
/**
 *
 * @author Nikita
 */
public class Main{
    public static void main(String[] args) {
        admin_department obj1= new admin_department();
        hr_department obj2= new hr_department();
        tech_department obj3= new tech_department();
        
        System.out.println("Welcome to "+ obj1.departmentName()); 
        System.out.println(obj1.getTodaysWork()); 
        System.out.println(obj1.getWorkDeadline());
        System.out.println(obj1.isTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to "+obj2.departmentName()); 
        System.out.println(obj2.doActivity());
        System.out.println(obj2.getTodaysWork()); 
        System.out.println(obj2.getWorkDeadline());
        System.out.println(obj2.isTodayAHoliday());
        System.out.println();
        
        System.out.println("Welcome to "+obj3.departmentName()); 
        System.out.println(obj3.getTodaysWork()); 
        System.out.println(obj3.getWorkDeadline());
        System.out.println(obj3.getTechStackInformation());
        System.out.println(obj3.isTodayAHoliday());
    }
}
