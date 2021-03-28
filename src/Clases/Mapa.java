/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author fp
 */
public class Mapa implements Serializable{
    
    // Atributos del objeto
    private String nombrePais;
    private ArrayList<Comunidades> comunidadesAutonomas;
    
    /**
     * Constructor vacio
     */
    public Mapa(){
        this.nombrePais = "";
        this.comunidadesAutonomas = new ArrayList<>();
    }
    
    /**
     * Constructor
     * @param nombrePais 
     */
    public Mapa(String nombrePais){
        this.nombrePais = nombrePais;
        this.comunidadesAutonomas = new ArrayList<>();
    }

    /**
     * Get de nombrePais
     * @return 
     */
    public String getNombrePais() {
        return nombrePais;
    }

    /**
     * Get de comunidadesAutonomas
     * @return 
     */
    public ArrayList<Comunidades> getComunidadesAutonomas() {
        return comunidadesAutonomas;
    }

    /**
     * Set de nombrePais
     * @param nombrePais 
     */
    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    /**
     * Set de comunidadesAutonomas
     * @param comunidadesAutonomas 
     */
    public void setComunidadesAutonomas(ArrayList<Comunidades> comunidadesAutonomas) {
        this.comunidadesAutonomas = comunidadesAutonomas;
    }

    /**
     * Convertimos a binario
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombrePais);
        hash = 47 * hash + Objects.hashCode(this.comunidadesAutonomas);
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
        final Mapa other = (Mapa) obj;
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        if (!Objects.equals(this.comunidadesAutonomas, other.comunidadesAutonomas)) {
            return false;
        }
        return true;
    }

    /**
     * Pasamos el objeto a string
     * @return 
     */
    @Override
    public String toString() {
        return "Mapa{" + "nombrePais=" + nombrePais + ", comunidadesAutonomas=" + comunidadesAutonomas + '}';
    }
    
    /**
     * Rellenamos el programa con las comunidades
     */
    public void rellenarPrograma(){
        // Creamos una comunidad andalucia
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades andalucia = new Comunidades("andalucia", 16);
        comunidadesAutonomas.add(andalucia);
        andalucia.rellenarProvincias("andalucia");
        
        // Creamos una comunidad extremadura
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades extremadura = new Comunidades("extremadura", 11);
        comunidadesAutonomas.add(extremadura);
        extremadura.rellenarProvincias("extremadura");
        
        // Creamos una comunidad castillaMancha
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades castillaMancha = new Comunidades("castilla la mancha", 12);
        comunidadesAutonomas.add(castillaMancha);
        castillaMancha.rellenarProvincias("castillaMancha");
        
        // Creamos una comunidad murcia
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades murcia = new Comunidades("murcia", 15);
        comunidadesAutonomas.add(murcia);
        murcia.rellenarProvincias("murcia");
        
        // Creamos una comunidad valencia
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades valencia = new Comunidades("valencia", 13);
        comunidadesAutonomas.add(valencia);
        valencia.rellenarProvincias("valencia");
        
        // Creamos una comunidad madrid
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades madrid = new Comunidades("madrid", 10);
        comunidadesAutonomas.add(madrid);
        madrid.rellenarProvincias("madrid");
        
        // Creamos una comunidad castillaLeon
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades castillaLeon = new Comunidades("castilla y leon", 7);
        comunidadesAutonomas.add(castillaLeon);
        castillaLeon.rellenarProvincias("castillaLeon");
        
        // Creamos una comunidad andalucia
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades galicia = new Comunidades("galicia", 1);
        comunidadesAutonomas.add(galicia);
        galicia.rellenarProvincias("galicia");
        
        // Creamos una comunidad asturias
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades asturias = new Comunidades("asturias", 2);
        comunidadesAutonomas.add(asturias);
        asturias.rellenarProvincias("asturias");
        
        // Creamos una comunidad paisVasco
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades paisVasco = new Comunidades("pais vasco", 4);
        comunidadesAutonomas.add(paisVasco);
        paisVasco.rellenarProvincias("paisVasco");
        
        // Creamos una comunidad rioja
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades rioja = new Comunidades("la rioja", 6);
        comunidadesAutonomas.add(rioja);
        rioja.rellenarProvincias("rioja");
        
        // Creamos una comunidad navarra
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades navarra = new Comunidades("navarra", 5);
        comunidadesAutonomas.add(navarra);
        navarra.rellenarProvincias("navarra");
        
        // Creamos una comunidad aragon
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades aragon = new Comunidades("aragon", 8);
        comunidadesAutonomas.add(aragon);
        aragon.rellenarProvincias("aragon");
        
        // Creamos una comunidad cataluña
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades cataluña = new Comunidades("cataluña", 9);
        comunidadesAutonomas.add(cataluña);
        cataluña.rellenarProvincias("cataluña");
        
        // Creamos una comunidad baleares
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades baleares = new Comunidades("islas baleares", 14);
        comunidadesAutonomas.add(baleares);
        baleares.rellenarProvincias("baleares");
        
        // Creamos una comunidad canarias
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades canarias = new Comunidades("islas canarias", 17);
        comunidadesAutonomas.add(canarias);
        canarias.rellenarProvincias("canarias");
        
        // Creamos una comunidad cantabria
        // La añadimos al arraylist
        // Insertamos sus provincias
        Comunidades cantabria = new Comunidades("cantabria", 3);
        comunidadesAutonomas.add(cantabria);
        canarias.rellenarProvincias("cantabria");
    }   
    
