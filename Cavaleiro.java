package src;
public class Cavaleiro {
    private String nome;
    private String localidade;
    private int idade;
    private Atributos atributos;

    //CRIAÇÃO DA CLASSE CAVALEIRO

    public Cavaleiro(String nome, String localidade, int idade) {
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

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    //HABILIDADES, MALDIÇÕES e PASSIVAS
    public void skillPassivaFrenzy() {
        System.out.println("Chama Frenetica - ON");
    }

    public void skillPassivaSede() {
        System.out.println("Sede de Sangue - ON");
    }

    public void skillPassivaAbyss() {
        System.out.println("Escuridão do Abismo - ON");
    }



    





}
