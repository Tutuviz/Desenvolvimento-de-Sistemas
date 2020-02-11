package app;

import javax.swing.JOptionPane;

public class Filme {
    private String Titulo;
    private String Categoria;
    private boolean Disponivel;
    
    public String getTitulo() {
        return Titulo;
    }
    
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    
    public String getCategoria() {
        return Categoria;
    }
    
    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public Filme() {
        Disponivel = true;
    }
    
    public boolean isDisponivel() {
        return Disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        Disponivel = disponivel;
    }

    public void Status(){
        if (this.isDisponivel()==true){
            JOptionPane.showMessageDialog(null, "Titulo: "+Titulo+"\nCategoria: "+Categoria+"\nDisponível");
        } else{
            JOptionPane.showMessageDialog(null, "Titulo: "+Titulo+"\nCategoria: "+Categoria+"\nIndisponível");
        }
    }

    public void LockFilme(){
        if (this.isDisponivel()==true){
            this.setDisponivel(false);
            JOptionPane.showMessageDialog(null, "Filme lockado");
        } else{
            JOptionPane.showMessageDialog(null, "Indisponível");
        }
    }

    public void Devolver(){
        if (this.isDisponivel()==false){
            this.setDisponivel(true);
            JOptionPane.showMessageDialog(null, "Filme devolvido");
        } else{
            JOptionPane.showMessageDialog(null, "Já está disponivel");
        }
    }
    
    
}