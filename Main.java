package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // CRIAÇÃO DOS PERSONAGENS COM ATRIBUTOS
        Cavaleiro Maria = new Cavaleiro("Maria", "Sangravia - Vale das Cruzes", 22);
        Maria.setAtributos(new Atributos(4, 1, 2, 5, 0));

        Cavaleiro Guts = new Cavaleiro("Guts", "Valdarion", 24);
        Guts.setAtributos(new Atributos(4, 4, 4, 3, 2));

        Cavaleiro Vyke = new Cavaleiro("Vyke", "Sol'Rathor - Cidade Abençoada", 23);
        Vyke.setAtributos(new Atributos(3, 4, 4, 3, 1));

        Flecheiro Pinocchio = new Flecheiro("Pinocchio", "Kravelheim - Forja de Lamentos", 16);
        Pinocchio.setAtributos(new Atributos(4, 1, 2, 4, 0));

        Cavaleiro Artorias = new Cavaleiro("Artorias", "Nethros Abyss - Poço da Escuridão", 26);
        Artorias.setAtributos(new Atributos(4, 3, 4, 4, 1));

        Valquiria Malenia = new Valquiria("Malenia", "Elyndor - Árvore Sacra", "");
        Malenia.setAtributos(new Atributos(5, 4, 4, 5, 1));

        Dado dado8 = new Dado(7);

        // INTRO
        String[] mensagens = {
            "-Há muito tempo, Elysdrin era um reino de ouro e glória",
            "-Heróis caminhavam como lendas vivas",
            "-Deuses observavam, e os reinos floresciam sob sua luz",
            "-Mas tudo que cresce demais se corrompe",
            "-E em Elysdrin, a queda começou em silêncio",
            "..."
        };

        for (String msg : mensagens) {
            System.out.println(msg);
            System.out.println("<<Pressione Enter para continuar>>");
            scan.nextLine();
        }

        // TUTORIAL
        String[] mensagensTuto = {
            "TUTORIAL - CONTROLES",
            "Pressione 'Q' quando quiser rejeitar uma missão.",
            "Pressione 'E' quando quiser aceitar uma missão."
        };

        for (String msg : mensagensTuto) {
            System.out.println(msg);
            System.out.println("<<Pressione Enter para continuar>>");
            scan.nextLine();
        }

        // CENA 1
        while (true) {
            System.out.println("\nSUA ARMADURA COMEÇA A SUSSURRAR PARA VOCÊ CONTINUAR AVANÇANDO...");
            System.out.println("<<Pressione W para andar para frente>>");
            String movimento = scan.nextLine().trim().toUpperCase();

            if (movimento.equals("W")) {
                System.out.println("\nCAMINHANDO PARA FRENTE VOCÊ ATRAVESSA A FLORESTA A QUAL MATOU UM GRUPO DE HOMENS");

                // CENA 2 (Entrada obrigatória na cidade)
                System.out.println("\nA SUA FRENTE TEM UMA CIDADE TOTALMENTE DESTRUÍDA, COM RUÍNAS POR TODOS OS LADOS");
                System.out.println("VOCÊ DECIDE ENTRAR NA CIDADE - Kravelheim/Forja de Lamentos");

                System.out.println("\nA VOZ DA ARMADURA MURMURA DENTRO DE SUA MENTE:");
                System.out.println("-Sangue… sangue outra vez. Você nasceu para dilacerar.");
                System.out.println("\nVOCÊ IGNORA A IRONIA DA ARMADURA E CONTINUA ANDANDO EM LINHA RETA");

                String[] mensagensCena2 = {
                    "\n-Um estalo vindo pelo ar",
                    "-como uma cobra metálica vindo em sua direção",
                    "-THUNK",
                    "-Uma flecha se crava a dois centímetros de sua cabeça..."
                };

                for (String msg : mensagensCena2) {
                    System.out.println(msg);
                    System.out.println("<<Pressione Enter para continuar>>");
                    scan.nextLine();
                }

                // Continuar andando
                while (true) {
                    System.out.println("'W' PARA CONTINUAR ANDANDO");
                    String acao = scan.nextLine().trim().toUpperCase();

                    if (acao.equals("W")) {
                        System.out.println("\nVOCÊ DECIDE IGNORAR A FLECHA E CONTINUA ANDANDO PELA CIDADE DESTRUÍDA");

                        String[] mensagensCena2cont = {
                            "\n-Outra flecha corta o ar",
                            "-Dessa vez, bem na altura do peito..."
                        };

                        for (String msg : mensagensCena2cont) {
                            System.out.println(msg);
                            System.out.println("<<Pressione Enter para continuar>>");
                            scan.nextLine();
                        }

                        // AÇÃO: desviar
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

                        break; // Sai do loop do andar
                    } else {
                        System.out.println("Pressione 'W' para continuar.");
                    }
                }
                break; // Sai do loop principal
            } else {
                System.out.println("Pressione 'W' para continuar.");
            }
        }

        // QUESTLINE - PINOCCHIO
        String[] mensagensCena3 = {
            "-Das sombras da vila, algo surge",
            "-Mecanismos chiando, ferro triturando pedra",
            "-Movimentos quebrados, como ossos deslocados",
            "_PINNOCHIO - O Filho Inacabado_",
            "-Seu braço mecânico goteja óleo e sangue seco",
            "-Olhos vazios, rasos...",
            "-A insanidade dissolvendo qualquer humanidade",
            "-Ele aponta outra flecha improvisada, feita com os restos de corpos da vila",
            "-Pinocchio sussurra com a voz trêmula...",
            "'Pa...pai?'",
            "-Pinocchio começa a tremer, a fúria toma sua forma frágil",
            "'VOCÊ! VOCÊ ME FEZ ASSIM!'",
            "-Ele solta uma rajada frenética de flechas, erráticas, desesperadas, como um animal ferido atacando o próprio reflexo",
            "-Guts ergue a Dragonslayer, o aço negro refletindo uma lua pálida",
            "A armadura sussurra...",
            "'Corte. Rasgue. Ele quer morrer.'"
        };

        for (String msg : mensagensCena3) {
            System.out.println(msg);
            System.out.println("<<Pressione Enter para continuar>>");
            scan.nextLine();
        }

        // BATALHA PINOCCHIO
        while (true) {
            System.out.println("QUESTLINE SECUNDÁRIA: MATE PINOCCHIO");
            System.out.println("'E' PARA ACEITAR");
            System.out.println("'Q' PARA RECUSAR");
            String decisaoQuest = scan.nextLine().trim().toUpperCase();

            if (decisaoQuest.equals("E")) {
                System.out.println("\n<<QUESTLINE ACEITA - MATE PINOCCHIO>>");
                Dado dado = new Dado(8);

                boolean vezGuts2 = false;
                while (true) {
                    if (vezGuts2) {
                        System.out.println("\nVez de Guts. Pressione Enter para rolar o dado.");
                        scan.nextLine();
                        int roll = dado.roll();
                        System.out.println("Guts rolou: " + roll);
                        int dano;
                        if (roll <= 3) {
                            dano = 0;
                            System.out.println("Ataque falhou!");
                        } else if (roll < 8) {
                            dano = 2;
                            System.out.println("Acertou! Dano: 2");
                        } else { // roll == 8
                            dano = 3;
                            System.out.println("Crítico! Dano: 3");
                        }
                        // Aplica dano em Pinocchio
                        int vidaP = Math.max(0, Pinocchio.getAtributos().getVitalidade() - dano);
                        Pinocchio.getAtributos().setVitalidade(vidaP);
                        System.out.println("Vitalidade de " + Pinocchio.getNome() + ": " + vidaP);
                        if (vidaP <= 0) {
                            System.out.println("\nPinocchio foi derrotado por Guts!");
                            break;
                        }
                    } else {
                        System.out.println("\nVez de Pinocchio. Pressione Enter para rolar o dado.");
                        scan.nextLine();
                        int roll = dado.roll();
                        System.out.println("Pinocchio rolou: " + roll);
                        int dano;
                        if (roll <= 3) {
                            dano = 0;
                            System.out.println("Pinocchio errou!");
                        } else if (roll < 8) {
                            dano = 1;
                            System.out.println("Pinocchio acertou! Dano: 1");
                        } else {
                            dano = 2;
                            System.out.println("Pinocchio acerta um crítico! Dano: 2");
                        }
                        // Aplica dano em Guts
                        int vidaG = Math.max(0, Guts.getAtributos().getVitalidade() - dano);
                        Guts.getAtributos().setVitalidade(vidaG);
                        System.out.println("Vitalidade de " + Guts.getNome() + ": " + vidaG);
                        if (vidaG <= 0) {
                            System.out.println("\nGuts foi derrotado por Pinocchio!");
                            //adicionar aumento de velocidade ao guts pela vitoria!!!
                            break;
                        }
                    }
                    vezGuts2 = !vezGuts2;
                }
                break;
            } else if (decisaoQuest.equals("Q")) {
                System.out.println("\n<<VOCÊ RECUSOU O DESAFIO - VOCÊ ESCAPA DE KRAVELHEIM>>");
                System.out.println("<<Pressione Enter para continuar>>");
                scan.nextLine();

                // CENA APÓS A RECUSA
                String[] mensagemCenaFora = {
                    "-A estrada se afunila...",
                    "-O mundo parece morrer ao redor, árvores petrificadas",
                    "-terra rachada como pele queimada, o céu tingido de vermelho enfermo.",
                    "-O vento para, nem insectos, nem pássaros",
                    "-Nada ousa respirar onde os deuses assistem",
                    "-À frente, uma porta colossal cravada",
                    "-Runas queimam como carne viva sobre a sua superfície. A entrada da Arena...",
                    "-Guts caminha com passos pesados, a Dragonslayer arrastando na terra, deixando uma marca profunda",
                    "-como uma cicatriz no mundo.",
                    "-Seu olhar é fixo na porta, até sentir algo...",
                    "-Um corpo parado à beira da entrada, como se o destino o tivesse moldado ali.",
                    "_Vyke, A Voz da Chama Frenética_",
                    "-Imóvel...",
                    "-A vontade da Chama Frenzy é tão nítida em seus olhos, que de longe é impossível ignorar seu brilho ocular.",
                    "-Manto destruído pelo tempo, pele marcada com cicatrizes",
                    "-uma luz febril nos olhos, não como fogo, mas algo insano",
                    "-Ele encara Guts com uma intensidade que parece perfurar a alma.",
                    "-Sem emoção, sem medo - Vyke dá um passo.",
                    "-Guts para. Dois guerreiros que deveriam estar mortos há muito tempo, frente a frente.",
                    "-Guts aperta a espada. A armadura sussurra:",
                    "'Esse é marcado pela chama, mate-o'",
                    "-Vyke avança outro passo - agora a poucos metros de Guts...",
                    "'Se você se aproximar... Eu lhe despedaçarei sem piedade, demônio.'"
                };

                for (String msg : mensagemCenaFora) {
                    System.out.println(msg);
                    System.out.println("<<Pressione Enter para continuar>>");
                    scan.nextLine();
                }



                // (Aqui pode continuar a história — por exemplo, iniciar um novo combate com Vyke)
                break;

            } else {
                System.out.println("Pressione 'E' para aceitar ou 'Q' para recusar.");
            }
        }
    }
}
