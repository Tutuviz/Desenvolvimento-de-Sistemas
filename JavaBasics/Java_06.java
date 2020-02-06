package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        
        int loop;
        float med, max_med = 0;
        String nome, max_nome = null;

        for (loop=0;loop<5;loop++){
            nome = JOptionPane.showInputDialog("Manda teu nome");

            med = Integer.parseInt(JOptionPane.showInputDialog("Manda tua media"));
            if (loop == 1) {
                max_med = med;
                max_nome = nome;
            }
            if (med > max_med) {
                max_med = med;
                max_nome = nome;
            }
        }
        JOptionPane.showMessageDialog(null, "O com a maior média foi: "+max_nome);
    }
}
