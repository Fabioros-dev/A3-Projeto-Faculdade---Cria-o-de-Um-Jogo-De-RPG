
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // CRIAÇÃO DOS PERSONAGENS COM ATRIBUTOS
        // Maria (sem armadura)
        Cavaleiro Maria = new Cavaleiro("Maria", "Sangravia - Vale das Cruzes", 22);
        Maria.setAtributos(new Atributos(
                4, // Vitalidade A
                1, // Defesa D
                3, // Força B
                5, // Velocidade S
                0 // Sem armadura
        ));

        // Guts (armadura ++)
        Cavaleiro Guts = new Cavaleiro("Guts", "Valdarion", 24);
        Guts.setAtributos(new Atributos(
                4, // Vitalidade A
                4, // Defesa A
                4, // Força A
                1, // Velocidade D
                2 // Armadura ++
        ));

        // Vyke (armadura +)
        Cavaleiro Vyke = new Cavaleiro("Vyke", "Sol'Rathor - Cidade Abençoada", 23);
        Vyke.setAtributos(new Atributos(
                3, // Vitalidade B = 3
                4, // Defesa A = 4
                4, // Força A = 4
                3, // Velocidade B = 3
                1 // Armadura + = 1
        ));

        // Pinocchio (sem armadura)
        Flecheiro Pinocchio = new Flecheiro("Pinocchio", "Kravelheim - Forja de Lamentos", 16);
        Pinocchio.setAtributos(new Atributos(
                3, // Vitalidade B = 3
                1, // Defesa D = 1
                2, // Força C = 2
                4, // Velocidade A = 4
                0 // Sem armadura = 0
        ));

        // Artorias (armadura +)
        Cavaleiro Artorias = new Cavaleiro("Artorias", "Nethros Abyss - Poço da Escuridão", 26);
        Artorias.setAtributos(new Atributos(
                4, // Vitalidade A = 4
                3, // Defesa B = 3
                4, // Força A = 4
                4, // Velocidade A = 4
                1 // Armadura + = 1
        ));

        // Malenia (armadura +)
        Valquiria Malenia = new Valquiria("Malenia", "Elyndor - Árvore Sacra", "");
        Malenia.setAtributos(new Atributos(
                4, // Vitalidade A = 4
                1, // Defesa D = 1
                4, // Força A = 4
                5, // Velocidade S = 5
                1 // Armadura + = 1
        ));

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

        boolean questlineCity = false;

        // CENA 1 - ANDAR PARA FRENTE 
        while (true) {
            System.out.println("\nSUA ARMADURA COMEÇA A SUSURRAR PARA VOCÊ CONTINUAR AVANÇANDO...");
            System.out.println("<<Pressione W para andar para frente>>");
            String movimento = scan.nextLine().trim().toUpperCase();

            if (movimento.equals("W")) {
                System.out.println("\nCAMINHANDO PARA FRENTE VOCÊ ATRAVESSA A FLORESTA A QUAL MATOU UM GRUPO DE HOMENS");

                // CENA 2 - (Kravelheim - Forja de Lamentos)
                while (true) {  // Loop para a decisão da cidade
                    System.out.println("\nA SUA FRENTE TEM UMA CIDADE TOTALMENTE DESTRUÍDA, COM RUÍNAS POR TODOS OS LADOS");
                    System.out.println("DESEJA PASSAR POR ESSA CIDADE?");
                    System.out.println("<<Pressione W para ENTRAR ou A para DAR A VOLTA>>");

                    String decisaoCidade = scan.nextLine().trim().toUpperCase();

                    if (decisaoCidade.equals("W")) {
                        questlineCity = true;
                        System.out.println("VOCÊ DECIDE ENTRAR NA CIDADE - Kravelheim/Forja de Lamentos");
                        System.out.println("\nA VOZ DA ARMADURA MURMURA DENTRO DE SUA MENTE:");
                        System.out.println("-Sangue… sangue outra vez. Você nasceu para dilacerar.");
                        System.out.println("\nVOCÊ IGNORA A IRONIA DA ARMADURA E CONTINUA ANDANDO EM LINHA RETA");

                        while (true) {  // Loop para continuar na cidade
                            System.out.println("\nPRESSIONE 'W' PARA CONTINUAR");
                            String continuarCidade = scan.nextLine().trim().toUpperCase();

                            if (continuarCidade.equals("W")) {
                                String[] mensagensCena2 = {
                                    "-Um estalo vindo pelo ar",
                                    "-como uma cobra metalica vindo em sua direção",
                                    "-THUNK",
                                    "-Uma flecha se crava a dois centímetros de sua cabeça..."
                                };

                                for (String mensagem : mensagensCena2) {
                                    System.out.println(mensagem);
                                    System.out.println("<<Pressione Enter para continuar>>");
                                    scan.nextLine();
                                }
                                break;
                            } else {
                                System.out.println("Pressione 'W' para continuar.");
                            }
                        }
                        break;

                    } else if (decisaoCidade.equals("A")) {
                        questlineCity = false;
                        System.out.println("VOCÊ NÃO PASSA PELA CIDADE E DECIDE IR POR FORA");
                        break;
                    } else {
                        System.out.println("Pressione 'W' para ENTRAR ou 'A' para DAR A VOLTA.");
                    }
                }
                break;
            } else {
                System.out.println("Pressione 'W' para continuar.");
            }
        }

        // Continue sua história aqui baseado no valor de questlineCity
    }
}
