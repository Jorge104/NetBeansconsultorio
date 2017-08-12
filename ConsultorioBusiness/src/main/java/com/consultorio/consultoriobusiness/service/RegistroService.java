/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consultorio.consultoriobusiness.service;

import com.consultorio.consultoriobusiness.enums.RepositoryEnum;
import com.consultorio.consultoriobusiness.factory.ApplicationContext;
import com.consultorio.consultoriobusiness.repository.RegistroRepository;

/**
 *
 * @author Jorge
 */
public class RegistroService {
 
    private RegistroRepository registroRepository=(RegistroRepository) ApplicationContext.getRepository(RepositoryEnum.REGISTRO_REPOSITORY);
    
    
    
}
