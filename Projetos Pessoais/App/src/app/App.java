package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        boolean exit=false;
        int esc;
        Humano h1 = new Humano();
        Humano h2 = new Humano();
        Humano h3 = new Humano();
        Humano h4 = new Humano();
        Humano h5 = new Humano();
        while (exit==false) {
            esc= Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n1 - Criar um novo humano \n2 - Mostrar status do humano\n3 - Mudar de Humano ")); 
            switch (esc) {
                case 1:
                    h1.preencher();
                    break;
                case 2:
                    
                    break;
                default:
                    break;
            }
        }
    }
}