package braba;

import javax.swing.JOptionPane;

public class Braba {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.n1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        a1.n2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        a1.n3=Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota"));

        JOptionPane.showMessageDialog(null, "Sua média é: "+a1.media(a1.n1, a1.n2, a1.n3));
        a1.aprovado(a1.media(a1.n1, a1.n2, a1.n3));
    }
}
   