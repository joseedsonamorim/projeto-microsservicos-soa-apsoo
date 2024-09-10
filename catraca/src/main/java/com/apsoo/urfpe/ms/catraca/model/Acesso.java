package com.apsoo.urfpe.ms.catraca.model;

public class Acesso {

    private String matricula;
    private boolean autenticado;
    private boolean biometriaValida;

    // Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isAutenticado() {
        return autenticado;
    }

    public void setAutenticado(boolean autenticado) {
        this.autenticado = autenticado;
    }

    public boolean isBiometriaValida() {
        return biometriaValida;
    }

    public void setBiometriaValida(boolean biometriaValida) {
        this.biometriaValida = biometriaValida;
    }
}