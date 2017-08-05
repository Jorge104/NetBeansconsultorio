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

    
    private final List<Procedimiento> procedimientoList=new ArrayList<>();
    
    public void save (Procedimiento entity){
        procedimientoList.add(entity);
    }

    public void update(Procedimiento entity) {
        int index=procedimientoList.indexOf(entity);
        procedimientoList.add(entity);
    }

    public Object findById(Long id) {
    return procedimientoList.get(id.intValue());
    }

    @Override
    public List findall() {
      return   procedimientoList;
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
