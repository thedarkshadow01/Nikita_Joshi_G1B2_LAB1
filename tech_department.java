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
class tech_department extends super_department{
    String departmentName(){
        return "Tech Department";
    }
    String getTodaysWork(){
        return "Complete coding of module 1";
    }
    String getWorkDeadline(){
        return "Complete by EOD";
    }
    String getTechStackInformation(){
        return "core Java";
    }
}