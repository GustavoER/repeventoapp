package com.eventoapp.Repository;

import com.eventoapp.Models.Convidado;
import com.eventoapp.Models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<Convidado, String> {
    Iterable<Convidado> findByEvento(Evento evento);
    Convidado findByrg(String rg);
}
