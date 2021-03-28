/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Mapa;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author fp
 */
public class Controlador {
    
    // Objeto de tipo Mapa
    private static Mapa espana;
    
    // Constructor
    public static void iniciarPrograma(){
        // Inicializamos el objeto
        espana = new Mapa("España");
        
        // Llamamos al metodo que rellena el programa
        espana.rellenarPrograma();
    }
    
    /**
     * Hacemos el random de la provincia
     * @param lblNumeroRandom 
     */
    public static void randomProvincia(JLabel lblNumeroRandom){
        // Declaro e inicalizo un objeto random
        Random r = new Random();
        // Declaro variable
        int numeroProvincia;
        
        // Genero un numero random
        numeroProvincia = r.nextInt(50)+1;
        
        // Coloco el random en la etiqueta
        lblNumeroRandom.setText(String.valueOf(numeroProvincia));
    }
    
    /**
     * Hacemos el random de la comunidad
     * @param lblNumeroRandom 
     */
    public static void randomComunidad(JLabel lblNumeroRandom){
        // Declaro e inicalizo un objeto random
        Random r = new Random();
        // Declaro variable
        int numeroComunidad;
        
        // Genero un numero random
        numeroComunidad = r.nextInt(16)+1;
        
        // Coloco el random en la etiqueta
        lblNumeroRandom.setText(String.valueOf(numeroComunidad));
    }
    
    /**
     * Genero un nombre de provinca random
     * @param lblNombreProvincia 
     */
    public static void randomNombreProvincia(JLabel lblNombreProvincia){
        // Declaro e inicalizo un objeto random
        Random r = new Random();
        // Declaro variable
        int numeroProvincia;
        
        // Genero un numero random
        numeroProvincia = r.nextInt(50)+1;
        
        // Coloco el nombre random de la provincia
        lblNombreProvincia.setText(espana.nombreProvincia(numeroProvincia));
    }
    
    /**
     * Genero un nombre de capital random
     * @param lblNombreCapital 
     */
    public static void randomNombreCapital(JLabel lblNombreCapital){
        // Declaro e inicalizo un objeto random
        Random r = new Random();
        // Declaro variable
        int numeroProvincia;
        
        // Genero un numero random
        numeroProvincia = r.nextInt(50)+1;

        // Coloco el nombre random de la capital
        lblNombreCapital.setText(espana.nombreCapital(numeroProvincia));
    }
    
    /**
     * Preguntamos la provincia aleatoriamente
     * @param txtProvinciaPorUser
     * @param lblNumeroRandom
     * @param dialogoProvincia 
     */
    public static void preguntarProvincia(JTextField txtProvinciaPorUser, JLabel lblNumeroRandom 
            , JDialog dialogoProvincia){
        
        // Declaro variables
        String respuestaUser;
        int numeroRandom;
        boolean respuestaFinal;
        
        // Inicializo variables
        respuestaUser = txtProvinciaPorUser.getText().toLowerCase();
        numeroRandom = Integer.parseInt(lblNumeroRandom.getText());
        respuestaFinal = espana.respuestaProvincia(respuestaUser, numeroRandom); 
        
        // Si la respuesta es correcta
        if(respuestaFinal){
            // Mensaje de acierto
            JOptionPane.showMessageDialog(null, "Muy bien, has acertado. ");
            // Cierro la ventana
            dialogoProvincia.dispose();
        }else{
            // Mensaje de error
            JOptionPane.showMessageDialog(null, "Ohhh... No has acertado, venga intentalo otra vez! ");
        }
    }
    
    /**
     * Preguntamos la comunidad aleatoriamente
     * @param txtResponderComunidad
     * @param lblNumeroRandom
     * @param dialogoComunidad 
     */
    public static void preguntarComunidad(JTextField txtResponderComunidad, JLabel lblNumeroRandom 
            , JDialog dialogoComunidad){
        
        // Declaro variables
        String respuestaUser;
        int numeroRandom;
        boolean respuestaFinal;
        
        // Inicializo variables
        respuestaUser = txtResponderComunidad.getText().toLowerCase();
        numeroRandom = Integer.parseInt(lblNumeroRandom.getText());
        respuestaFinal = espana.respuestaComunidad(respuestaUser, numeroRandom); 
        
        // Si la respuesta es correcta
        if(respuestaFinal){
            // Mensaje de acierto
            JOptionPane.showMessageDialog(null, "Muy bien, has acertado. ");
            // Cierro la ventana
            dialogoComunidad.dispose();
        }else{
            // Mensaje de error
            JOptionPane.showMessageDialog(null, "Ohhh... No has acertado, venga intentalo otra vez! ");
        }
    }
    
