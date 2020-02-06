package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        
        int loop, num=0, n1, n2, n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Manda um valor"));
        
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Manda outro valor"));
        if(n1>n2){
            n3=n1;
            n1=n2;
            n2=n3;
        }
        for (loop=n1;loop<=n2;loop++){
            if(loop%2==1){
                num++;
            }
        }
        JOptionPane.showMessageDialog(null, "Existem "+num+" número(s) impar(es) entre "+n1+" e "+n2);
    }
}
