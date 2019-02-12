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
public interface Model {
 
    
    String getEnrolledEmployeeDetailsFromModel();
    void addEmployeeToModel(Employee em);
    void removeEmployeeFromModel(String s);
}
