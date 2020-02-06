package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        
        float n1, n2, n3, med;
        String nome;
        
        nome = JOptionPane.showInputDialog("Manda teu nome");

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Manda uma nota"));
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Manda outra nota"));
        
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Manda outra nota"));

        med = n1+n2+n3;

        if (med < 7) {
            JOptionPane.showMessageDialog(null, "O aluno está reprovado"); 
        }
        else{
            JOptionPane.showMessageDialog(null, "O aluno está aprovado");
        }
    }
}
