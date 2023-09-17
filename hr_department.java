/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gl;
import gl.super_department;
/**
 *
 * @author Nikita
 */
class hr_department extends super_department{
    String departmentName(){
        return "Hr Department";
    }
    String getTodaysWork(){
        return "Fill today's timesheet and mark your attendance";
    }
    String getWorkDeadline(){
        return "Complete by EOD";
    }
    String doActivity(){
        return "team Lunch";
    }
}
