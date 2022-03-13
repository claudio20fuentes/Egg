package pkg1_extra_guia9.ServicesAlquiler;


import pkg1_extra_guia9.ServicesAlquiler.Embarcacion;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAZAMA
 */
public class Yates extends  Embarcacion {
    
    Integer potenciaCv;
    Integer numCamarotes;

    public Yates() {
    }

    public Yates(Integer potenciaCv, Integer numCamarotes, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCv = potenciaCv;
        this.numCamarotes = numCamarotes;
    }

    public Integer getPotenciaCv() {
        return potenciaCv;
    }

    public void setPotenciaCv(Integer potenciaCv) {
        this.potenciaCv = potenciaCv;
    }

    public Integer getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(Integer numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    @Override
    public void calculoAdicionalPorTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
