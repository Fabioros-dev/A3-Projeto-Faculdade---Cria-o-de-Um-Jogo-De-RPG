public class Atributos {
    private int vitalidade;
    private int defesa;
    private int força;
    private int velocidade;
    private int armadura;

    public Atributos(int vitalidade, int defesa, int força, int velocidade, int armadura) {
        this.vitalidade = vitalidade;
        this.defesa = defesa;
        this.força = força;
        this.velocidade = velocidade;
        this.armadura = armadura;
    }

    // Getters
    public int getVitalidade() { return vitalidade; }
    public int getDefesa() { return defesa; }
    public int getForça() { return força; }
    public int getVelocidade() { return velocidade; }
    public int getArmadura() { return armadura; }

    // Setters
    public void setVitalidade(int vitalidade) { this.vitalidade = vitalidade; }
    public void setDefesa(int defesa) { this.defesa = defesa; }
    public void setForça(int força) { this.força = força; }
    public void setVelocidade(int velocidade) { this.velocidade = velocidade; }
    public void setArmadura(int armadura) { this.armadura = armadura; }
}