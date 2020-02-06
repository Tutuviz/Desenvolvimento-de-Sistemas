package app;

import javax.swing.JOptionPane;

public class Livro {
    String Titulo;
    String Nome;
    String Autor;
    boolean aberto = false;

    public void status(){
        JOptionPane.showMessageDialog(null, "O título do livro é: "+Titulo+"\nO autor do livro é: "+Autor+"\nO proprietário do livro é: "+Nome);
        if(aberto == true){
            JOptionPane.showMessageDialog(null, "O livro está aberto");
        }
        if(aberto == false){
            JOptionPane.showMessageDialog(null, "O livro está fechado");
        }
    }

    public void abrir() {
        if (aberto == true){
            JOptionPane.showMessageDialog(null, "O livro já está aberto");
        } else{
            aberto = true;
            JOptionPane.showMessageDialog(null, "O livro fica aberto");
        }
    }

    public void fechar() {
        if (aberto == false){
            JOptionPane.showMessageDialog(null, "O livro já está fechado");
        } else{
            aberto = false;
            JOptionPane.showMessageDialog(null, "O livro fica fechado");
        }
    } 

    public void ler(){
        if (aberto == false){
            JOptionPane.showMessageDialog(null, "Tu pega o livro mas ele está fechado então tu lê o titulo: "+Titulo);
        } else{
            JOptionPane.showMessageDialog(null,"Tu começas a ler o livro e lê 7 paginas até perceber que não prestou atenção em nada e irá reler");
        }
    }
}