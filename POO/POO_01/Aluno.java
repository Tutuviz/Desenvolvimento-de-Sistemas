package braba;

import javax.swing.JOptionPane;

public class Aluno {
    public double n1;
    public double n2;
    public double n3;
    
    public double media(double x, double y, double z){
        double result=0;
        
        result = (x+y+z)/3;

        return result;
    }
    public void aprovado(double x){
        if (x<7) {
            JOptionPane.showMessageDialog(null, "Reprovado!");
        }
        else{
            JOptionPane.showMessageDialog(null, "Aprovado!");
        }
    }
}