import javax.swing.JOptionPane;
public class Ejercicio2 {
    public static void main(String[] args) {
        //entrada
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos estudiantes hay?"));
        double[] notas = new double[n];
        double suma = 0;
        //proceso
        for (int i = 0; i < n; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del estudiante " + (i + 1) + ":"));
            suma += notas[i];
        }
        double promedio = suma / n;
        String estado;
        if (promedio >= 3.0) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
        //salida
        JOptionPane.showMessageDialog(null, "Promedio del curso: " + promedio + "\nEstado: " + estado);
    }
}


