package com.eventoapp.Repository;

import com.eventoapp.Models.Evento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface EventoRepository extends CrudRepository<Evento, Integer> {

}
