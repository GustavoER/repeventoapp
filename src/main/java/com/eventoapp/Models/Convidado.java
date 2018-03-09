package com.eventoapp.Models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
public class Convidado {
    @Id
    @NotEmpty
    private String rg;
    @NotEmpty
    private String nomeconvidado;

    @ManyToOne
    @JoinColumn(name = "EVENTO")

    private Evento evento;
    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeconvidado() {
        return nomeconvidado;
    }

    public void setNomeconvidado(String nomeconvidado) {
        this.nomeconvidado = nomeconvidado;
    }

}
