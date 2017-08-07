/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.consultoriobusiness.repository.util;

import com.consultorio.consultoriobusiness.entity.Doctor;
import java.util.Comparator;

/**
 *
 * @author Jorge
 */
public class DoctorOrdering implements Comparator<Doctor>{

    @Override
    public int compare(Doctor o1, Doctor o2) {
    return o2.getNombre().compareTo(o1.getNombre());
    }
    
}
