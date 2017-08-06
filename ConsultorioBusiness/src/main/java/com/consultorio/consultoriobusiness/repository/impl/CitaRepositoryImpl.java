/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.consultoriobusiness.repository.impl;

import com.consultorio.consultoriobusiness.entity.Cita;
import com.consultorio.consultoriobusiness.repository.CitaRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class CitaRepositoryImpl implements CitaRepository{

    private List<Cita> citaList=new ArrayList<>();
    
   
    @Override
    public void save(Cita entity) {
        citaList.add(entity);
    }

  
    @Override
    public void update(Cita entity) {
        int index=citaList.indexOf(this);
        citaList.set(index, entity);
    }

    
    @Override
    public Cita findById(Long id) {
    return citaList.get(id.intValue());
    }

    @Override
    public List findall() {
    return citaList;   
    }

}