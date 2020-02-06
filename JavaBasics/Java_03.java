package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        
        float n1;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Manda um valor"));

        if (n1%2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é par"); 
        }
        else {
            JOptionPane.showMessageDialog(null, "O número é impar");
        }
              
    }
}
