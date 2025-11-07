package src;

import java.util.Scanner;

public class Main  {

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
                5, // Vitalidade A = 4
                4, // Defesa D = 1
                4, // Força A = 4
                5, // Velocidade S = 5
                1 // Armadura + = 1
        ));

        Dado dado8 = new Dado(7);

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
                while (true) {
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

                        String[] mensagensCena2 = {
                            "\n-Um estalo vindo pelo ar",
                            "-como uma cobra metalica vindo em sua direção",
                            "-THUNK",
                            "-Uma flecha se crava a dois centímetros de sua cabeça..."
                        };

                        int indiceCena2 = 0;
                        while (indiceCena2 < mensagensCena2.length) {
                            System.out.println(mensagensCena2[indiceCena2]);
                            System.out.println("<<Pressione Enter para continuar>>");
                            scan.nextLine();
                            indiceCena2++;
                        }

                        while (true) {
                            System.out.println("'W' PARA CONTINUAR ANDANDO");
                            String acao = scan.nextLine().trim().toUpperCase();

                            if (acao.equals("W")) {
                                System.out.println("\nVOCÊ DECIDE IGNORAR A FLECHA E CONTINUA ANDANDO PELA CIDADE DESTRUÍDA");

                                String[] mensagensCena2cont = {
                                    "\n-Outra flecha corta o ar",
                                    "-Dessa vez, bem na altura do peito..."
                                };
                                int indiceCena2cont = 0;
                                while (indiceCena2cont < mensagensCena2cont.length) {
                                    System.out.println(mensagensCena2cont[indiceCena2cont]);
                                    System.out.println("<<Pressione Enter para continuar>>");
                                    scan.nextLine();
                                    indiceCena2cont++;
                                }

                                // AÇÃO: desviar da flecha pressionando 'S'
                                while (true) {
                                    System.out.println("Pressione 'S' para desviar.");
                                    String desviar = scan.nextLine().trim().toUpperCase();
                                    if (desviar.equals("S")) {
                                        System.out.println("\nVocê se esquiva no último segundo; a flecha passa raspando pelo seu ombro.");
                                        break;
                                    } else {
                                        System.out.println("Entrada inválida. Pressione 'S' para desviar.");
                                    }
                                }

                                break;
                            } else {
                                System.out.println("Pressione 'W' para continuar ou 'D' ");
                            }
                        }
                        break; // sai do loop da cidade
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

        // Aqui você pode continuar sua história com base em questlineCity
        if (questlineCity) {
            String[] mensagensCena2 = {
                "-Das sombras da vila, algo surge",
                "-Mecanismos chiando, ferro triturando pedra",
                "-Movimentos quebrados,como ossos deslocados",
                "_PINNOCHIO - O Filho Inacabado_",
                "-Seu braço mecânico goteja óleo e sangue seco",
                "-Olhos vazios, rasos...",
                "-A insanidade dissolvendo qualquer humanidade",
                "-Ele aponta outra flecha improvisada, feita com os restos de corpos da vila",
                "-Pinnochio sussurra com a voz tremula...",
                "'Pa...pai?'",
                "-Pinocchio começa a tremer,a fúria toma sua forma frágil",
                "'VOCÊ! VOCÊ ME FEZ ASSIM!'",
                "-Ele solta uma rajada frenética de flechas, erráticas, desesperadas, como um animal ferido atacando o próprio reflexo",
                "-Guts ergue a Dragonslayer, o aço negro refletindo uma lua pálida",
                "A armadura sussurra...",
                "'Corte. Rasgue. Ele quer morrer.'"

            };

            for (String msg : mensagensCena2) {
                System.out.println(msg);
                System.out.println("<<Pressione Enter para continuar>>");
                scan.nextLine();
            }

            while (true) {
                System.out.println("QUESTLINE SECUNDARIA : MATE PINNOCHIO");
                System.out.println("'E' PARA ACEITAR");
                System.out.println("'Q' PARA RECUSAR");
                String decisaoQuest = scan.nextLine().trim().toUpperCase();

                if (decisaoQuest.equalsIgnoreCase("E")) {
                    System.out.println("\n<<QUESTLINE ACEITA - MATE PINNOCHIO>>");

                    dado8 = new Dado(8);
                    int resultado = dado8.roll();
                    System.out.println("Resultado do dado: " + resultado);
                    
                    // Pega a vitalidade atual antes do dano
                    int vitalidadeAtual = Pinocchio.getAtributos().getVitalidade();
                    
                    if (resultado <= 3) {
                        System.out.println("VOCÊ ERROU O ATAQUE");
                        System.out.println("VEZ DE PINNOCHIO");
                        break;
                    } else if (resultado > 3 && resultado < 8) {
                        // Causa 2 pontos de dano
                        int novaPontosVida = Math.max(0, vitalidadeAtual - 2);
                        Pinocchio.getAtributos().setVitalidade(novaPontosVida);
                        System.out.println("Causou 2 pontos de dano!");
                        System.out.println("Vitalidade atual de Pinocchio: " + novaPontosVida);
                        break;
                    } else if (resultado == 8) {
                        // Causa 3 pontos de dano
                        int novaPontosVida = Math.max(0, vitalidadeAtual - 3);
                        Pinocchio.getAtributos().setVitalidade(novaPontosVida);
                        System.out.println("Golpe Crítico! Causou 3 pontos de dano!");
                        System.out.println("Vitalidade atual de Pinocchio: " + novaPontosVida);
                        break;
                    }

                    // Verifica se Pinocchio foi derrotado
                    if (Pinocchio.getAtributos().getVitalidade() <= 0) {
                        System.out.println("\nPinocchio foi derrotado!");
                        break;
                    }

                    break;
                } else if (decisaoQuest.equalsIgnoreCase("Q")) {
                    System.out.println("\n<<VOCÊ ESCAPOU>>");

                    break;
                } else {
                    System.out.println("Pressione 'E' para aceitar ou 'Q' para recusar.");
                }

            }
        } else {
            System.out.println("\nVocê evita a cidade e segue pela encosta fria ao norte...");
        }

    }

}
