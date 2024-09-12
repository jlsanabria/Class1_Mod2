import javax.swing.*;
import java.awt.*;

public class DatosFormulario {
    public static void main(String[] args) {
        JFrame ventana = new JFrame(); // Java Swing, antes AWT -> Gráficos en Java
        ventana.setTitle("Test Wrapper :) ");
        ventana.setSize(500, 500);
        ventana.getContentPane().setLayout(new FlowLayout());

        JLabel numero1 = new JLabel("Numero 1: ");
        //numero1.setBounds(10, 10, 100, 20);
        JLabel numero2 = new JLabel("Numero 2: ");
        JLabel numero3 = new JLabel("Numero 3 (Float): ");

        JTextField text1 = new JTextField(10);
        JTextField text2 = new JTextField(10);
        JTextField text3 = new JTextField(10);

        JButton button1 = new JButton("Ingresar");
        button1.addActionListener(e -> {
            System.out.println("Numero 1: " + text1.getText());
            System.out.println("Numero 2: " + text2.getText());
            System.out.println("Numero 3: " + text3.getText());
            System.out.println("Resultado: " + (Integer.parseInt(text1.getText()) + Integer.parseInt(text2.getText())));
            System.out.println("Multi: " + (Float.parseFloat(text3.getText()) * Math.PI));
        });

        ventana.add(numero1);
        ventana.add(text1);
        ventana.add(numero2);
        ventana.add(text2);
        ventana.add(numero3);
        ventana.add(text3);
        ventana.add(button1);

        //ventana.setExtendedState(JFrame.MAXIMIZED_BOTH);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         * Agregar tres campos de texto más (1er -> Double, 2do --> Long, 3er --> Character)
         *
         * Layout en Java Swing
         */

        //========================================================================
        String plantilla = "============   MENÚ ============= " +
                "\n1. Películas Favoritas" +
                "\n2. Juegos Favoritos" +
                "\n3. Jugadores Favoritos" +
                "\n4. Música Favorita";

        System.out.println(plantilla);

        String texto = new String("Java Full Stack");
        String mensaje = "Java Full Stack";
        System.out.println(texto);
        System.out.println(mensaje);



    }
}
