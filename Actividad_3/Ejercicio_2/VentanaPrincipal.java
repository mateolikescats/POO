package Ejercicio_2;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
    private Container contenedor;
    private JButton cilindro, esfera, piramide, cubo, prisma;

    public VentanaPrincipal(){
        inicio();
        setTitle("Figuras");
        setSize(350, 160);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);

        cilindro = new JButton("Cilindro");
        cilindro.setBounds(20, 30, 90, 23);
        cilindro.addActionListener(this);

        esfera = new JButton("Esfera");
        esfera.setBounds(120, 30, 90, 23);
        esfera.addActionListener(this);

        piramide = new JButton("Pirámide");
        piramide.setBounds(220, 30, 90, 23);
        piramide.addActionListener(this);
        
        cubo = new JButton("Cubo");
        cubo.setBounds(60, 80, 90, 23);
        cubo.addActionListener(this);
        
        prisma = new JButton("Prisma");
        prisma.setBounds(170, 80, 90, 23);
        prisma.addActionListener(this);

        contenedor.add(cilindro);
        contenedor.add(esfera);
        contenedor.add(piramide);
        contenedor.add(cubo);
        contenedor.add(prisma);
    }

    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == esfera) {
            VentanaEsfera ventanaEsfera = new VentanaEsfera();
            ventanaEsfera.setVisible(true);
        }
        if (evento.getSource() == cilindro) {
            VentanaCilindro ventanaCilindro = new VentanaCilindro();
            ventanaCilindro.setVisible(true);
        }
        if (evento.getSource() == piramide) {
            VentanaPiramide ventanaPiramide = new VentanaPiramide();
            ventanaPiramide.setVisible(true);
        }
        if (evento.getSource() == cubo) {
            VentanaCubo ventanaCubo = new VentanaCubo();
            ventanaCubo.setVisible(true);
        }
        if (evento.getSource() == prisma) {
            VentanaPrisma ventanaPrisma = new VentanaPrisma();
            ventanaPrisma.setVisible(true);
        }
    }
}
