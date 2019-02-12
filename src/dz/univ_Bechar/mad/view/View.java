/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univ_Bechar.mad.view;

import dz.univ_Bechar.mad.model.Employee;
import java.util.List;

/**
 *
 * @author Chaima
 */
public interface View {
     void showEnrolledEmployees(List<Employee> l);
}
