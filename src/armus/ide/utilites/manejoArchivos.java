package armus.ide.utilites;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class manejoArchivos {
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;

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