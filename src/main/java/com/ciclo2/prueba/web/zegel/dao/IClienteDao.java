package com.ciclo2.prueba.web.zegel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciclo2.prueba.web.zegel.models.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Integer>{

}
