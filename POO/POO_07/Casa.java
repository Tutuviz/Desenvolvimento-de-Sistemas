package app;

import javax.swing.JOptionPane;

public class Casa {
    private String cor;
    private int num;
    private int qtd_porta;
    private boolean aberto;
    private boolean inside;

    public void AbrirCasa(){
        if (this.isAberto() == true){
            JOptionPane.showMessageDialog(null, "A casa já está aberta :3 ");
        } else{
            this.setAberto(true);
            JOptionPane.showMessageDialog(null, "A casa foi aberta :3 ");
        }
    }

    public void FecharCasa(){
        if (this.isAberto() == true){
            this.setAberto(false);
            JOptionPane.showMessageDialog(null, "A casa foi fechada :3 ");
        } else{
            JOptionPane.showMessageDialog(null, "A casa já está fechada :3 ");
        }
    }

    public void PintarCasa(){
        this.setCor(JOptionPane.showInputDialog("Digite a cor que deseja pintar a casa"));
        JOptionPane.showMessageDialog(null, "A casa foi pintada de "+getCor());
    }

    public void Entrar(){
        if (this.isInside() == true){
            JOptionPane.showMessageDialog(null, "Você já está dentro de casa");
        } else {
            if (this.isAberto() == true) {
                JOptionPane.showMessageDialog(null, "Bem vindo");
                setInside(true);
            } else{
                JOptionPane.showMessageDialog(null, "A porta está fechada");
            }
        }
    }

    public void Sair(){
        if (this.isInside() == true){
            if (this.isAberto() == true) {
                JOptionPane.showMessageDialog(null, "Até mais tarde");
                setInside(false);
            } else{
                JOptionPane.showMessageDialog(null, "A porta está fechada");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Você já está fora de casa");
        }
    }

    public void AddPortas(){
        this.setQtd_porta(qtd_porta += Integer.parseInt(JOptionPane.showInputDialog("Quantas portas queres adicionar?")));
        JOptionPane.showMessageDialog(null, "A casa possui atualmente "+getQtd_porta());
    }

    public void Status(){
        if (this.isAberto() == true){
            JOptionPane.showMessageDialog(null, "Cor da casa "+cor+"\nNúmero da casa "+num+"\nQuantidade de portas "+qtd_porta+"\nA casa está aberta");
        } else{
            JOptionPane.showMessageDialog(null, "Cor da casa "+cor+"\nNúmero da casa "+num+"\nQuantidade de portas "+qtd_porta+"\nA casa está fechada");
        }
        
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getQtd_porta() {
        return qtd_porta;
    }

    public void setQtd_porta(int qtd_porta) {
        this.qtd_porta = qtd_porta;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean isInside() {
        return inside;
    }

    public void setInside(boolean inside) {
        this.inside = inside;
    }


    public Casa() {
        this.aberto = false;
        this.inside = false;
    }

}