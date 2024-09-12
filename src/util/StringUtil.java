package util;

public final class StringUtil {
    public static int nroCaracteres(String texto) {
        return texto.length(); // tamaño del texto
    }

    public static String repetirTexto(String texto, int nroRepeticiones) {
        return texto.repeat(nroRepeticiones);
    }

    public static String[] dividirTexto(String texto, String criterio) {
        return texto.split(criterio);
    }

    public static String removerEspacios(String texto) {
        return texto.stripTrailing();
    }

    public static String miMetodoParaRemoverEspacios(String texto) {
        String nuevoTexto = "";
        for (int i = 0; i < texto.length(); i++) {
            if(texto.charAt(i) != ' ') {
                nuevoTexto += texto.charAt(i);
            }
        }
        return nuevoTexto;
    }
}
