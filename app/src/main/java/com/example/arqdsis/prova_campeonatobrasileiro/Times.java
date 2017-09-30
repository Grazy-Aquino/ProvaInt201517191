package com.example.arqdsis.prova_campeonatobrasileiro;

import java.io.Serializable;

/**
 * Grazielly de Aquino Nascimento 201517191.
 */

public class Times implements Serializable, Comparable {
    private String nome;
    private String jogos;
    private String vitorias;
    private String empates;
    private String derrotas;
    private String golsmarcados;
    private String golssofridos;
    private String saldodegols;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getJogos() {
        return jogos;
    }

    public void setJogos(String jogos) {
        this.jogos = jogos;
    }

    public String getVitorias() {
        return vitorias;
    }

    public void setVitorias(String vitorias) {
        this.vitorias = vitorias;
    }

    public String getEmpates() {
        return empates;
    }

    public void setEmpates(String empates) {
        this.empates = empates;
    }

    public String getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(String derrotas) {
        this.derrotas = derrotas;
    }

    public String getGolsmarcados() {
        return golsmarcados;
    }

    public void setGolsmarcados(String golsmarcados) {
        this.golsmarcados = golsmarcados;
    }

    public String getGolssofridos() {
        return golssofridos;
    }

    public void setGolssofridos(String golssofridos) {
        this.golssofridos = golssofridos;
    }

    public String getSaldodegols() {
        return saldodegols;
    }

    public void setSaldodegols(String saldodegols) {
        this.saldodegols = saldodegols;
    }
}

