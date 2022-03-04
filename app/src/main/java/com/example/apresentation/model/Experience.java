package com.example.apresentation.model;

public class Experience {

    private String cargo;
    private String tempo;
    private String empresa;
    private String description;

    public Experience(){

    }

    public Experience(String cargo, String tempo, String empresa, String description) {
        this.cargo = cargo;
        this.tempo = tempo;
        this.empresa = empresa;
        this.description = description;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
