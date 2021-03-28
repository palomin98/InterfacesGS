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
public class Comunidades implements Serializable{
    
    // Atributos del objeto
    private String nombreComunidad;
    private int numeroComunidad;
    private ArrayList<Provincias> provincias;
    
    /**
     * Constructor vacio
     */
    public Comunidades(){
        this.nombreComunidad = "";
        this.numeroComunidad = 0;
        this.provincias = new ArrayList<>();
    }
    
    /**
     * Constructor
     * @param nombreComunidad
     * @param numeroComunidad 
     */
    public Comunidades(String nombreComunidad, int numeroComunidad){
        this.nombreComunidad = nombreComunidad;
        this.numeroComunidad = numeroComunidad;
        this.provincias = new ArrayList<>();
    }

    /**
     * Set de numeroComunidad
     * @param numeroComunidad 
     */
    public void setNumeroComunidad(int numeroComunidad) {
        this.numeroComunidad = numeroComunidad;
    }

    /**
     * Get numeroComunidad
     * @return 
     */
    public int getNumeroComunidad() {
        return numeroComunidad;
    }

    /**
     * Get nombreComunidad
     * @return 
     */
    public String getNombreComunidad() {
        return nombreComunidad;
    }

    /**
     * Get provincias
     * @return 
     */
    public ArrayList<Provincias> getProvincias() {
        return provincias;
    }

    /**
     * Set nombreComunidad
     * @param nombreComunidad 
     */
    public void setNombreComunidad(String nombreComunidad) {
        this.nombreComunidad = nombreComunidad;
    }

    /**
     * Get provincias
     * @param provincias 
     */
    public void setProvincias(ArrayList<Provincias> provincias) {
        this.provincias = provincias;
    }

    /**
     * Convertir a binario
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombreComunidad);
        hash = 19 * hash + Objects.hashCode(this.provincias);
        return hash;
    }

    /**
     * Comparamos objetos
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
        final Comunidades other = (Comunidades) obj;
        if (!Objects.equals(this.nombreComunidad, other.nombreComunidad)) {
            return false;
        }
        if (!Objects.equals(this.provincias, other.provincias)) {
            return false;
        }
        return true;
    }

    /**
     * Convertimos a String
     * @return 
     */
    @Override
    public String toString() {
        return "Comunidades{" + "nombreComunidad=" + nombreComunidad + ", provincias=" + provincias + '}';
    }
    
