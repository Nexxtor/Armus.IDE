/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armus.ide.utilites;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author stefa_000
 */
public class manejoArchivos {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public static void crear(){
        String nombreArchivo = "hola.txt";
        String ruta = "C:\\Users\\stefa_000\\Documents\\NetBeansProjects\\ProyectoArmus\\";
        
        File archivo = new File(ruta+nombreArchivo);
        
        if(archivo.exists()){
            JOptionPane.showMessageDialog(null, "El archivo ya existe :'(");
        }else{
            try{
                if(archivo.createNewFile()){
                   JOptionPane.showMessageDialog(null, "Archivo creado");
                }else{
                    JOptionPane.showMessageDialog(null, "Archivo no creado");
                }
            }catch(IOException ex){
                Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public String abrirTexto(File archivo){ 
        String contenido="";
        try{
            entrada = new FileInputStream(archivo);
            int numAscci;
            while((numAscci = entrada.read()) != -1){ //va a devolver -1 cuando llegue al final
                char caracter = (char)numAscci;
                contenido += caracter;
            }
        } catch (Exception e){
            
        }
        return contenido;
    }
    
    public String guardarTexto(File archivo, String contenido){ 
        String respuesta =null;
        try{
            salida = new FileOutputStream(archivo);
            byte[] bytesText = contenido.getBytes(); //el contenido lo estamos pasando a un arreglo de bytes
            salida.write(bytesText);
            respuesta = "Se guardo el archivo de texto";
        }catch(Exception e){
            
        }
        return respuesta;
    }
    
    
    public String guardarSencillo(String rutita, String Contenido){
        String respuesta =null;
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(rutita));
             bw.write(Contenido);
             bw.close();
             respuesta = "Se guardo el archivo de texto";
        } catch (IOException ex) {
            Logger.getLogger(manejoArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return respuesta;
    }
    
    
    
}
