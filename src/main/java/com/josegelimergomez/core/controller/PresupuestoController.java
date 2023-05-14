package com.josegelimergomez.core.controller;

import com.josegelimergomez.core.dto.PresupuestoDto;
import com.josegelimergomez.core.entity.Presupuesto;
import com.josegelimergomez.core.exceptions.PresupuestoExceptions;
import com.josegelimergomez.core.service.PresupuestoService;
import com.josegelimergomez.core.util.Convertir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class PresupuestoController {

    @Autowired
    private PresupuestoService service;

    @Autowired
    private Convertir convertir;

    @PostMapping("/presupuesto")
    public ResponseEntity<Presupuesto> crearPresupuesto(@RequestBody PresupuestoDto nuevoPresupuesto){
        try {
            Presupuesto crearPresupuesto = convertir.convertirAEnity(nuevoPresupuesto);
            if(crearPresupuesto != null){

                return ResponseEntity.status(HttpStatus.CREATED).body(service.
                        crearNuevoPresupuesto(crearPresupuesto));
            } else {
                throw new PresupuestoExceptions("Error al crear el presupuesto. " +
                        "El objeto convertido es nul");
            }

        } catch (PresupuestoExceptions pe){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

    @GetMapping("/presupuesto")
    public ResponseEntity<Map<String, Object>> traerTodosLosPresupuestos(
            @RequestParam(required = false) Integer year){

        try {
            Map<String, Object> data = new HashMap<>();
            List<Presupuesto> todosLosPresupuestos = service.traerTodosLosPresupuestos();
            if(todosLosPresupuestos.isEmpty()){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            }
            data.put("data", todosLosPresupuestos);
            return ResponseEntity.status(HttpStatus.OK).body(data);
        } catch (PresupuestoExceptions pe){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }

    }
}
