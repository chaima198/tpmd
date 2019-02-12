/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univ_Bechar.mad.model;

/**
 *
 * @author Chaima
 */
public class Employee {
    String empName,empld;
    
    
  String getEmpName(){
     return empName;
 }   
   public String getEmpld(){
     return empld;
 }     
   Employee(String empName,String empld){
      this.empName=empName;
      this.empld=empld;
  }  
    @Override
     public String toString(){
        return null;
        
    }
    boolean equals( String Object){
        return false;
        
    }
    
    
    
    
}
