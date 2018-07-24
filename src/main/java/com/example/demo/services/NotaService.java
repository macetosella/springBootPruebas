package com.example.demo.services;

import com.example.demo.converter.Convertidor;
import com.example.demo.entity.Nota;
import com.example.demo.model.MNota;
import com.example.demo.repository.NotaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("servicio")
public class NotaService {

    @Autowired
    @Qualifier("repositorio")
    private NotaRepositorio repositorio;

    @Autowired
    @Qualifier("convertidor")
    private Convertidor convertidor ;

    public boolean crear(Nota nota){
        try{
            repositorio.save(nota);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    public boolean borrar(Nota nota){
        try{
            repositorio.delete(nota);
            return true;
        }catch (Exception ex){
            return false;
        }
    }

    public List<MNota> obtener(){
        return convertidor.convertirLista(repositorio.findAll());
    }

    public boolean actualizar(Nota nota){
        try{
            repositorio.save(nota);
            return true;
        }catch (Exception ex){
            return false;
        }
    }


}
