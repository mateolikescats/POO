import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.reflect.Field;
import javax.imageio.ImageIO;

import MenuPrincipal.VentanaPrincipalActividad4;
import PruebaExcepciones.VentanaExcepciones;
import Vendedor.VentanaVendedor;
import Vendedor.Vendedor;
import CalculosNumericos.VentanaCalculos;
import CalculosNumericos.CalculosNumericos;
import EquipoMaraton.VentanaEquipo;
import EquipoMaraton.EquipoMaratonProgramacion;
import EquipoMaraton.Programador;
import LeerArchivo.VentanaLeerArchivo;

public class ScreenShooter {

    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        File dir = new File("imagenes");
        if (!dir.exists()) dir.mkdir();

        System.out.println("=== Generating all screenshots ===");

        // ---------- 1. Menu Principal ----------
        System.out.println("[1/12] Menu Principal...");
        VentanaPrincipalActividad4 menu = new VentanaPrincipalActividad4();
        saveFrame(menu, "imagenes/1.png", 400, 350);

        // ---------- 2. Excepciones: Clean ----------
        System.out.println("[2/12] Excepciones clean...");
        VentanaExcepciones v1clean = new VentanaExcepciones();
        saveFrame(v1clean, "imagenes/2.png", 450, 400);

        // ---------- 3. Excepciones: After execution ----------
        System.out.println("[3/12] Excepciones executed...");
        VentanaExcepciones v1exec = new VentanaExcepciones();
        java.lang.reflect.Method mRun = VentanaExcepciones.class.getDeclaredMethod("ejecutarPrueba");
        mRun.setAccessible(true);
        mRun.invoke(v1exec);
        saveFrame(v1exec, "imagenes/3.png", 450, 400);

        // ---------- 4. Vendedor: Form filled ----------
        System.out.println("[4/12] Vendedor form...");
        VentanaVendedor v2form = new VentanaVendedor();
        setTextField(v2form, "txtNombre", "Carlos");
        setTextField(v2form, "txtApellidos", "Gómez");
        setTextField(v2form, "txtEdad", "28");
        saveFrame(v2form, "imagenes/4.png", 400, 300);

        // ---------- 5. Vendedor: Success dialog ----------
        System.out.println("[5/12] Vendedor success...");
        VentanaVendedor v2ok = new VentanaVendedor();
        setTextField(v2ok, "txtNombre", "Carlos");
        setTextField(v2ok, "txtApellidos", "Gómez");
        setTextField(v2ok, "txtEdad", "28");
        Vendedor vObj = new Vendedor("Carlos", "Gómez", 28);
        saveFrameWithDialog(v2ok, "imagenes/5.png", 400, 300,
            "Éxito", vObj.toString(), JOptionPane.INFORMATION_MESSAGE);

        // ---------- 6. Vendedor: Error dialog (age < 18) ----------
        System.out.println("[6/12] Vendedor error...");
        VentanaVendedor v2err = new VentanaVendedor();
        setTextField(v2err, "txtNombre", "Juan");
        setTextField(v2err, "txtApellidos", "Pérez");
        setTextField(v2err, "txtEdad", "15");
        saveFrameWithDialog(v2err, "imagenes/6.png", 400, 300,
            "Argumento Ilegal", "El vendedor debe ser mayor de 18 años.", JOptionPane.WARNING_MESSAGE);

        // ---------- 7. Calculos: Successful result ----------
        System.out.println("[7/12] Calculos result...");
        VentanaCalculos v3ok = new VentanaCalculos();
        setTextField(v3ok, "txtValor", "16.0");
        java.lang.reflect.Method mCalc = VentanaCalculos.class.getDeclaredMethod("calcularRaiz");
        mCalc.setAccessible(true);
        mCalc.invoke(v3ok);
        saveFrame(v3ok, "imagenes/7.png", 400, 250);

        // ---------- 8. Calculos: Error for negative ----------
        System.out.println("[8/12] Calculos error...");
        VentanaCalculos v3err = new VentanaCalculos();
        setTextField(v3err, "txtValor", "-5.0");
        saveFrameWithDialog(v3err, "imagenes/8.png", 400, 250,
            "ArithmeticException",
            "El valor debe ser un número positivo para calcular la raíz cuadrada.",
            JOptionPane.ERROR_MESSAGE);

        // ---------- 9. Equipo: With members ----------
        System.out.println("[9/12] Equipo members...");
        VentanaEquipo v4ok = new VentanaEquipo();
        setTextField(v4ok, "txtNomEquipo", "CodeCats");
        setTextField(v4ok, "txtUniversidad", "UNAL");
        setTextField(v4ok, "txtLenguaje", "Java");
        Field fEquipo = VentanaEquipo.class.getDeclaredField("equipo");
        fEquipo.setAccessible(true);
        EquipoMaratonProgramacion eqObj = new EquipoMaratonProgramacion("CodeCats", "UNAL", "Java");
        fEquipo.set(v4ok, eqObj);
        setButtonEnabled(v4ok, "btnAnadirProg", true);
        setButtonEnabled(v4ok, "btnCrearEquipo", false);
        ((JTextField)getField(v4ok, "txtNomEquipo")).setEditable(false);
        ((JTextField)getField(v4ok, "txtUniversidad")).setEditable(false);
        ((JTextField)getField(v4ok, "txtLenguaje")).setEditable(false);
        Programador p1 = new Programador("Mateo", "Quiceno");
        Programador p2 = new Programador("Juan", "Pérez");
        eqObj.añadir(p1); eqObj.añadir(p2);
        DefaultListModel<String> model = (DefaultListModel<String>) getField(v4ok, "modeloLista");
        model.addElement(p1.toString());
        model.addElement(p2.toString());
        saveFrame(v4ok, "imagenes/9.png", 550, 450);

