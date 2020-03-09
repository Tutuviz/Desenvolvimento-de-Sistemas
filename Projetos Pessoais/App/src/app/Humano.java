package app;

import javax.swing.JOptionPane;

public class Humano {
    //Digitado
    private String name;
    private String sex;
    private int age;
    private double height;
    private double peso;
    private boolean disease;
    private boolean oculos;
    
    //Existence
    private boolean exist;
    private boolean alive;
    
    //Caracteristicas
    private int stamina;

    //Outros
    String[] options = {"Sim", "Não"};
    int esc;


    //Main Menu
    public void preencher() {
        this.setName(JOptionPane.showInputDialog("Digite o nome do humano: "));
        this.setSex(JOptionPane.showInputDialog("Digite o sexo do humano: "));
        this.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do humano: (Em metros)")));
        this.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do humano: (Em Quilos)")));
        this.setAge(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do humano: ")));
        esc = JOptionPane.showOptionDialog(null, "O humano usa oculos?", "Oculos", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (esc==0){
            this.setOculos(true);
        } else {
            this.setOculos(false);
        }
        esc = JOptionPane.showOptionDialog(null, "O humano tem doenças?", "Doenças", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (esc == 0){
            this.setDisease(true);
        } else {
            this.setDisease(false);
        }
        this.setAlive(true);
        this.setExist(true);
    }

    public void status(){
        JOptionPane.showMessageDialog(null, "O nome é: "+this.getName()+"\nA idade é: "+this.getAge()+"\nO sexo é: "+this.getSex()+"\nA altura é: "+this.getHeight()+"\nO peso é: "+this.getPeso()+"\nUsa oculos? "+this.isOculos()+"\nTem doença?"+this.isDisease());
    }

    public void delete(){
        int esc = JOptionPane.showOptionDialog(null, "Deseja realmente apagar para sempre (muito tempo) o/a "+this.getName(), "Deletar "+this.getName(), JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (esc == 0){
            this.setAge(0);
            this.setAlive(false);
            this.setDisease(false);
            this.setExist(false);
            this.setHeight(0);
            this.setName("Nenhum");
            this.setOculos(false);
            this.setPeso(0);
            this.setSex(null);
            this.setStamina(0);
        } else {
            JOptionPane.showMessageDialog(null, "O humano não foi deletado");
        }
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

    //Atividades
    public void dormir(){
        if (this.getStamina() == 100){
            JOptionPane.showMessageDialog(null, this.getName()+" já está descansado o suficiente, faça outras atividades para gastar energia");
        } else {
            JOptionPane.showMessageDialog(null, this.getName()+" dormiu e restaurou toda a energia");
            this.setStamina(100);
            
        }
    }

    public void estudar(){
        JOptionPane.showMessageDialog(null, this.getName()+" estudou arduamente e se sente mais inteligente porém desgastado");
        setStamina(getStamina()-10);
    }

    public void trabalhar(){
        JOptionPane.showMessageDialog(null, this.getName()+" trabalhou muito e agora deu uma pausa");
        setStamina(getStamina()-25);
    }
    public void jogar(){
        JOptionPane.showMessageDialog(null, this.getName()+" jogou durante horas e consegue sentir uma melhoria no jogo");
        setStamina(getStamina()-20);
    }
    public void comer(){
        JOptionPane.showMessageDialog(null, this.getName()+" comeu bem e está cheio agora");
        setStamina(getStamina()-5);
    }
    public void coitar(){
        JOptionPane.showMessageDialog(null, this.getName()+" ( ͡° ͜ʖ ͡°) I know, you know");
        setStamina(getStamina()-20);
    }
    public void passear(){
        JOptionPane.showMessageDialog(null, this.getName()+" deu um passeio e aproveitou bem o dia");
        setStamina(getStamina()-30);
    }
    public void exercitar(){
        JOptionPane.showMessageDialog(null, this.getName()+" se exercitou e agora está muito exausto");
        setStamina(getStamina()-40);
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
        this.setExist(false);
        this.setName("Nenhum");
    }


}
