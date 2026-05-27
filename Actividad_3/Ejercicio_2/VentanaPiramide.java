package Ejercicio_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie, imagen;
    private JTextField campoBase, campoAltura, campoApotema;
    private JButton calcular;

    public VentanaPiramide() {
        inicio();
        setTitle("Pirámide");
        setSize(280, 400);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        base = new JLabel("Base (cms):");
        base.setBounds(20, 20, 135, 23);
        campoBase = new JTextField();
        campoBase.setBounds(120, 20, 135, 23);

        altura = new JLabel("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);
        campoAltura = new JTextField();
        campoAltura.setBounds(120, 50, 135, 23);

        apotema = new JLabel("Apotema (cms):");
        apotema.setBounds(20, 80, 135, 23);
        campoApotema = new JTextField();
        campoApotema.setBounds(120, 80, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 110, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 140, 200, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 170, 200, 23);

        // Imagen (propuesto)
        ImageIcon iconoOriginal = new ImageIcon("Actividad_3/Ejercicio_2/piramide.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imagen = new JLabel(new ImageIcon(imagenEscalada));
        imagen.setBounds(80, 210, 120, 120);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(apotema);
        contenedor.add(campoApotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(imagen);
    }

    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double b = 0;
        double a = 0;
        double ap = 0;
        try {
            b = Double.parseDouble(campoBase.getText());
            a = Double.parseDouble(campoAltura.getText());
            ap = Double.parseDouble(campoApotema.getText());
            Piramide piramide = new Piramide(b, a, ap);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", piramide.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", piramide.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
