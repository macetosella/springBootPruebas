package com.example.demo.repository;

import com.example.demo.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("repositorio")
public interface NotaRepositorio extends JpaRepository<Nota,Serializable> {

    Nota findByNombre(String nombre);
    List<Nota> findByTitulo(String titulo);
    Nota findByNombreAndTitulo(String nombre, String titulo);
}
