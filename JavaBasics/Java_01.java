package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        
        int n1, n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Manda um valor"));
                
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Manda outro valor"));

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "O maior é: " +n1);
        }
        else {
            if (n2 > n1) {
                JOptionPane.showMessageDialog(null, "O maior é: " +n2); 
            }
            else {
                JOptionPane.showMessageDialog(null, "Os numeros são iguais" ); 
            }
        }        
    }
}
