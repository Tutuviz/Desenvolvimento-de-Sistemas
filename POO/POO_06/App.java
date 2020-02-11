package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int esc;
        boolean exit=false;
        Filme f1 = new Filme();

        f1.setTitulo(JOptionPane.showInputDialog("Digite o título do filme"));
        f1.setCategoria(JOptionPane.showInputDialog("Digite a categoria do filme"));
        while (exit==false){
            esc=Integer.parseInt(JOptionPane.showInputDialog("Escolha um opção\n1-Ver o status\n2-Lockar o filme\n3-Devolver o filme\n4-Sair do programa"));
            switch (esc) {
                case 1:
                    f1.Status();
                    break;
                case 2:
                    f1.LockFilme();
                    break;
                case 3:
                    f1.Devolver();
                    break;
                case 4:
                    exit=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
            
        }
    }
}