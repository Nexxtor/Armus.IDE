package armus.ide;

import armus.ide.gui.IDE_Armus;
import armus.lib.scanner.Scanner;
import armus.lib.parser.Parser;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ProyectoArmus {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        //Cambiar apariencia al sistema operativo actual
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            System.out.println(e.getMessage());
        } //Fin cambiar apariencia

        IDE_Armus ventana = new IDE_Armus();
        ventana.setVisible(true);
    }
}
