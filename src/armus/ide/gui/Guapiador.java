package armus.ide.gui;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class Guapiador extends DefaultStyledDocument {

    final StyleContext cont = StyleContext.getDefaultStyleContext();
    final AttributeSet attr = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLUE);
    final AttributeSet attrComentarios = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.GRAY);
    final SimpleAttributeSet sas = new SimpleAttributeSet();
    final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);

    public void setStyle() {
        StyleConstants.setBold(sas, true);
    }

    @Override
    public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offset, str, a);

        String text = getText(0, getLength());
        int before = findLastNonWordChar(text, offset);
        if (before < 0) {
            before = 0;
        }
        int after = findFirstNonWordChar(text, offset + str.length());
        int wordL = before;
        int wordR = before;

        while (wordR <= after) {
            if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                if (text.substring(wordL, wordR).matches("(\\W)*(entero|byte|real|vacio|booleano|cadena|caracter|Objeto|Archivo|si|sino|probar|caso|defecto|romper|mientras|para|hacer|para_cada|Sistema|obtenerEntero|obtenerReal|\n"
                        + "obtenerCadena|obtenerCaracter|mostrar|publica|privada|retornar|Arreglo|agregar|obtener|cuantos|quitar|abrir|leerLinea|volcado|cerrar|concatenar|parteEntera|comparar"
                        + "mayor|menor|esPar|decimalBin|pontencia|absoluto|modulo|longitudCadena|clase|incluir|verdadero|falso|obtenerBooleano)")) {
                    //  setCharacterAttributes(wordL, wordR - wordL, sas, false);
                    setCharacterAttributes(wordL, wordR - wordL, attr, false);
                } else {

                    setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);

                }

                wordL = wordR;
            }
            wordR++;
        }


        Pattern pattern = Pattern.compile("(/\\*(?:.|[\\n\\r])*?\\*/)|((?:/\\*(?:[^*]|(?:\\*+[^*/]))*\\*+/)|(?://.*))");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            //System.out.println("OK " + matcher.group());
            setCharacterAttributes(matcher.start(), matcher.end() - matcher.start() ,attrComentarios, false);

        }
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        super.remove(offs, len);

        
        String text = getText(0, getLength());
        int before = findLastNonWordChar(text, offs);
        if (before < 0) {
            before = 0;
        }
        int after = findFirstNonWordChar(text, offs);
        if (text.substring(before, after).matches("(\\W)*(entero|byte|real|vacio|booleano|cadena|caracter|Objeto|Archivo|si|sino|probar|caso|defecto|romper|mientras|para|hacer|para_cada|Sistema|obtenerEntero|obtenerReal|\n"
                + "obtenerCadena|obtenerCaracter|mostrar|publica|privada|retornar|Arreglo|agregar|obtener|cuantos|quitar|abrir|leerLinea|volcado|cerrar|concatenar|parteEntera|comparar"
                + "mayor|menor|esPar|decimalBin|pontencia|absoluto|modulo|longitudCadena|clase|incluir|verdadero|falso|obtenerBooleano)")) {
            setCharacterAttributes(before, after - before, sas, false);
            setCharacterAttributes(before, after - before, attr, false);
        } else {
             setCharacterAttributes(before, after - before, attrBlack, false);
        }
    }

    private int findLastNonWordChar(String text, int index) {
        while (--index >= 0) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
        }
        return index;
    }

    private int findFirstNonWordChar(String text, int index) {
        while (index < text.length()) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
            index++;
        }
        return index;
    }
}