    public boolean respuestaProvincia(String nombreProvincia, int numeroProvincia){
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            respuestaCorrecta = comunidad.comprobarProvincia(nombreProvincia, numeroProvincia);
        }
        
        return respuestaCorrecta;
    }
    
    public boolean respuestaComunidad(String nombreComunidad, int numeroComunidad){
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la comunidad
            comunidad = iterador.next();
                    
            // Si coincide el numero de la comunidad
            if(numeroComunidad == comunidad.getNumeroComunidad()){
                // Si coincide los 2 nombres de la comunidad
                if(nombreComunidad.equals(comunidad.getNombreComunidad())){
                    // Actualizo la respuesta
                    respuestaCorrecta = true;
                }
            }
        }
        
        return respuestaCorrecta;
    }
    
        
    public boolean respuestaNomProvincia(String nombreProvincia, String nombreCapital){
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            respuestaCorrecta = comunidad.capitalNomProvincia(nombreProvincia, nombreCapital);
        }
        
        return respuestaCorrecta;
    }
    
        
    public boolean respuestaCapital(String nombreProvincia, String nombreCapital){
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            respuestaCorrecta = comunidad.comprobarCapital(nombreProvincia, nombreCapital);
        }
        
        return respuestaCorrecta;
    }
    
    public String nombreProvincia(int numeroProvincia){
        
        // Declaro e inicializo variable
        String respuesta = "";
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras respuesta este vacia
        while(iterador.hasNext() && respuesta.isEmpty()){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            respuesta = comunidad.sacarNombreProvincia(numeroProvincia);
        }
        
        return respuesta;
    }
    
    public String nombreCapital(int numeroProvincia){
        
        // Declaro e inicializo variable
        String respuesta = "";
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras respuesta este vacia
        while(iterador.hasNext() && respuesta.isEmpty()){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            respuesta = comunidad.sacarNombreCapital(numeroProvincia);
        }
        
        return respuesta;
    }
    
    public String conseguirNombre(String nombreProvincia){
        
        // Declaro e inicializo variable
        String nombre = "";
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras respuesta este vacia
        while(iterador.hasNext() && nombre.isEmpty()){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            nombre = comunidad.infoNombreProvincia(nombreProvincia);
        }
        
        return nombre;
    }
    
    public String conseguirInfo(String nombreProvincia){
        
        // Declaro e inicializo variable
        String info = "";
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades mientras respuesta este vacia
        while(iterador.hasNext() && info.isEmpty()){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            info = comunidad.infoInfoProvincia(nombreProvincia);
        }
        
        return info;
    }
    
    public String[] conseguirImg(String nombreProvincia){
        
        // Declaro e inicializo variable
        String []conseguirImg = null;
        // Declaramos un objeto comunidad
        Comunidades comunidad;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Comunidades> iterador = comunidadesAutonomas.iterator();
        
        // Recorro las comunidades
        while(iterador.hasNext() && conseguirImg == null ){

            // Actualizo la comunidad
            comunidad = iterador.next();

            // Llamo al metodo y actualizo la respuesta
            conseguirImg = comunidad.infoImgProvincia(nombreProvincia);
        }
        
        return conseguirImg;
    }
}
