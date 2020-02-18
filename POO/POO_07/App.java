package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int esc;
        boolean exit = false;
        Casa c1 = new Casa();
        c1.setNum(Integer.parseInt(JOptionPane.showInputDialog("Digite o número de sua casa")));
        c1.setQtd_porta(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de portas de sua casa")));
        c1.setCor(JOptionPane.showInputDialog("Digite a cor de sua casa"));

        while (exit == false){
            esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção \n1 - Abrir a casa\n2 - Fechar a casa\n3 - Pintar a casa\n4 - Entrar na casa\n5 - Sair da Casa\n6 - Adicionar portas\n7 - Status\n8 - Sair do programa"));
            switch (esc) {
                case 1:
                    c1.AbrirCasa();
                    break;
                case 2:
                    c1.FecharCasa();
                    break;
                case 3:
                    c1.PintarCasa();
                    break;
                case 4:
                    c1.Entrar();
                    break;
                case 5:
                    c1.Sair();
                    break;
                case 6:
                    c1.AddPortas();
                    break;
                case 7:
                    c1.Status();
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }
}