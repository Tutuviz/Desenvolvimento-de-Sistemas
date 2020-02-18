package app;

import javax.swing.JOptionPane;

public class Fatura {
    private int num;
    private String description;
    private int qtd;
    private double price;

   

    public void ExibirValorFatura(){
        double value;
        value = this.getQtd()*this.getPrice();
        value = Desconto(value);
        JOptionPane.showMessageDialog(null, "R$"+value);
    }

    public double Desconto(double value){
        if (value > 200){
            value = value*0.9;
        }
        return value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
