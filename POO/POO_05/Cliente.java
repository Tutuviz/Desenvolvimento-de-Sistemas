package app;

import javax.swing.JOptionPane;

public class Cliente {
    private String Nome;
    private int Idade;
    private double Compra;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public double getCompra() {
        return Compra;
    }

    public void setCompra(double compra) {
        Compra = compra;
    }

    public void Status(){
        JOptionPane.showMessageDialog(null, "Nome: "+Nome+"\nIdade: "+Idade+"\nPreço: "+Compra);
    }

    public void Maioridade(){
        if (this.getIdade() < 18) {
            JOptionPane.showMessageDialog(null, "És menor de idade");
        } else{
            JOptionPane.showMessageDialog(null, "És maior de idade");
        }
    }

    public void Desconto(){
        double desc;
        if (this.getIdade()<20){
            JOptionPane.showMessageDialog(null, "Sem desconto");
        } else {
            desc = Compra*0.9;
            JOptionPane.showMessageDialog(null, "Há um desconto na compra e o valor no final ficará: "+desc);
        }
    }
}