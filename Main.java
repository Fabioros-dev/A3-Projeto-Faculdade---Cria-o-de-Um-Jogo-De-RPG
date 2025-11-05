import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // CRIAÇÃO DOS PERSONAGENS
        Cavaleiro Guts = new Cavaleiro("Guts", "Valdarion", 24);
        Flecheiro Pinocchio = new Flecheiro("Pinocchio", "Kravelheim - Forja de Lamentos", 16);
        Cavaleiro Vyke = new Cavaleiro("Vyke", "Sol'Rathor - Cidade Abençoada", 23);
        Cavaleiro Maria = new Cavaleiro("Maria", "Sangravia - Vale das Cruzes", 22);
        Cavaleiro Artorias = new Cavaleiro("Artorias", "Nethros Abyss - Poço da Escuridão", 26);
        Valquiria Malenia = new Valquiria("Malenia", "Elyndor - Árvore Sacra", "");

        // INICIO
        String[] mensagens = {
            "-Há muito tempo, Elysdrin era um reino de ouro e glória",
            "-Hérois caminhavam como lendas vivas",
            "-Deuses observavam, e os reinos floresciam sob sua luz",
            "-Mas tudo que cresce demais se corrompe",
            "-E em Elysdrin, a queda começou em silêncio",
            "..."
        };

        int indice = 0;

        while (indice < mensagens.length) {
            String entrada = scan.nextLine(); // Espera o usuário apertar Enter

            // Mostra a próxima mensagem
            System.out.println(mensagens[indice]);
            System.out.println("<<Pressione Enter para continuar>>");

            // Avança para a próxima mensagem
            indice++;
        }

        // TUTORIAL CONTROLES
        String[] mensagensTuto = {
            "TUTORIAL - CONTROLES",
            "Pressione 'Q' quando quiser rejeitar uma missão.",
            "Pressione 'E' quando quiser aceitar uma missão."
        };

        indice = 0;

        while (indice < mensagensTuto.length) {
            String entrada = scan.nextLine(); // Espera o usuário apertar Enter

            // Mostra a próxima mensagem
            System.out.println(mensagensTuto[indice]);
            System.out.println("<<Pressione Enter para continuar>>");

            // Avança para a próxima mensagem
            indice++;
        }

        // CENA 1 - ANDAR PARA FRENTE 
        while (true) {
            System.out.println("\nSUA ARMADURA COMEÇA A SUSURRAR PARA VOCÊ CONTINUAR AVANÇANDO...");
            System.out.println("<<Pressione W para andar para frente>>");
            String movimento = scan.nextLine();

            if (movimento.equalsIgnoreCase("W")) {
                System.out.println("\nCAMINHANDO PARA FRENTE VOCÊ ATRAVESSA A FLORESTA A QUAL MATOU UM GRUPO DE HOMENS");

                // CENA 2 - (Kravelheim - Forja de Lamentos)
                System.out.println("\nA SUA FRENTE TEM UMA CIDADE TOTALMENTE DESTRUÍDA, COM RUÍNAS POR TODOS OS LADOS");
                System.out.println("DESEJA PASSAR POR ESSA CIDADE?");
                System.out.println("<<Pressione W para ENTRAR ou A para DAR A VOLTA>>");

                while (true) {
                    String decisaoCidade = scan.nextLine();

                    if (decisaoCidade.equalsIgnoreCase("W")) {
                        System.out.println("VOCÊ DECIDE ENTRAR NA CIDADE - Kravelheim/Forja de Lamentos");
                        System.out.println("\nA VOZ DA ARMADURA MURMURA DENTRO DE SUA MENTE:");
                        System.out.println("-Sangue… sangue outra vez. Você nasceu para dilacerar.");
                        System.out.println();
                        break; // sai do loop da decisão

                    } else if (decisaoCidade.equalsIgnoreCase("A")) {
                        System.out.println("VOCÊ NÃO PASSA PELA CIDADE E DECIDE IR POR FORA");
                        break; // sai do loop da decisão
                    } else {
                        System.out.println("Pressione 'W' para ENTRAR ou 'A' para DAR A VOLTA.");
                    }
                }

                break; // sai do loop principal após completar a cena 2
            } else {
                System.out.println("Você precisa pressionar 'W' para continuar.");
            }
        }
    }
}
