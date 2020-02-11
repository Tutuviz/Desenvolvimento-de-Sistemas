package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int esc;
        boolean exit=false;
        Cliente c1 = new Cliente();

        c1.setNome(JOptionPane.showInputDialog("Digite seu nome"));
        c1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));
        c1.setCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de sua compra")));
        while (exit==false){
            esc=Integer.parseInt(JOptionPane.showInputDialog("Escolha um opção\n1-Ver o status\n2-Consultar a maioridade\n3-Consultar possíveis descontos\n4-Sair do programa"));
            switch (esc) {
                case 1:
                    c1.Status();
                    break;
                case 2:
                    c1.Maioridade();
                    break;
                case 3:
                    c1.Desconto();
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