package armus.lib.parser;

public class Parser {
    static {
        System.load("/opt/armus/lib/libArmus.Lib.so");
    }
    
    /**
     * Analiza la sintaxis de un proyecto o archivo en lenguaje Armus
     * @param lsFiles lista de archivos que se desea analizar la sintaxis
     * @return null si no exite ni un error, String[] Si posee errores.  
     */
    public native String[] run(String[] lsFiles);
}
