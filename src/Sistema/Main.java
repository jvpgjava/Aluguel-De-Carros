package Sistema; //pacote

//importações
import TiposVeiculos.Carro;
import TiposVeiculos.CarroLuxo;
import VeiculoCaracteristicas.Veiculo;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        SistemaDeAluguel sistema = new SistemaDeAluguel();

        sistema.adicionarVeiculo(new Carro("ABC1234", "Fusca", 1980, 4));
        sistema.adicionarVeiculo(new CarroLuxo("XYZ5678", "Ferrari 458", 2020, true));
        sistema.adicionarVeiculo(new Carro("DEF5678", "Civic", 2022, 4));
        sistema.adicionarVeiculo(new CarroLuxo("LMN9012", "Tesla", 2023, false));

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {
            System.out.println("\nBem vindo à XY Veículos");
            System.out.println("        _______      \n" +
                    "       //  ||\\ \\     \n" +
                    " _____//___||_\\ \\___ \n" +
                    " )  _          _    \\\n" +
                    " |_/ \\________/ \\___|\n" +
                    "   \\_/        \\_/ ");
            System.out.println("\n1. Listar veículos disponíveis");
            System.out.println("2. Alugar veículo");
            System.out.println("3. Devolver veículo");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            // Validação da opção do menu
            while (true) {
                try {
                    opcao = scanner.nextInt();
                    if (opcao < 1 || opcao > 4) {
                        System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                        System.out.print("Escolha uma opção: ");
                    } else {
                        scanner.nextLine(); // Consome o newline
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    scanner.next(); // Limpa o buffer
                    System.out.print("Escolha uma opção: ");
                }
            }

            switch (opcao) {
                case 1:
                    sistema.listarVeiculosDisponiveis();
                    boolean respostaValida = false;
                    while (!respostaValida) {
                        System.out.print("Deseja fazer mais alguma coisa? (s/sim/n/não): ");
                        String resposta = scanner.nextLine().trim().toLowerCase();

                        if (resposta.equals("n") || resposta.equals("não") || resposta.equals("nã")) {
                            opcao = 4; // Definir opção como 4 para encerrar o loop principal
                            respostaValida = true;
                        } else if (resposta.equals("s") || resposta.equals("sim") || resposta.equals("s")) {
                            respostaValida = true; // Volta ao menu principal
                        } else {
                            System.out.println("Resposta inválida. Por favor, digite 's', 'sim', 'n' ou 'não'.");
                        }
                    }
                    break;

                case 2:
                    boolean veiculoValido = false;
                    while (!veiculoValido) {
                        System.out.print("Digite a placa do veículo que deseja alugar: ");
                        String placaAluguel = scanner.nextLine();
                        Veiculo veiculo = sistema.encontrarVeiculoPorPlaca(placaAluguel);

                        if (veiculo == null) {
                            System.out.println("Veículo com a placa fornecida não encontrado. Tente novamente.");
                        } else if (!veiculo.isDisponivel()) {
                            System.out.println("Veículo não disponível para aluguel. Tente novamente.");
                        } else {
                            if (sistema.alugarVeiculo(placaAluguel)) {
                                System.out.println("Veículo alugado com sucesso!");
                                veiculoValido = true;
                            } else {
                                System.out.println("Falha ao alugar o veículo. Tente novamente.");
                            }
                        }
                    }
                    // Pergunta se o usuário deseja fazer mais alguma coisa
                    respostaValida = false;
                    while (!respostaValida) {
                        System.out.print("Deseja fazer mais alguma coisa? (s/sim/n/não): ");
                        String resposta = scanner.nextLine().trim().toLowerCase();

                        if (resposta.equals("n") || resposta.equals("não") || resposta.equals("nã")) {
                            opcao = 4; // Definir opção como 4 para encerrar o loop principal
                            respostaValida = true;
                        } else if (resposta.equals("s") || resposta.equals("sim") || resposta.equals("s")) {
                            respostaValida = true; // Volta ao menu principal
                        } else {
                            System.out.println("Resposta inválida. Por favor, digite 's', 'sim', 'n' ou 'não'.");
                        }
                    }
                    break;

                case 3:
                    boolean veiculoExistente = false;
                    while (!veiculoExistente) {
                        System.out.print("Digite a placa do veículo que deseja devolver: ");
                        String placaDevolucao = scanner.nextLine();
                        Veiculo veiculo = sistema.encontrarVeiculoPorPlaca(placaDevolucao);

                        if (veiculo == null) {
                            System.out.println("Veículo com a placa fornecida não encontrado. Tente novamente.");
                        } else {
                            sistema.devolverVeiculo(placaDevolucao);
                            System.out.println("Veículo devolvido com sucesso!");
                            veiculoExistente = true;
                        }
                    }
                    // Pergunta se o usuário deseja fazer mais alguma coisa
                    respostaValida = false;
                    while (!respostaValida) {
                        System.out.print("Deseja fazer mais alguma coisa? (s/sim/n/não): ");
                        String resposta = scanner.nextLine().trim().toLowerCase();

                        if (resposta.equals("n") || resposta.equals("não") || resposta.equals("nã")) {
                            opcao = 4; // Definir opção como 4 para encerrar o loop principal
                            respostaValida = true;
                        } else if (resposta.equals("s") || resposta.equals("sim") || resposta.equals("s")) {
                            respostaValida = true; // Volta ao menu principal
                        } else {
                            System.out.println("Resposta inválida. Por favor, digite 's', 'sim', 'n' ou 'não'.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 4);

        scanner.close();
    }
}


//Encapsulamento: Os atributos das classes Veiculo, Carro e CarroLuxo são privados e acessados por métodos getters e setters.
//Herança: Carro e Moto herdam de Veiculo, utilizando os métodos e atributos da classe base.
//        Polimorfismo: O método calcularDiaria é definido de forma diferente em Carro e Moto, mas pode ser chamado em objetos do tipo Veiculo.
//Sobrecarga: Não aplicamos sobrecarga diretamente, mas o conceito pode ser aplicado se precisarmos de métodos adicionais com o mesmo nome, mas diferentes parâmetros.
//Interatividade: A classe Main permite ao usuário interagir com o sistema através do console, realizando operações de consulta, aluguel e devolução de veículos.

//Estrutura do Sistema:
//Classe Base Veiculo: Representa um veículo genérico.
//Classe Carro: Representa um carro, derivado de Veiculo.
//Classe Moto: Representa uma moto, derivada de Veiculo.
//Classe SistemaDeAluguel: Gerencia a lista de veículos e realiza operações de aluguel.
//Classe Main: Interface com o usuário, onde o usuário pode interagir com o sistema.