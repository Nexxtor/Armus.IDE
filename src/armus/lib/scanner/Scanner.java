package armus.lib.scanner;

public class Scanner {
    static {
        System.load("/home/nextor/NetBeansProjects/Armus.Lib/dist/libArmus.Lib.so");
    }
    public native String[] lsFiles(String pathFirstFile);
    public native String[] lsTokens(String[] allFiles);
}
