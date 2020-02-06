package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        
        float n1, n2;
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Manda um valor"));
                
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Manda outro valor"));

        JOptionPane.showMessageDialog(null, "A media é: " +(n1+n2)/2);       
    }
}
