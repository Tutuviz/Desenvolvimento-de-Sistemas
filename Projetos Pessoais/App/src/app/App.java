package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int esc;
        int escAtv;
        int humanAtual = 0;
        boolean exit=false;
        boolean exitAtv = false;
        Humano h1 = new Humano();
        Humano h2 = new Humano();
        Humano h3 = new Humano();
        Humano h4 = new Humano();
        Humano h5 = new Humano();
        while (exit==false) {
            esc = Integer.parseInt(JOptionPane.showInputDialog("Humano selecionado: (Adicionar aqui)\nEscolha uma opção:\n1 - Criar um novo humano\n2 - Selecionar um humano \n3 - Mostrar status do humano \n4 - Atividades \n5 - Sair do programa")); 
            switch (esc) {
                case 1:
                    if (h1.isExist()){
                        if (h2.isExist()){
                            if (h3.isExist()){
                                if (h4.isExist()){
                                    if (h5.isExist()){
                                        JOptionPane.showMessageDialog(null, "Humanos demais criados");
                                    } else {
                                        h5.preencher();
                                    }
                                } else {
                                    h4.preencher();
                                }
                            } else {
                                h3.preencher();
                            }
                        } else {
                            h2.preencher();
                        } 
                    } else {
                        h1.preencher();
                    }
                    break;
                case 2:
                    humanAtual = Integer.parseInt(JOptionPane.showInputDialog("Escolha o humano para utilizar:\n1 - "+h1.getName()+"\n2 - "+h2.getName()+"\n3 - "+h3.getName()+"\n4 - "+h4.getName()+"\n5 - "+h5.getName()));
                    break;
                case 3:
                    switch (humanAtual) {
                        case 1:
                            h1.status();
                            break;
                        case 2:
                            h2.status();
                            break;
                        case 3:
                            h3.status();
                            break;
                        case 4:
                            h4.status();
                            break;
                        case 5:
                            h5.status();
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Selecione um humano primeiramente");
                            break;
                    }
                    break;
                case 4:
                    while (exitAtv) {
                        escAtv = Integer.parseInt(JOptionPane.showInputDialog("~~~Atividades~~~\nEscolha uma opção:\n1 - Dormir \n2 - Estudar \n3 - Trabalhar \n4 - Jogar \n5 - Comer \n6 - Fazer Oba-Oba \n7 - Passear \n8 - Voltar para a Tela Principal")); 
                        switch (escAtv) {
                            case 1:
                            
                                break;
                            case 2:
                            
                                break;
                            case 3:
                            
                                break;
                            case 4:
                            
                                break;
                            case 5:
                            
                                break;
                            case 6:
                            
                                break;
                            case 7:
                            
                                break;
                            default:

                                break;
                        }
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }
}