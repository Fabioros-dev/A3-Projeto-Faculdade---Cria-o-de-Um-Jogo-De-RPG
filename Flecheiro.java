package src;
public class Flecheiro {
    private String nome;
    private String localidade;
    private int idade;
    private Atributos atributos;  // Adicionar atributos

    public Flecheiro(String nome, String localidade, int idade) {
        this.nome = nome;
        this.localidade = localidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalidade() {
        return localidade;
    }
    
    public int getIdade() {
        return idade;
    }

    // Adicionar getters e setters para atributos
    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Atributos getAtributos() {
        return atributos;
    }
}
