package com.demo.spring.boot.backend.apirest.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.demo.spring.boot.backend.apirest.model.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