    /**
     * Rellenamos el arraylist de las provincias segun la comunidad
     * @param nombreComunidad 
     */
    public void rellenarProvincias(String nombreComunidad){
        // Array de imagenes
        String [] imghuelva = {"huelva1.jpg","huelva2.jpg","huelva3.jpg"};
        String [] imgsevilla = {"sevilla1.jpg","sevilla2.jpg","sevilla3.jpg"};
        String [] imgcadiz = {"cadiz1.jpg","cadiz2.jpg","cadiz3.jpg"};
        String [] imgcordoba = {"cordoba1.jpg","cordoba2.jpg","cordoba3.jpg"};
        String [] imgjaen = {"jaen1.jpg","jaen2.jpg","jaen3.jpg"};
        String [] imggranada = {"granada1.jpg","granada2.jpg","granada3.jpg"};
        String [] imgalmeria = {"almeria1.jpg","almeria2.jpg","almeria3.jpg"};
        String [] imgbadajoz = {"badajoz1.jpg","badajoz2.jpg","badajoz3.jpg"};
        String [] imgcaceres = {"caceres1.jpg","caceres2.jpg","caceres3.jpg"};
        String [] imgciudaReal = {"ciudaReal1.jpg","ciudaReal2.jpg","ciudaReal3.jpg"};
        String [] imgtoledo = {"toledo1.jpg","toledo2.jpg","toledo3.jpg"};
        String [] imgcuenca = {"cuenca1.jpg","cuenca2.jpg","cuenca3.jpg"};
        String [] imgalbacete = {"albacete1.jpg","albacete2.jpg","albacete3.jpg"};
        String [] imgguadalajara = {"guadalajara1.jpg","guadalajara2.jpg","guadalajara3.jpg"};
        String [] imgmurcia = {"murcia1.jpg","murcia2.jpg","murcia3.jpg"};
        String [] imgalicante = {"alicante1.jpg","alicante2.jpg","alicante3.jpg"};
        String [] imgvalencia = {"valencia1.jpg","valencia2.jpg","valencia3.jpg"};
        String [] imgcastellon = {"castellon1.jpg","castellon2.jpg","castellon3.jpg"};
        String [] imgmadrid = {"madrid1.jpg","madrid2.jpg","madrid3.jpg"};
        String [] imgsalamanca = {"salamanca1.jpg","salamanca2.jpg","salamanca3.jpg"};
        String [] imgzamora = {"zamora1.jpg","zamora2.jpg","zamora3.jpg"};
        String [] imgleon = {"leon1.jpg","leon2.jpg","leon3.jpg"};
        String [] imgpalencia = {"palencia1.jpg","palencia2.jpg","palencia3.jpg"};
        String [] imgavila = {"avila1.jpg","avila2.jpg","avila3.jpg"};
        String [] imgvalladoliz = {"valladolid1.jpg","valladolid2.jpg","valladolid3.jpg"};
        String [] imgsegovia = {"segovia1.jpg","segovia2.jpg","segovia3.jpg"};
        String [] imgburgos = {"burgos1.jpg","burgos2.jpg","burgos3.jpg"};
        String [] imgsoria = {"soria1.jpg","soria2.jpg","soria3.jpg"};
        String [] imgcoruña = {"coruna1.jpg","coruna2.jpg","coruna3.jpg"};
        String [] imgpontevedra = {"pontevedra1.jpg","pontevedra2.jpg","pontevedra3.jpg"};
        String [] imglugo = {"lugo1.jpg","lugo2.jpg","lugo3.jpg"};
        String [] imgourense = {"ourense1.jpg","ourense2.jpg","ourense3.jpg"};
        String [] imgasturias = {"asturias1.jpg","asturias2.jpg","asturias3.jpg"};
        String [] imgvizcaya = {"vizcaya1.jpg","vizcaya2.jpg","vizcaya3.jpg"};
        String [] imggipuzcoa = {"gipuzcoa1.jpg","gipuzcoa2.jpg","gipuzcoa3.jpg"};
        String [] imgalava = {"alava1.jpg","alava2.jpg","alava3.jpg"};
        String [] imgrioja = {"rioja1.jpg","rioja2.jpg","rioja3.jpg"};
        String [] imgnavarra = {"navarra1.jpg","navarra2.jpg","navarra3.jpg"};
        String [] imghuesca = {"huesca1.jpg","huesca2.jpg","huesca3.jpg"};
        String [] imgzaragoza = {"zaragoza1.jpg","zaragoza2.jpg","zaragoza3.jpg"};
        String [] imgteruel = {"teruel1.jpg","teruel2.jpg","teruel3.jpg"};
        String [] imglleida = {"lleida1.jpg","lleida2.jpg","lleida3.jpg"};
        String [] imgtarragona = {"tarragona1.jpg","tarragona2.jpg","tarragona3.jpg"};
        String [] imgbarcelona = {"barcelona1.jpg","barcelona2.jpg","barcelona3.jpg"};
        String [] imggirona = {"girona1.jpg","girona2.jpg","girona3.jpg"};
        String [] imgbaleares = {"baleares1.jpg","baleares2.jpg","baleares3.jpg"};
        String [] imgpalmas = {"palmas1.jpg","palmas2.jpg","palmas3.jpg"};
        String [] imgsantaCruz = {"santaCruz1.jpg","santaCruz2.jpg","santaCruz3.jpg"};
        String [] imgcantabria = {"cantabria1.jpg","cantabria2.jpg","cantabria3.jpg"};
        String [] imgmalaga = {"malaga1.jpg","malaga2.jpg","malaga3.jpg"};
        
        // Depende de la comunidad introducimos diferentes provincias
        switch (nombreComunidad) {
            case "andalucia":
                // Creamos las provincas de andalucia
                // Las añadimos al arraylist
                Provincias huelva = new Provincias("huelva", "huelva", "Patrón: San Sebastián. Patrona: Nuestra Señora de la Cinta Coronada.", imghuelva,40);
                provincias.add(huelva);
                Provincias sevilla = new Provincias("sevilla", "sevilla", "Patrón: San Fernando, Patrona: Ntra. Sra. de los Reyes.", imgsevilla, 41);
                provincias.add(sevilla);
                Provincias cadiz = new Provincias("cadiz", "cadiz", "Universidad: Universidad de Cádiz.", imgcadiz, 42);
                provincias.add(cadiz);
                Provincias cordoba = new Provincias("cordoba", "cordoba", "Universidad: Universidad de Córdoba.", imgcordoba, 43);
                provincias.add(cordoba);
                Provincias jaen = new Provincias("jaen", "jaen", "Alcalde: Francisco Javier Márquez Sánchez.", imgjaen, 45);
                provincias.add(jaen);
                Provincias granada = new Provincias("granada", "granada", "Alcalde: Francisco Cuenca Rodríguez.", imggranada, 46);
                provincias.add(granada);
                Provincias almeria = new Provincias("almeria", "almeria", "Presupuesto: 190 194 566 €", imgalmeria, 47);
                provincias.add(almeria);
                Provincias malaga = new Provincias("malaga", "malaga", "Alcalde: Francisco de la Torre Prados.", imgmalaga, 44);
                provincias.add(malaga);
                break;
            case "extremadura":
                // Creamos las provincas de extremadura
                // Las añadimos al arraylist
                Provincias badajoz = new Provincias("badajoz","badajoz","Población: 150.543 habitantes", imgbadajoz, 35);
                provincias.add(badajoz);
                Provincias caceres = new Provincias("caceres","caceres","Presupuesto: 69.045.004€", imgcaceres, 34);
                provincias.add(caceres);
                break;
            case "castillaMancha":
                // Creamos las provincas de castillaMancha
                // Las añadimos al arraylist
                Provincias ciudaReal = new Provincias("ciudad real","ciudad real","Sitio web: ciudadreal.es", imgciudaReal, 32);
                provincias.add(ciudaReal);
                Provincias toledo = new Provincias("toledo","toledo","Código postal: 45001-45009.", imgtoledo, 30);
                provincias.add(toledo);
                Provincias cuenca = new Provincias("cuenca","cuenca","Elevación: 946m.", imgcuenca, 31);
                provincias.add(cuenca);
                Provincias albacete = new Provincias("albacete","albacete","Superficie: 1125,91km.", imgalbacete, 33);
                provincias.add(albacete);
                Provincias guadalajara = new Provincias("guadalajara","guadalajara","Pref.Telefónico: 949", imgguadalajara, 29);
                provincias.add(guadalajara);
                break;
            case "murcia":
                // Creamos las provincas de murcia
                // Las añadimos al arraylist
                Provincias murcia = new Provincias("murcia","murcia","Población: 441.003.", imgmurcia, 39);
                provincias.add(murcia);
                break;
            case "valencia":
                // Creamos las provincas de valencia
                // Las añadimos al arraylist
                Provincias alicante = new Provincias("alicante","alicante","Hoteles: Los hoteles de 3 estrellas tienen un precio medio de 53€ y los de 5 estrellas, de 157€", imgalicante,38);
                provincias.add(alicante);
                Provincias valencia = new Provincias("valencia","valencia","Gentilicio: Valenciano, -na", imgvalencia,37);
                provincias.add(valencia);
                Provincias castellon = new Provincias("castellon","castellon de la plana","Sitio web: www.castello.es", imgcastellon,36);
                provincias.add(castellon);
                break;
            case "madrid":
                // Creamos las provincas de madrid
                // Las añadimos al arraylist
                Provincias madrid = new Provincias("madrid","madrid","La mejor comunidad del mundo.", imgmadrid, 28);
                provincias.add(madrid);
                break;
            case "castillaLeon":
                // Creamos las provincas de castillaLeon
                // Las añadimos al arraylist
                Provincias salamanca = new Provincias("salamanca","salamanca","Población: 144.949", imgsalamanca, 18);
                provincias.add(salamanca);
                Provincias zamora = new Provincias("zamora","zamora","Hoteles: Los hoteles de 3 estrellas tienen un precio medio de 60 €", imgzamora, 15);
                provincias.add(zamora);
                Provincias leon = new Provincias("leon","leon","Gentilicio: Leonés/sa ", imgleon, 12);
                provincias.add(leon);
                Provincias palencia = new Provincias("palencia","palencia","Sitio web: www.aytopalencia.es", imgpalencia, 13);
                provincias.add(palencia);
                Provincias avila = new Provincias("avila","avila","Presupuesto: 53.759.219€", imgavila, 19);
                provincias.add(avila);
                Provincias valladolid = new Provincias("valladolid","valladolid","Código postal: 47001 - 47017", imgvalladoliz, 16);
                provincias.add(valladolid);
                Provincias segovia = new Provincias("segovia","segovia","El poblamiento humano en el entorno de lo que hoy es Segovia se remonta a hace unos 60 000 años.", imgsegovia,20);
                provincias.add(segovia);
                Provincias burgos = new Provincias("burgos","burgos","Facultades y universidades: Universidad de Burgos, Universidad Isabel I.", imgburgos, 14);
                provincias.add(burgos);
                Provincias soria = new Provincias("soria","soria","Superficie: 271,8 km.", imgsoria, 17);
                provincias.add(soria);
                break;
            case "galicia":
                // Creamos las provincas de galicia
                // Las añadimos al arraylist
                Provincias coruña = new Provincias("la coruña","la coruña","Lema:«Muy noble y muy leal ciudad de La Coruña, cabeza, guarda y llave, fuerza y antemural del Reino de Galicia»", imgcoruña, 1);
                provincias.add(coruña);
                Provincias pontevedra = new Provincias("pontevedra","pontevedra","Sitio web: www.pontevedra.gal", imgpontevedra, 3);
                provincias.add(pontevedra);
                Provincias lugo = new Provincias("lugo","lugo","Congreso Senado Parlamento de Galicia: 4 diputados; 4 senadores; 14 diputados.", imglugo, 2);
                provincias.add(lugo);
                Provincias ourense = new Provincias("ourense","ourense","Población: 105.893.", imgourense, 4);
                provincias.add(ourense);
                break;
            case "asturias":
                // Creamos las provincas de asturias
                // Las añadimos al arraylist
                Provincias asturias = new Provincias("asturias","oviedo","Población: 1,043 millones.", imgasturias, 5);
                provincias.add(asturias);
                break;
            case "cantabria":
                // Creamos las provincas de cantabria
                // Las añadimos al arraylist
                Provincias cantabria = new Provincias("cantabria","santander","Fiesta oficial: Virgen de la Bien Aparecida (15 de septiembre).", imgcantabria, 6);
                provincias.add(cantabria);
                break;
            case "paisVasco":
                // Creamos las provincas de paisVasco
                // Las añadimos al arraylist
                Provincias vizcaya = new Provincias("vizcaya","bilbao","Idioma oficial: Español y euskera", imgvizcaya, 7);
                provincias.add(vizcaya);
                Provincias gipuzcoa = new Provincias("guipuzcoa","san sebastian","Clima	Clima: oceánico", imggipuzcoa,8);
                provincias.add(gipuzcoa);
                Provincias alava = new Provincias("alava","vitoria","Gentilicio: alavés, sa; babazorro, rra.", imgalava, 9);
                provincias.add(alava);
                break;
            case "rioja":
                // Creamos las provincas de rioja
                // Las añadimos al arraylist
                Provincias rioja = new Provincias("la rioja","logroño","Población: 315.794", imgrioja, 11);
                provincias.add(rioja);
                break;
            case "navarra":
                // Creamos las provincas de navarra
                // Las añadimos al arraylist
                Provincias navarra = new Provincias("navarra","pamplona","Los San Fermines", imgnavarra, 10);
                provincias.add(navarra);
                break;
            case "aragon":
                // Creamos las provincas de aragon
                // Las añadimos al arraylist
                Provincias huesca = new Provincias("huesca","huesca","hola38", imghuesca,21);
                provincias.add(huesca);
                Provincias zaragoza = new Provincias("zaragoza","zaragoza","hola39", imgzaragoza,22);
                provincias.add(zaragoza);
                Provincias teruel = new Provincias("teruel","teruel","hola40", imgteruel,23);
                provincias.add(teruel);
                break;
            case "cataluña":
                // Creamos las provincas de cataluña
                // Las añadimos al arraylist
                Provincias lleida = new Provincias("lleida","lleida","Elevación: 488 m.", imglleida, 24);
                provincias.add(lleida);
                Provincias tarragona = new Provincias("tarragona","tarragona","Universidad: Universidad Rovira i Virgili.", imgtarragona, 27);
                provincias.add(tarragona);
                Provincias barcelona = new Provincias("barcelona","barcelona","Inda Inda Indapendensia", imgbarcelona, 25);
                provincias.add(barcelona);
                Provincias girona = new Provincias("girona","girona","Gentilicio: Gerundense", imggirona, 26);
                provincias.add(girona);
                break;
            case "baleares":
                // Creamos las provincas de baleares
                // Las añadimos al arraylist
                Provincias baleares = new Provincias("baleares","baleares","Islas: Mallorca, Menorca, Ibiza, Formentera, Cabrera.", imgbaleares,48);
                provincias.add(baleares);
                break;
            case "canarias":
                // Creamos las provincas de canarias
                // Las añadimos al arraylist
                Provincias palmas = new Provincias("las palmas","las palmas de gran canaria","Código postal: 35001-35020", imgpalmas,50);
                provincias.add(palmas);
                Provincias santaCruz = new Provincias("santa cruz","santa cruz de tenerife","Alcalde: José Manuel Bermúdez Esparza", imgsantaCruz,49);
                provincias.add(santaCruz);
                break;
        }
    }
    
