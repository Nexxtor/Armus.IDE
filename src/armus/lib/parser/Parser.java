/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armus.lib.parser;

/**
 *
 * @author nextor
 */
public class Parser {
    static {
        System.load("/opt/armus/lib/libArmus.Lib.so");
    }
    
    /**
     *  Analiza la sintaxis de un proyecto o archivo en lenguaje 
     *  armus
     * @param lsFiles lista de archivos que se desea analizar la sintaxis
     * @return null si no exite ni un error, String[] Si posee errores.  
     * 
     */
    public native String[] run(String[] lsFiles);
}
