/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author fp
 */
public class Provincias implements Serializable{
    
    // Atributos del objeto
    private String nombreProvincia;
    private String capitalProvincia;
    private String informacion; 
    private String [] imagenes;
    private int numero;

    /**
     * Constructor vacio
     */
    public Provincias() {
        this.nombreProvincia = "";
        this.capitalProvincia = "";
        this.informacion = "";
        this.imagenes = new String [3];
        numero = 0;
    }

    /**
     * Constructor
     * @param nombreProvincia
     * @param capitalProvincia
     * @param informacion
     * @param imagenes
     * @param numero 
     */
    public Provincias(String nombreProvincia, String capitalProvincia, String informacion, String [] imagenes, int numero ) {
        this.nombreProvincia = nombreProvincia;
        this.capitalProvincia = capitalProvincia;
        this.informacion = informacion;
        this.imagenes = imagenes;
        this.numero = numero;
    }

    /**
     * Set de numero
     * @param numero 
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Get de numero
     * @return 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Get de nombreProvincia
     * @return 
     */
    public String getNombreProvincia() {
        return nombreProvincia;
    }

    /**
     * Get de capitalProvincia
     * @return 
     */
    public String getCapitalProvincia() {
        return capitalProvincia;
    }

    /**
     * Get de informacion
     * @return 
     */
    public String getInformacion() {
        return informacion;
    }

    /**
     * Set de nombreProvincia
     * @param nombreProvincia 
     */
    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    /**
     * Set de capitalProvincia
     * @param capitalProvincia 
     */
    public void setCapitalProvincia(String capitalProvincia) {
        this.capitalProvincia = capitalProvincia;
    }

    /**
     * Set de informacion
     * @param informacion 
     */
    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    /**
     * Set de imagenes
     * @param imagenes 
     */
    public void setImagenes(String[] imagenes) {
        this.imagenes = imagenes;
    }

    /**
     * Get de imagenes
     * @return 
     */
    public String[] getImagenes() {
        return imagenes;
    }

    /**
     * Convertimos a binario
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nombreProvincia);
        hash = 13 * hash + Objects.hashCode(this.capitalProvincia);
        hash = 13 * hash + Objects.hashCode(this.informacion);
        return hash;
    }

    /**
     * Comparamos dos objetos
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Provincias other = (Provincias) obj;
        if (!Objects.equals(this.nombreProvincia, other.nombreProvincia)) {
            return false;
        }
        if (!Objects.equals(this.capitalProvincia, other.capitalProvincia)) {
            return false;
        }
        if (!Objects.equals(this.informacion, other.informacion)) {
            return false;
        }
        return true;
    }

    /**
     * Pasamos todo a string
     * @return 
     */
    @Override
    public String toString() {
        return "Provincias{" + "nombreProvincia=" + nombreProvincia + ", capitalProvincia=" + capitalProvincia + ", informacion=" + informacion + '}';
    }
}
