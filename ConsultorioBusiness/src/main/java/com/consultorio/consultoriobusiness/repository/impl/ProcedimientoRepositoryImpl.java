/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.consultoriobusiness.repository.impl;

import com.consultorio.consultoriobusiness.entity.Procedimiento;
import com.consultorio.consultoriobusiness.repository.ProcedimientoRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge
 */
public class ProcedimientoRepositoryImpl implements ProcedimientoRepository{

    
    private List<Procedimiento> procedimientoList=new ArrayList<>();
    
    @Override
    public void save (Procedimiento entity){
        procedimientoList.add(entity);
    }

    @Override
    public void update(Procedimiento entity) {
        int index=procedimientoList.indexOf(entity);
        procedimientoList.add(entity);
    }

    @Override
    public Procedimiento findById(Long id) {
    return procedimientoList.get(id.intValue());
    }

    @Override
    public List findall() {
      return   procedimientoList;
    }
}
