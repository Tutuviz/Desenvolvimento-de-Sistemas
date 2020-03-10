package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        int esc;
        int escHuman = 1;
        int escAtv;
        boolean exit=false;
        boolean exitAtv = false;
        Humano h1 = new Humano();
        Humano h2 = new Humano();
        Humano h3 = new Humano();
        Humano h4 = new Humano();
        Humano h5 = new Humano();
        Humano Unselected = new Humano();

        while (!exit) {
            esc = Integer.parseInt(JOptionPane.showInputDialog("Humano selecionado: "+humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).getName()+"\nEscolha uma opção:\n1 - Criar um novo humano\n2 - Selecionar um humano \n3 - Mostrar status do humano \n4 - Atividades \n5 - Deletar este Humano \n6 - Sair do programa")); 
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
                    if (h1.isExist()||h2.isExist()||h3.isExist()||h4.isExist()||h5.isExist()) {
                        escHuman = Integer.parseInt(JOptionPane.showInputDialog("Escolha o humano para utilizar:\n1 - "+h1.getName()+"\n2 - "+h2.getName()+"\n3 - "+h3.getName()+"\n4 - "+h4.getName()+"\n5 - "+h5.getName()));
                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected);
                    } else {
                        JOptionPane.showMessageDialog(null, "Crie um humano primeiramente");
                    }
                    break;
                case 3:
                    if (humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).isExist()) {
                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).status();
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione um humano primeiramente");
                    }
                    break;
                case 4:
                    if (humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).isExist()){
                        while (!exitAtv) {
                            if (humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).isAlive()) {
                                escAtv = Integer.parseInt(JOptionPane.showInputDialog("~~~Atividades~~~\nEscolha uma opção:\n1 - Dormir \n2 - Estudar \n3 - Trabalhar \n4 - Jogar \n5 - Comer \n6 - Fazer Oba-Oba \n7 - Passear \n8 - Exercitar-se \n9 - Voltar para a Tela Principal")); 
                                switch (escAtv) {
                                    case 1:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).dormir();
                                        break;
                                    case 2:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).estudar();
                                        break;
                                    case 3:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).trabalhar();
                                        break;
                                    case 4:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).jogar();
                                        break;
                                    case 5:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).comer();
                                        break;
                                    case 6:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).coitar();
                                        break;
                                    case 7:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).passear();
                                        break;
                                    case 8:
                                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).exercitar();
                                        break;
                                    case 9:
                                        exitAtv=true;
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "Opção Inválida");
                                        break;
                                }
                                humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).fatigue();
                            } else {
                                JOptionPane.showMessageDialog(null, "Seu humano está morto");
                                exitAtv=true;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione um humano primeiramente");
                    }
                    exitAtv=false;
                    break;
                case 5:
                    if (humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).isExist()){
                        humanSelected(escHuman, h1, h2, h3, h4, h5, Unselected).delete();
                    } else {
                        JOptionPane.showMessageDialog(null, "Selecione um humano primeiramente");
                    }  
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }

    //Selecionar o Humano
    static Humano humanSelected(int escHuman, Humano h1, Humano h2, Humano h3, Humano h4, Humano h5, Humano Unselected){
        switch (escHuman) {
            case 1:
                return h1;
            case 2:
                return h2;
            case 3:
                return h3;
            case 4:
                return h4;
            case 5:
                return h5;
            default:
                return Unselected;
        }
    }
}
