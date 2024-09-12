import util.StringUtil;

import java.util.Arrays;

public class MainString {
    public static void main(String[] args) {
        String originalText = "   Java is powerful!   ";
        System.out.println("Número caracteres: " + StringUtil.nroCaracteres(originalText));
        System.out.println("Repetir cinco veces: " + StringUtil.repetirTexto(originalText, 5));
        //originalText = StringUtil.repetirTexto(originalText, 5);
        System.out.println(originalText);
        String textos[] = StringUtil.dividirTexto(originalText, "Java");
        for (int i = 0; i < textos.length; i++) {
            System.out.println(textos[i]);
        }
        //System.out.println("Dividir texto: " + Arrays.toString(StringUtil.dividirTexto(originalText, "Java")));

        System.out.println(StringUtil.removerEspacios(originalText));

        System.out.println(StringUtil.miMetodoParaRemoverEspacios(originalText));


    }
}
