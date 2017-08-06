/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.consultoriobusiness.repository.impl;

import com.consultorio.consultoriobusiness.entity.Paciente;
import com.consultorio.consultoriobusiness.repository.PacienteRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class PacienteRepositoryImpl implements PacienteRepository {

    private List<Paciente> pacienteList=new ArrayList<>();
    
    
    @Override
    public void save(Paciente entity) {
       pacienteList.add(entity);
    }

    @Override
    public void update(Paciente entity) {
      int index=pacienteList.indexOf(entity);
        pacienteList.add(entity);
    }

    @Override
    public Paciente findById(Long id) {
    return pacienteList.get(id.intValue());
    }

    @Override
    public List findall() {
    return pacienteList;     
    }
}