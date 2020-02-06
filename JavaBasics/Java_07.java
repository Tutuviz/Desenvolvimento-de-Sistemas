package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        int n1, loop, qtd=0;

        for(loop=0;loop<5;loop++){
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            if (n1>=10 && n1<=150){
                qtd++;
            }
        }
        JOptionPane.showMessageDialog(null, "Existem "+qtd+" dentre os números digitados entre 10 e 150");
    }
}
