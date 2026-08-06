import javax.swing.JOptionPane;
public class Ejercicio6 {
    public static void main(String[] args) {
        //entrada
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿cuantos votos va a registrar?:"));
        int candidatoA = 0;
        int candidatoB = 0;
        int candidatoC = 0;
        String[] votos = new String[n];
        //proceso
        for(int i = 0; i < votos.length; i++) {
            votos[i] = JOptionPane.showInputDialog("ingrese los votos:" + (i + 1));
        }
        for(int v = 0; v < votos.length; v++) {
            if(votos[v].equals("A")) {
                candidatoA++;
            }else if(votos[v].equals("B")) {
                candidatoB++;
            }else if(votos[v].equals("C")) {
                candidatoC++;
            }else{
                JOptionPane.showMessageDialog(null, "voto invalido");
            }
        }
        //salida
        JOptionPane.showMessageDialog(null, "resultados:\n" + "Candidato A:\n" + candidatoA+ "votos" + "\ncandidato B:\n" + candidatoB+ "votos" + "\ncandidato C:\n" +candidatoC+ "votos");
        if(candidatoA > candidatoB && candidatoA > candidatoC) {
            JOptionPane.showMessageDialog(null, "ganador:\n candidato A");
        }else if(candidatoB > candidatoC && candidatoB > candidatoA) {
            JOptionPane.showMessageDialog(null, "ganador:\n candidato B");
        }else if(candidatoC > candidatoA && candidatoC > candidatoB) {
            JOptionPane.showMessageDialog(null, "ganador:\n candidato C");
        }else{
            JOptionPane.showMessageDialog(null, "Empate");
        }
        //ejercicio6 completado
    }
}
