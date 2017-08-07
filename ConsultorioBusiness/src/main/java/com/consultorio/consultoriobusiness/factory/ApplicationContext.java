/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.consultoriobusiness.factory;

import com.consultorio.consultoriobusiness.enums.RepositoryEnum;
import com.consultorio.consultoriobusiness.repository.Repository;
import com.consultorio.consultoriobusiness.repository.impl.CitaRepositoryImpl;
import com.consultorio.consultoriobusiness.repository.impl.DoctorRepositoryImpl;
import com.consultorio.consultoriobusiness.repository.impl.PacienteRepositoryImpl;
import com.consultorio.consultoriobusiness.repository.impl.ProcedimientoRepositoryImpl;
import com.consultorio.consultoriobusiness.repository.impl.RegistroRepositoryImpl;

/**
 *
 * @author Jorge
 */
public class ApplicationContext {
    
    
    public static Repository getRepository(RepositoryEnum repositoryenum){
        
        switch (repositoryenum) {
            case DOCTOR_REPOSITORY:
                return new DoctorRepositoryImpl();
            case PACIENTE_REPOSITORY:
                return new PacienteRepositoryImpl();
            case CITA_REPOSITORY:
                return new CitaRepositoryImpl();
            case PROCEDIMIENTO_REPOSITORY:
                return new ProcedimientoRepositoryImpl();
            case REGISTRO_REPOSITORY:
                return new RegistroRepositoryImpl();
            default:
                   return null;
        }
  
    }
}
