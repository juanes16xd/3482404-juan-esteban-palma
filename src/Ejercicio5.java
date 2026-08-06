import javax.swing.JOptionPane;
public class Ejercicio5 {
    public static void main(String[] args) {
        //entrada
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿cuantos números va a ingresar:"));
        int[] numeros = new int[n];
        String posiciones = "";
        boolean encontrado = false;
        //proceso
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("ingrese los números:" + (i +1)));
        }
        int buscar = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número a buscar:"));
        for( int p = 0; p < numeros.length; p++) {
            if(numeros[p] == buscar) {
                posiciones += "posicion" +p+ "\n";
                encontrado = true;
            }
        }
        //salida
        if(encontrado) {
            JOptionPane.showMessageDialog(null, "número encontrado en la posición: \n" + posiciones);
        }else{
            JOptionPane.showMessageDialog(null, "número no encontrado:");
        }
    }
}

