package com.example.demo.controller;

import com.example.demo.entity.Nota;
import com.example.demo.model.MNota;
import com.example.demo.services.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1")
public class NotaController {

    @Autowired
    @Qualifier("servicio")
    NotaService service;

    @GetMapping(value = "/notas")
    public List<MNota> obtenerNotas(){
        return service.obtener();
    }

    @PutMapping(value = "/nota")
    public boolean crear(@RequestBody @Valid Nota nota){
        return service.crear(nota);
    }

    @DeleteMapping(value = "/BorrarNota")
    public boolean borrar(@RequestBody @Valid Nota nota){
        return service.borrar(nota);
    }

    @PostMapping(value = "/ActualizarNota")
    public boolean actualizar(@RequestBody @Valid Nota nota){
        return service.actualizar(nota);
    }
}
