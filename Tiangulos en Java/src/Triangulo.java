import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Triangulo extends JFrame implements ActionListener {
    private JTextField ladoA;
    private JTextField ladoB;
    private JTextField ladoC;
    private JLabel mensaje;

    public Triangulo() {
        super("Comprobar triángulo");

        // Configuración del panel principal
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Campos para ingresar las longitudes de los lados
        JLabel labelA = new JLabel("Lado A:");
        ladoA = new JTextField();
        JLabel labelB = new JLabel("Lado B:");
        ladoB = new JTextField();
        JLabel labelC = new JLabel("Lado C:");
        ladoC = new JTextField();

        panel.add(labelA);
        panel.add(ladoA);
        panel.add(labelB);
        panel.add(ladoB);
        panel.add(labelC);
        panel.add(ladoC);

        // Botón para comprobar si se puede formar un triángulo
        JButton boton = new JButton("Comprobar");
        boton.addActionListener(this);
        panel.add(new JLabel(""));
        panel.add(boton);

        // Mensaje de resultado
        mensaje = new JLabel("");
        mensaje.setHorizontalAlignment(JLabel.CENTER);
        mensaje.setVerticalAlignment(JLabel.TOP);
        mensaje.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        panel.add(mensaje);

        // Configuración de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel);
        pack();
        setSize(400, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // Método que se llama cuando se hace clic en el botón "Comprobar"
    public void actionPerformed(ActionEvent evento) {
        // Se obtienen las longitudes de los lados
        double a = Double.parseDouble(ladoA.getText());
        double b = Double.parseDouble(ladoB.getText());
        double c = Double.parseDouble(ladoC.getText());

        // Se comprueba si se puede formar un triángulo
        if (a + b > c && a + c > b && b + c > a) {
            // Si se puede formar un triángulo, se determina su tipo
            if (a == b && b == c) {
                mensaje.setText("<html>Se puede formar un triángulo equilátero.</html>");
            } else if (a == b || a == c || b == c) {
                mensaje.setText("<html>Se puede formar un triángulo isósceles.</html>");
            } else {
                mensaje.setText("<html>Se puede formar un triángulo escaleno.</html>");
            }
        } else {
            // Si no se puede formar un triángulo, se muestra un mensaje de error
            mensaje.setText("<html>No se puede formar un triángulo con los lados ingresados.</html>");
        }
    }

    public static void main(String[] args) {
        // Se crea una instancia de la clase Triangulo
        Triangulo triangulo = new Triangulo();
    }
}
