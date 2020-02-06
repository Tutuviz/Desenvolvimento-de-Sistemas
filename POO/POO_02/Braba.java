package braba;

import javax.swing.JOptionPane;

public class Braba {

    public static void main(String[] args) {
        Carro c1=new Carro();
        int acel=0;

        c1.cor="azul";
        c1.modelo="Tesla";
        c1.velocidadeAtual=60;

        c1.liga();
        
        acel = Integer.parseInt(JOptionPane.showInputDialog("Quer acelerar quanto?"));

        c1.acelera(acel);

        JOptionPane.showMessageDialog(null, "A marcha do carro é:"+c1.passarMarcha(c1.velocidadeAtual));
    }
}
   