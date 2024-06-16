package com.example.ExamenFinal.services;


import com.example.ExamenFinal.dao.AgendaDao;
import com.example.ExamenFinal.entities.Agenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaServiceImpl implements AgendaService {

    @Autowired
    AgendaDao agendaDao;

    @Override
    public List<Agenda> findAll() {
        return (List<Agenda>) agendaDao.findAll();
    }

    @Override
    public Agenda findById(Long id) {
        return agendaDao.findById(id).orElse(null);
    }

    @Override
    public void create(Agenda agenda) {
        agendaDao.save(agenda);
    }

    @Override
    public void update(Long id, Agenda agenda) {
        if (agendaDao.existsById(id)) {
            agenda.setId(id);
            agendaDao.save(agenda);
        }
    }
    @Override
    public void delate(Long id) {
        if (agendaDao.existsById(id)){
            agendaDao.deleteById(id);
        }
    }
}
