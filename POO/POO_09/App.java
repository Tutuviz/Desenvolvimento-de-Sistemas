package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        Carro c1 = new Carro();
        int esc;
        boolean exit = false;


        c1.setColor("azul");
        c1.setModel("fusca");
        c1.setVelAtual(50);
        c1.setVelMax(100);
        while (exit==false){
            esc=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Ligar o carro\n2 - Acelerar\n3 - Desacelerar\n4 - Sair do programa"));
            switch (esc) {
            case 1:
                c1.ligar();
                break;
            case 2:
                c1.acelerar();
                break;
            case 3:
                c1.desacelerar();
                break;
            case 4:
                exit = true;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                break;
            }
        }
    }
}