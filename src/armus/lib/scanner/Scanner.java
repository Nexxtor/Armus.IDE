package armus.lib.scanner;

public class Scanner {
    static {
        System.load("/opt/armus/lib/libArmus.Lib.so");
    }
    public native String[] lsFiles(String pathFirstFile);
    public native String[] lsTokens(String[] allFiles);
}
