public class Valquiria {
    private String nome;
    private String localidade;
    private String idade;
    private Atributos atributos;  // Adicionar atributos

    public Valquiria(String nome, String localidade, String idade) {
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

    public String getIdade() {
        return idade;
    }

    // Adicionar getters e setters para atributos
    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public void skillPassivaPodre() {
        System.out.println("Podridão Scarlate - ON");
    }
}
