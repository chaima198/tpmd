/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univ_Bechar.mad.controller;

import dz.univ_Bechar.mad.model.Employee;

/**
 *
 * @author Chaima
 */
public interface Controller {
     
    void displayEnrolledEmployees();
    void addEmployee(Employee e);
    void removeEmployee(String st);
}
