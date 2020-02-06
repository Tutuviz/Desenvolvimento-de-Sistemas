package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        Livro l1 = new Livro();
        boolean exit = false;
        int Esc;
        
        l1.Titulo = JOptionPane.showInputDialog("Digite o título do livro");
        l1.Autor = JOptionPane.showInputDialog("Digite o nome do autor do livro");
        l1.Nome = JOptionPane.showInputDialog("Digite o seu nome");

        while (exit==false){
            Esc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha uma opção:\n1-Verificar status do livro\n2-Abrir o livro\n3-Fechar o livro\n4-Ler o livro\n5-Colocar o livro na estante"));
            switch (Esc){
                case 1:
                    l1.status();
                    break;
                case 2:
                    l1.abrir();
                    break;
                case 3:
                    l1.fechar();
                    break;
                case 4:
                    l1.ler();
                    break;
                case 5:
                    if (l1.aberto == true){
                        JOptionPane.showMessageDialog(null, "Tu realmente vai colocar o livro aberto na estante?");
                    } else{
                        exit = true;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }
}