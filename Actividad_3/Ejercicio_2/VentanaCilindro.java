package Ejercicio_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCilindro extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel radio, altura, volumen, superficie, imagen;
    private JTextField campoRadio, campoAltura;
    private JButton calcular;

    public VentanaCilindro() {
        inicio();
        setTitle("Cilindro");
        setSize(280, 360);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        radio = new JLabel("Radio (cms):");
        radio.setBounds(20, 20, 135, 23);
        campoRadio = new JTextField();
        campoRadio.setBounds(100, 20, 135, 23);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(100, 50, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(100, 80, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 110, 200, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 140, 200, 23);

        // Imagen (propuesto)
        ImageIcon iconoOriginal = new ImageIcon("Actividad_3/Ejercicio_2/cilindro.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imagen = new JLabel(new ImageIcon(imagenEscalada));
        imagen.setBounds(80, 180, 120, 120);

        contenedor.add(radio);
        contenedor.add(campoRadio);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(imagen);
    }

    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double r = 0;
        double a = 0;
        try {
            r = Double.parseDouble(campoRadio.getText());
            a = Double.parseDouble(campoAltura.getText());
            Cilindro cilindro = new Cilindro(r, a);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", cilindro.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", cilindro.calcularSuperficie()));
        } catch (Exception e){
            error = true;
        } finally {
            if(error) {
                JOptionPane.showMessageDialog(null,"Campo nulo o error en formato de número","Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