        // ---------- 10. Equipo: Validation error (digits in name) ----------
        System.out.println("[10/12] Equipo validation error...");
        VentanaEquipo v4err = new VentanaEquipo();
        setTextField(v4err, "txtNomEquipo", "CodeCats");
        setTextField(v4err, "txtUniversidad", "UNAL");
        setTextField(v4err, "txtLenguaje", "Java");
        fEquipo.set(v4err, new EquipoMaratonProgramacion("CodeCats", "UNAL", "Java"));
        setButtonEnabled(v4err, "btnAnadirProg", true);
        setButtonEnabled(v4err, "btnCrearEquipo", false);
        setTextField(v4err, "txtNomProg", "Carlos123");
        setTextField(v4err, "txtApeProg", "López");
        saveFrameWithDialog(v4err, "imagenes/10.png", 550, 450,
            "Error de Validación",
            "El nombre o apellido no puede tener dígitos.",
            JOptionPane.WARNING_MESSAGE);

        // ---------- 11. LeerArchivo: File loaded ----------
        System.out.println("[11/12] LeerArchivo loaded...");
        VentanaLeerArchivo v5ok = new VentanaLeerArchivo();
        JTextArea area = (JTextArea) getField(v5ok, "areaTexto");
        area.setText("Línea 1: Archivo de prueba para la Actividad 4.\n" +
                     "Línea 2: Leyendo contenido con FileInputStream.\n" +
                     "Línea 3: Conversión con InputStreamReader.\n" +
                     "Línea 4: Lectura con BufferedReader.readLine().\n" +
                     "Línea 5: Excepciones IO capturadas exitosamente.");
        saveFrame(v5ok, "imagenes/11.png", 500, 400);

        // ---------- 12. LeerArchivo: IO Error ----------
        System.out.println("[12/12] LeerArchivo IO error...");
        VentanaLeerArchivo v5err = new VentanaLeerArchivo();
        saveFrameWithDialog(v5err, "imagenes/12.png", 500, 400,
            "IOException",
            "No se pudo leer el archivo:\nC:\\ruta\\inexistente.txt (El sistema no puede encontrar el archivo)",
            JOptionPane.ERROR_MESSAGE);

        System.out.println("=== All 12 screenshots generated! ===");
        System.exit(0);
    }

    // --- Helpers ---

    static void setTextField(Object obj, String fieldName, String value) throws Exception {
        Field f = obj.getClass().getDeclaredField(fieldName);
        f.setAccessible(true);
        ((JTextField)f.get(obj)).setText(value);
    }

    static Object getField(Object obj, String fieldName) throws Exception {
        Field f = obj.getClass().getDeclaredField(fieldName);
        f.setAccessible(true);
        return f.get(obj);
    }

    static void setButtonEnabled(Object obj, String fieldName, boolean enabled) throws Exception {
        Field f = obj.getClass().getDeclaredField(fieldName);
        f.setAccessible(true);
        ((JButton)f.get(obj)).setEnabled(enabled);
    }

    static void saveFrame(JFrame frame, String path, int w, int h) throws Exception {
        frame.setSize(w, h);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Thread.sleep(500); // Wait for window to fully render on screen

        Robot robot = new Robot();
        Rectangle bounds = new Rectangle(frame.getLocationOnScreen(), frame.getSize());
        BufferedImage img = robot.createScreenCapture(bounds);

        frame.setVisible(false);
        frame.dispose();
        ImageIO.write(img, "PNG", new File(path));
    }

    static void saveFrameWithDialog(JFrame frame, String path, int fw, int fh,
                                     String title, String message, int msgType) throws Exception {
        frame.setSize(fw, fh);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Thread.sleep(400);

        // Show dialog without blocking the thread
        JOptionPane pane = new JOptionPane(message, msgType);
        JDialog dialog = pane.createDialog(frame, title);
        dialog.setModal(false);
        dialog.setVisible(true);

        Thread.sleep(500); // Wait for dialog to fully appear on screen

        Robot robot = new Robot();
        Rectangle bounds = new Rectangle(frame.getLocationOnScreen(), frame.getSize());
        BufferedImage img = robot.createScreenCapture(bounds);

        dialog.dispose();
        frame.setVisible(false);
        frame.dispose();

        ImageIO.write(img, "PNG", new File(path));
    }
}
