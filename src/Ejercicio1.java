import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
        //entrada
        int pares = 0;
        int impares = 0;
        int limite = 0;
        int numeros = Integer.parseInt(JOptionPane.showInputDialog("¿cuantos números va a ingresar?"));
        int[] guardar = new int[numeros];
        //proceso
        for(int i = 0; i < guardar.length; i++) {
            if(i  % 2 == 0) {
                pares++;
            }else{
                impares++;
            }
            if(limite <= guardar.length) {
                numeros = Integer.parseInt(JOptionPane.showInputDialog("ingrese el número:"));
                limite++;
            }
        }
        //salida
        JOptionPane.showMessageDialog(null, "pares registrados:" +pares+ "\n impares registrados:" +impares);
        //ejercicio 1 terminado
    }
}
