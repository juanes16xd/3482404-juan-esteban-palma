import javax.swing.JOptionPane;
public class Ejercicio4 {
    public static void main(String[] args) {
        //entrada
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿cuantas temperaturas va ingresar?:"));
        double[] temperatura = new double[n];
        String salida = "";
        //proceso
        for(int i = 0; i < n; i++) {
            temperatura[i] = Double.parseDouble(JOptionPane.showInputDialog("ingrese la temperatura:" + (i + 1)));
        }
        for(int t = 0; t < temperatura.length; t++) {
            if(temperatura[t] < 10) {
                salida += "temperatura: \n" + temperatura[t] + "°C - frio\n";
            }else if(temperatura[t] >= 10 && temperatura[t] <= 25) {
                salida += "temperatura: \n" + temperatura[t] + "°C : templado\n";
            }else if(temperatura[t] > 25) {
                salida += "temperatura: \n" + temperatura[t] + "°C - calor\n";
            }
        }
        //salida
        JOptionPane.showMessageDialog(null,salida);
    }
}
