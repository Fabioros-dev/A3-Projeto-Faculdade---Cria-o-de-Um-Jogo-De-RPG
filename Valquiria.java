public class Valquiria {
    private String nome;
    private String localidade;
    private String idade;

    //CRIAÇÃO DA CLASSE VALQUIRIA

     public Valquiria(String nome, String localidade, String idade) {
        this.nome = nome;
        this.localidade = localidade;
        this.idade = idade;
    }

    public Valquiria(String idade) {
        this.nome = "Nome Não Identificado";
        this.localidade = "Local Não Identificado";
        this.idade = "Idade Não Identificada";
        
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

    //HABILIDADES, MALDIÇÕES e PASSIVAS
    public void skillPassivaPodre() {
        System.out.println("Podridão Scarlate - ON");
    }
    

    
}