    /**
     * Numero aleatorio de provincia y comprovamos si es correcta
     * @param nombreProvincia
     * @param numeroProvincia
     * @return 
     */
    public boolean comprobarProvincia(String nombreProvincia, int numeroProvincia){        
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la provincia
            provincia = iterador.next();
                    
            // Compruebo si es igual
            if(numeroProvincia == provincia.getNumero()){
                // Compruebo si es igual
                if(nombreProvincia.equals(provincia.getNombreProvincia())){
                    // Actualizo variable
                    respuestaCorrecta = true;
                }
            }
        }
        
        return respuestaCorrecta;
    }
    
    /**
     * Comprobamos si la respuesta dada por el usuario es correcta
     * @param nombreProvincia
     * @param nombreCapital
     * @return 
     */
    public boolean capitalProvincia(String nombreProvincia, String nombreCapital){        
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la provincia
            provincia = iterador.next();
                    
            // Compruebo coinciden los nombres de las provincias
            if(nombreProvincia.equals(provincia.getNombreProvincia())){
                // Compruebo coinciden los nombres de las capitales
                if(nombreCapital.equals(provincia.getCapitalProvincia())){
                    // Actualizamos variable
                    respuestaCorrecta = true;
                }
            }
        }
        
        return respuestaCorrecta;
    }
    
    /**
     * Cogemos el nombre de la capital de esa provincia
     * @param numero
     * @return 
     */
    public String sacarNombreCapital(int numero){        
        
        // Declaro e inicializo variable
        String respuesta = "";
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras respuesta este vacia
        while(iterador.hasNext() && respuesta.isEmpty()){

            // Actualizo la provincia
            provincia = iterador.next();
                    
            // Compruebo si es igual el numero
            if(numero == provincia.getNumero()){
                // Cogemos la capital 
                respuesta = provincia.getCapitalProvincia();
            }
        }
        
        return respuesta;
    }
    
    /**
     * Sacamos el nombre de la provincia
     * @param numero
     * @return 
     */
    public String sacarNombreProvincia(int numero){        
        
        // Declaro e inicializo variable
        String respuesta = "";
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras respuesta este vacia
        while(iterador.hasNext() && respuesta.isEmpty()){

            // Actualizo la provincia
            provincia = iterador.next();
                    
            // compruebo el numero es igual
            if(numero == provincia.getNumero()){
                // Actualizo la respuesta
                respuesta = provincia.getNombreProvincia();
            }
        }
        
        return respuesta;
    }
    
    /**
     * Comprobamos que la respuesta del usuario es correctas
     * @param nombreProvincia
     * @param nombreCapital
     * @return 
     */
    public boolean comprobarCapital(String nombreProvincia, String nombreCapital){        
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la provincia
            provincia = iterador.next();
            
            // Compruebo coinciden los nombres de las provincias
            if(nombreProvincia.equals(provincia.getNombreProvincia())){
                // Compruebo coinciden los nombres de las capitales
                if(nombreCapital.equals(provincia.getCapitalProvincia())){
                    // Actualizamos variable
                    respuestaCorrecta = true;
                }
            }
        }
        
        return respuestaCorrecta;
    }
    
    /**
     * Comprobamos que la respuesta del usuario es correcta
     * @param nombreProvincia
     * @param nombreCapital
     * @return 
     */
    public boolean capitalNomProvincia(String nombreProvincia, String nombreCapital){        
        
        // Declaro e inicializo variable
        boolean respuestaCorrecta = false;
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras no sea correcta
        while(iterador.hasNext() && !respuestaCorrecta){

            // Actualizo la provincia
            provincia = iterador.next();
            
            // Compruebo coinciden los nombres de las capitales
            if(nombreCapital.equals(provincia.getCapitalProvincia())){
                // Compruebo coinciden los nombres de las provincias
                if(nombreProvincia.equals(provincia.getNombreProvincia())){
                    // Actualizamos variable
                    respuestaCorrecta = true;
                }
            }
        }
        
        return respuestaCorrecta;
    }
    
    /**
     * Sacar el nombre de la provincia
     * @param nombreProvincia
     * @return 
     */
    public String infoNombreProvincia(String nombreProvincia){
    
        // Declaro e inicializo variable
        String respuesta = "";
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras respuesta este vacia
        while(iterador.hasNext() && respuesta.isEmpty()){

            // Actualizo la provincia
            provincia = iterador.next();
                    
            // Compruebo coinciden los nombres de las provincias
            if(nombreProvincia.equals(provincia.getNombreProvincia())){
                // Actualizo la respuesta
                respuesta = provincia.getNombreProvincia();
            }
        }
        
        return respuesta;
    }
    
    /**
     * Sacar la informacion de la provincia
     * @param nombreProvincia
     * @return 
     */
    public String infoInfoProvincia(String nombreProvincia){
    
        // Declaro e inicializo variable
        String respuesta = "";
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Recorro provincias mientras respuesta este vacia
        while(iterador.hasNext() && respuesta.isEmpty()){

            // Actualizo la provincia
            provincia = iterador.next();
                    
            // Compruebo coinciden los nombres de las provincias
            if(nombreProvincia.equals(provincia.getNombreProvincia())){
                // Actualizo la respuesta
                respuesta = provincia.getInformacion();
            }
        }
        
        return respuesta;
    }
    
    /**
     * Sacar las imagenes de la provincia
     * @param nombreProvincia
     * @return 
     */
    public String[] infoImgProvincia(String nombreProvincia){
    
        // Declaro e inicializo variable
        String[] respuesta = null;
        // Declaramos un objeto provincia
        Provincias provincia;
        
        // Declaramos un iterador para recorrer el arraylist
        Iterator<Provincias> iterador = provincias.iterator();
        
        // Actualizo la provincia
        while(iterador.hasNext()){

            // Actualizo el iterador
            provincia = iterador.next();
            
            // Compruebo coinciden los nombres de las provincias
            if(nombreProvincia.equals(provincia.getNombreProvincia()) && respuesta == null){
                
                // Actualizo la respuesta
                respuesta = provincia.getImagenes();
            }
        }
        
        return respuesta;
    }
}