    /**
     * Preguntamos la provinca por el nombre de capital
     * @param txtResponderProvincia
     * @param lblNomCapital
     * @param dialogoProvinciaCapital 
     */
    public static void preguntarNomProvincia(JTextField txtResponderProvincia, JLabel lblNomCapital
            , JDialog dialogoProvinciaCapital){
        
        // Declaro variables
        String respuestaUser;
        String capital;
        boolean respuestaFinal;
        
        // Inicializo variables
        respuestaUser = txtResponderProvincia.getText().toLowerCase();
        capital = lblNomCapital.getText();
        respuestaFinal = espana.respuestaNomProvincia(respuestaUser, capital); 
        
        // Si la respuesta es correcta
        if(respuestaFinal){
            // Mensaje de acierto
            JOptionPane.showMessageDialog(null, "Muy bien, has acertado. ");
            // Cierro la ventana
            dialogoProvinciaCapital.dispose();
        }else{
            // Mensaje de error
            JOptionPane.showMessageDialog(null, "Ohhh... No has acertado, venga intentalo otra vez! ");
        }
    }
    
    /**
     * Preguntamos la capital por el nombre de provinca
     * @param txtResponderCapital
     * @param lblNomProvincia
     * @param dialogoCapitalProvincia 
     */
    public static void preguntarCapital(JTextField txtResponderCapital, JLabel lblNomProvincia 
            , JDialog dialogoCapitalProvincia){
        
        // Declaro variables
        String respuestaUser;
        String provincia;
        boolean respuestaFinal;
        
        // Inicializo variables
        respuestaUser = txtResponderCapital.getText().toLowerCase();
        provincia = lblNomProvincia.getText();
        respuestaFinal = espana.respuestaCapital(respuestaUser, provincia); 
        
        // Si la respuesta es correcta
        if(respuestaFinal){
            // Mensaje de acierto
            JOptionPane.showMessageDialog(null, "Muy bien, has acertado. ");
            // Cierro la ventana
            dialogoCapitalProvincia.dispose();
        }else{
            // Mensaje de error
            JOptionPane.showMessageDialog(null, "Ohhh... No has acertado, venga intentalo otra vez! ");
        }
    }
    
    /**
     * Sacamos informacion de la provincia
     * @param txtProvincia
     * @param lblNombreProvincia
     * @param lblInformacion
     * @param lblImg1
     * @param lblImg2
     * @param lblImg3 
     */
    public static void informacionProvincia(JTextField txtProvincia, JLabel lblNombreProvincia
            , JLabel lblInformacion, JLabel lblImg1, JLabel lblImg2, JLabel lblImg3){
        try{
            // Declaro variables
            String nombreProvincia;
            String imgs[];

            // Inicializo variables
            nombreProvincia = txtProvincia.getText();

            // Ponemos los datos
            lblNombreProvincia.setText(espana.conseguirNombre(nombreProvincia.toLowerCase()));
            lblInformacion.setText(espana.conseguirInfo(nombreProvincia.toLowerCase()));
            
            // Cargamos las imagenes
            imgs = espana.conseguirImg(nombreProvincia.toLowerCase());

            // Colocamos la imagen 1 en el label
            ImageIcon imagen1 = new ImageIcon("img/"+imgs[0]);
            imagen1 = new ImageIcon(imagen1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            lblImg1.setIcon(imagen1);

            // Colocamos la imagen 1 en el label
            ImageIcon imagen2 = new ImageIcon("img/"+imgs[1]);
            imagen2 = new ImageIcon(imagen2.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            lblImg2.setIcon(imagen2);

            // Colocamos la imagen 1 en el label
            ImageIcon imagen3 = new ImageIcon("img/"+imgs[2]);
            imagen3 = new ImageIcon(imagen3.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            lblImg3.setIcon(imagen3);
        }catch(NullPointerException e){
            // Mensaje de error
            JOptionPane.showMessageDialog(null, "No existe esta provincia.");
        }
    }
}
