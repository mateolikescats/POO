package Ejercicio_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCubo extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel lado, volumen, superficie, imagen;
    private JTextField campoLado;
    private JButton calcular;

    public VentanaCubo() {
        inicio();
        setTitle("Cubo");
        setSize(280, 320);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        lado = new JLabel("Lado (cms):");
        lado.setBounds(20, 20, 135, 23);
        campoLado = new JTextField();
        campoLado.setBounds(100, 20, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(100, 50, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 90, 200, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 120, 200, 23);

        // Imagen (propuesto)
        ImageIcon iconoOriginal = new ImageIcon("Actividad_3/Ejercicio_2/cubo.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imagen = new JLabel(new ImageIcon(imagenEscalada));
        imagen.setBounds(80, 150, 120, 120);

        contenedor.add(lado);
        contenedor.add(campoLado);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(imagen);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == calcular) {
            boolean error = false;
            try {
                double l = Double.parseDouble(campoLado.getText());
                Cubo cubo = new Cubo(l);
                volumen.setText("Volumen (cm3): " + String.format("%.2f", cubo.calcularVolumen()));
                superficie.setText("Superficie (cm2): " + String.format("%.2f", cubo.calcularSuperficie()));
            } catch (Exception e) {
                error = true;
            } finally {
                if(error) {
                    JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de número","Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}
