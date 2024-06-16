package com.example.ExamenFinal.services;




import com.example.ExamenFinal.entities.Agenda;

import java.util.List;

public interface AgendaService {

    public List<Agenda> findAll();
    public Agenda findById(Long Id);
    public void create(Agenda agenda);
    public void update(Long id, Agenda agenda);
    public void delate(Long id);
}
