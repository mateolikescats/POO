package Ejercicio_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrisma extends JFrame implements ActionListener {
    private Container contenedor;
    private JLabel base, altura, profundidad, volumen, superficie, imagen;
    private JTextField campoBase, campoAltura, campoProfundidad;
    private JButton calcular;

    public VentanaPrisma() {
        inicio();
        setTitle("Prisma Rectangular");
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

        profundidad = new JLabel("Profund. (cms):");
        profundidad.setBounds(20, 80, 135, 23);
        campoProfundidad = new JTextField();
        campoProfundidad.setBounds(120, 80, 135, 23);

        calcular = new JButton("Calcular");
        calcular.setBounds(120, 110, 135, 23);
        calcular.addActionListener(this);

        volumen = new JLabel("Volumen (cm3):");
        volumen.setBounds(20, 140, 200, 23);

        superficie = new JLabel("Superficie (cm2):");
        superficie.setBounds(20, 170, 200, 23);

        // Imagen (propuesto)
        ImageIcon iconoOriginal = new ImageIcon("Actividad_3/Ejercicio_2/prisma.png");
        Image imagenEscalada = iconoOriginal.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        imagen = new JLabel(new ImageIcon(imagenEscalada));
        imagen.setBounds(80, 210, 120, 120);

        contenedor.add(base);
        contenedor.add(campoBase);
        contenedor.add(altura);
        contenedor.add(campoAltura);
        contenedor.add(profundidad);
        contenedor.add(campoProfundidad);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
        contenedor.add(imagen);
    }

    public void actionPerformed(ActionEvent event) {
        boolean error = false;
        double b = 0, a = 0, p = 0;
        try {
            b = Double.parseDouble(campoBase.getText());
            a = Double.parseDouble(campoAltura.getText());
            p = Double.parseDouble(campoProfundidad.getText());
            Prisma prisma = new Prisma(b, a, p);
            volumen.setText("Volumen (cm3): " + String.format("%.2f", prisma.calcularVolumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f", prisma.calcularSuperficie()));
        } catch (Exception e) {
            error = true;
        } finally {
            if (error) {
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
