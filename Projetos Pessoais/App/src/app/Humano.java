package app;

import javax.swing.JOptionPane;

public class Humano {
    private String name;
    private String sex;
    private double height;
    private double peso;
    private int age;
    private int stamina;
    private boolean disease;
    private boolean alive;
    private boolean oculos;
    private boolean exist;

    public void preencher() {
        int esc1;
        this.setName(JOptionPane.showInputDialog("Digite o nome do humano: "));
        this.setSex(JOptionPane.showInputDialog("Digite o sexo do humano: "));
        this.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do humano: (Em metros)")));
        this.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do humano: (Em Quilos)")));
        this.setAge(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do humano: ")));
        esc1 = Integer.parseInt(JOptionPane.showInputDialog("O humano usa oculos? \n1 - sim\n2 - não"));
        if (esc1 == 1){
            this.setOculos(true);
        } else {
            this.setOculos(false);
        }
        esc1 = Integer.parseInt(JOptionPane.showInputDialog("O humano tem uma doença? \n1 - sim\n2 - não"));
        if (esc1 == 1){
            this.setDisease(true);
        } else {
            this.setDisease(false);
        }
        this.setExist(true);
    }

    public void status(){
        JOptionPane.showMessageDialog(null, "O nome é: "+this.getName()+"\nA idade é: "+this.getAge()+"\nO sexo é: "+this.getSex()+"\nA altura é: "+this.getHeight()+"\nO peso é: "+this.getPeso()+"\nUsa oculos? "+this.isOculos()+"\nTem doença?"+this.isDisease());
    }

    public void fatigue(){
        if (this.getStamina()<=20 && this.getStamina()>0) {
            JOptionPane.showMessageDialog(null, "Vc se sente muito cansado e deveria ir descansar");
        }
        if (this.getStamina()<=0){
            if (this.isDisease()==true) {
                JOptionPane.showMessageDialog(null, "Após tantas atividades vc ficou exausto e morreu");
                this.setAlive(false);
            } else {
                JOptionPane.showMessageDialog(null, "Após tantas atividades vc ficou doente, deveria ir descansar");
                this.setDisease(true);
            }
        }
    }

    // Get and Set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDisease() {
        return disease;
    }

    public void setDisease(boolean disease) {
        this.disease = disease;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public boolean isOculos() {
        return oculos;
    }

    public void setOculos(boolean oculos) {
        this.oculos = oculos;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }
    
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    // Constructor
    public Humano() {
        this.setStamina(100);
        this.setAlive(true);
    }


}