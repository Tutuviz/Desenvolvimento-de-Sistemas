package app;

import javax.swing.JOptionPane;

public class Carro {
    private String color;
    private String model;
    private int velAtual;
    private int velMax;
    private boolean ligado;

    public void ligar() {
        if (this.isLigado()) {
            JOptionPane.showMessageDialog(null, "O carro já está ligado");
        } else {
            this.setLigado(true);
            JOptionPane.showMessageDialog(null, "O carro foi ligado");
        }
    }
    public void acelerar() {
        int acel;
        if (this.isLigado()){
            acel=Integer.parseInt(JOptionPane.showInputDialog("Quanto queres acelerar?"));
            if (this.getVelAtual()+acel >= this.getVelMax()){
                JOptionPane.showMessageDialog(null, "O carro ultrapassará a velocidade máxima");
            } else {
                this.setVelAtual(this.getVelAtual()+acel);
                JOptionPane.showMessageDialog(null, "O carro está a "+this.getVelAtual()+" Km/h");
            }
        } else{
            JOptionPane.showMessageDialog(null, "O carro está desligado");
        }
    }

    public void desacelerar() {
        int desacel;
        if (this.isLigado()){
            desacel=Integer.parseInt(JOptionPane.showInputDialog("Quanto queres deacelerar?"));
            if (this.getVelAtual()-desacel<= 0){
                this.setVelAtual(0);
                JOptionPane.showMessageDialog(null, "O carro parou");
            } else{
                this.setVelAtual(this.getVelAtual()-desacel);
                JOptionPane.showMessageDialog(null, "O carro está a "+this.getVelAtual()+" Km/h");
            }
        } else{
            JOptionPane.showMessageDialog(null, "O carro está desligado");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean setLigado(boolean ligado) {
        this.ligado = ligado;
        return ligado;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVelAtual() {
        return velAtual;
    }

    public void setVelAtual(int velAtual) {
        this.velAtual = velAtual;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public Carro() {
        this.setLigado(false);
    }

}