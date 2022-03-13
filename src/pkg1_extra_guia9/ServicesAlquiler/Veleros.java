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
public class Veleros extends Embarcacion {
    
    Integer numerosMastiles;

    public Veleros() {
    }

    public Veleros(Integer numerosMastiles, String matricula, Integer eslora, Integer anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.numerosMastiles = numerosMastiles;
    }

    public Integer getNumerosMastiles() {
        return numerosMastiles;
    }

    public void setNumerosMastiles(Integer numerosMastiles) {
        this.numerosMastiles = numerosMastiles;
    }

    @Override
    public void calculoAdicionalPorTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     
    
    
}
