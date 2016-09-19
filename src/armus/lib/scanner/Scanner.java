/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armus.lib.scanner;

/**
 *
 * @author root
 */
public class Scanner {
    static {
        System.load("/home/nextor/NetBeansProjects/Armus.Lib/dist/libArmus.Lib.so");
    }
    public native String[] lsFiles(String pathFirstFile);
    public native String[] lsTokens(String pathSecondFile);
}
