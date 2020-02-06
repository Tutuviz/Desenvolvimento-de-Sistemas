package braba;

import javax.swing.JOptionPane;

public class Carro {
    String cor=null;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    
    public void liga(){
        JOptionPane.showMessageDialog(null, "Carro Ligado");
    }
    
    public void acelera(int acelerar){
        velocidadeAtual += acelerar;
    }

    public int passarMarcha(double velAtual){
        int marcha = 0;
        if (velAtual>=0 && velAtual <=20) {
            marcha = 1;
        }
        if (velAtual>=21 && velAtual <=40) {
            marcha = 2;
        }
        if (velAtual>=41 && velAtual <=60) {
            marcha = 3;
        }
        if (velAtual>=61 && velAtual <=80) {
            marcha = 4;
        }
        if (velAtual>=81 && velAtual <=100) {
            marcha = 5;
        }
        return marcha;
    }
}
