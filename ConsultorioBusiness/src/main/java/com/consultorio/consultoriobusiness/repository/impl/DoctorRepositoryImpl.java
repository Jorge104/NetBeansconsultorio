/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.consultoriobusiness.repository.impl;

import com.consultorio.consultoriobusiness.entity.Doctor;
import com.consultorio.consultoriobusiness.repository.DoctorRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class DoctorRepositoryImpl implements DoctorRepository{
    
    private List<Doctor> doctorList=new ArrayList<>();
    
//    @Override
    public void save(Doctor entity) {
        doctorList.add(entity);
    }
//    @Override
    public void update(Doctor entity) {
        int index=doctorList.indexOf(entity);
        doctorList.add(entity);
    }

//    @Override
    public Object findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List findall() {
    return doctorList; 
    }

    @Override
    public void save(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Object entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object findById(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
