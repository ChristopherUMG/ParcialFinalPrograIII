package com.example.ExamenFinal.controllers;

import com.example.ExamenFinal.entities.Agenda;
import com.example.ExamenFinal.services.AgendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    @Autowired
    AgendaService agendaService;

    @GetMapping
    public List<Agenda> GetAll(){
        return agendaService.findAll();
    }

    @GetMapping(value="/{id}")
    public Agenda GetById(@PathVariable Long id){
        return agendaService.findById(id);
    }



    @PostMapping
    public void create(@Valid @RequestBody Agenda agenda){

        agendaService.create(agenda);
    }

    @PutMapping(value="/{id}")
    public void update (@PathVariable Long id,
                        @RequestBody Agenda agenda){
        agendaService.update(id, agenda);
    }


    @DeleteMapping(value="/{id}")
    public void delete(@PathVariable Long id){

        agendaService.delate(id);
    }
}