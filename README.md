
# Sistema de Aluguel de Carros
Este projeto é um sistema simples para gerenciamento de aluguel de carros. Ele permite que os usuários visualizem, aluguem e devolvam veículos de uma frota, com um foco em oferecer uma interface amigável e funcionalidades básicas.

# Estrutura do Projeto
O sistema é dividido em várias classes e pacotes, cada uma com uma função específica:
Pacote Sistema
Classe Main: É o ponto de entrada do sistema, onde o usuário interage com o sistema através de um menu em loop. O menu permite listar veículos disponíveis, alugar e devolver veículos.
Classe SistemaDeAluguel: Gerencia a lista de veículos, incluindo operações para adicionar, listar, alugar e devolver veículos.
Pacote TiposVeiculos
Classe Carro: Representa um carro comum, com atributos adicionais como número de portas. Herda da classe Veiculo.
Classe CarroLuxo: Representa um carro de luxo, com um atributo adicional indicando se o carro possui espaço para duas pessoas. Herda da classe Veiculo.
Pacote VeiculoCaracteristicas
Classe Veiculo: Classe abstrata que define os atributos e métodos comuns a todos os veículos, como placa, modelo, ano, disponibilidade e um método abstrato para calcular a diária do aluguel.
Como Funciona

Inicialização
Quando o sistema é iniciado, a classe Main cria uma instância do SistemaDeAluguel e adiciona alguns veículos de exemplo, tanto carros comuns quanto carros de luxo.

Menu Principal:
O menu principal apresenta as seguintes opções:
Listar veículos disponíveis: Exibe todos os veículos que estão atualmente disponíveis para aluguel.
Alugar veículo: Permite que o usuário alugue um veículo fornecendo a placa do mesmo.
Devolver veículo: Permite que o usuário devolva um veículo fornecendo a placa.
Sair: Encerra o sistema.

Funcionalidades:
Listar Veículos Disponíveis: O método listarVeiculosDisponiveis() do SistemaDeAluguel percorre a lista de veículos e imprime aqueles que estão marcados como disponíveis.
Alugar Veículo: O usuário fornece a placa do veículo desejado. O sistema verifica se o veículo está disponível e, se estiver, o marca como alugado.
Devolver Veículo: O usuário fornece a placa do veículo a ser devolvido. O sistema marca o veículo como disponível novamente.

# Ambiente de Desenvolvimento:
Este projeto pode ser desenvolvido em qualquer IDE Java, como: IntelliJ IDEA, Eclipse, NetBeans,  para rodar o projeto basta importar o código fonte em uma das IDEs mencionadas e executar a classe Main.

# Orientação a Objetos
O sistema utiliza os seguintes conceitos de orientação a objetos:
Herança: A classe Carro e a classe CarroLuxo herdam da classe abstrata Veiculo. Isso permite que ambas compartilhem o comportamento comum definido em Veiculo, enquanto adicionam suas próprias características específicas.
Polimorfismo: O método calcularDiaria() é um exemplo de polimorfismo. Cada classe derivada (Carro e CarroLuxo) fornece sua própria implementação deste método, refletindo diferentes formas de calcular o custo da diária de aluguel.
Encapsulamento: A classe Veiculo encapsula atributos como placa, modelo, ano e disponibilidade, fornecendo métodos getter e setter para acessar e modificar esses atributos de maneira controlada.
Abstração: A classe Veiculo é abstrata e define um contrato (método calcularDiaria()) que as classes derivadas devem implementar. Isso permite que o código trate diferentes tipos de veículos de maneira uniforme.
Abstração: A classe Veiculo é abstrata e define um contrato (método calcularDiaria()) que as classes derivadas devem implementar. Isso permite que o código trate diferentes tipos de veículos de maneira uniforme.

Tecnologias usadas:

<img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/>
