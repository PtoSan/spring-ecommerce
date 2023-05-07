package com.curso.ecommerce.springecommerce.service;

import java.util.Optional;

import com.curso.ecommerce.springecommerce.model.Usuario;

public interface IUsuarioService {
    
    Optional<Usuario> findById(Integer id);

}
