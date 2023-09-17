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
class admin_department extends super_department{
    String departmentName(){
        return "Admin Department";
    }
    String getTodaysWork(){
        return "Complete your documents Subission";
    }
    String getWorkDeadline(){
        return "Complete by EOD";
    }
}