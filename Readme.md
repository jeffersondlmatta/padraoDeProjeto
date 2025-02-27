## Padrões de Projeto: Strategy, Singleton e Facade

1. Padrão Strategy
   Definição Simples
   O padrão Strategy permite que você defina uma família de algoritmos, coloque cada um em uma classe separada e faça com que eles sejam intercambiáveis. Ele permite que você altere o comportamento de um objeto em tempo de execução, sem modificar o código que usa esse objeto.

    ###   Utilidade
-  Quando usar: Use o padrão Strategy quando tiver múltiplas formas de realizar uma tarefa e quiser escolher qual delas usar de forma flexível. É útil quando você quer mudar o comportamento de um objeto em tempo de execução sem alterar o código que usa o objeto.


- O que ele resolve: Ele resolve o problema de ter múltiplos comportamentos (ou algoritmos) embutidos em uma classe. Isso permite que você altere ou adicione novos comportamentos sem modificar as classes que os utilizam, promovendo maior flexibilidade e manutenção do código.

---
2. Padrão Singleton
   Definição Simples
   O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. Ou seja, você pode ter uma única instância de uma classe em toda a aplicação, evitando a criação de múltiplos objetos dessa classe.

    ### Utilidade
- Quando usar: Use o padrão Singleton quando você precisar garantir que uma classe tenha apenas uma instância, e essa instância deve ser acessível globalmente em todo o sistema. Por exemplo, em casos de gerenciamento de conexões com banco de dados, configurações globais, ou gerenciadores de logs.


- O que ele resolve: Ele resolve o problema de ter múltiplas instâncias de uma classe quando só é necessário uma única. Isso economiza recursos e garante que o estado da classe seja compartilhado em toda a aplicação. Pode ser útil quando você tem algo que precisa ser global, como uma configuração de aplicativo ou uma conexão de banco de dados.
---
3. Padrão Facade
   Definição Simples
   O padrão Facade fornece uma interface simplificada para um conjunto de interfaces complexas. Ele oculta a complexidade de um sistema e oferece uma interface única e mais fácil de usar para o cliente. Em outras palavras, é uma "fachada" que torna o uso de subsistemas mais simples.

    ### Utilidade
- Quando usar: Use o padrão Facade quando tiver um sistema com muitas classes e interfaces complexas, e quiser fornecer uma maneira mais simples de interagir com esse sistema. É útil quando você precisa integrar um sistema complexo, mas deseja expor uma interface mais fácil de entender.


- O que ele resolve: Ele resolve o problema de interfaces complexas e difíceis de usar. Ao criar uma classe Facade, você oculta a complexidade e fornece uma interface simples e clara, que facilita a interação do cliente com o sistema complexo.

---
## Resumo dos Padrões:

## Resumo dos Padrões:

| Padrão      | Definição Simples                                                                                                                                                   | Quando Usar                                        | O Que Resolve                                                                 | Exemplo de Aplicação                                                           |
|-------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------|-------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| **Strategy** | Define uma família de algoritmos e os torna intercambiáveis. Permite mudar o comportamento de um objeto em tempo de execução.                                       | Quando você tem múltiplos algoritmos que precisam ser trocados dinamicamente.  | Flexibilidade para alterar o comportamento sem modificar o código existente.  | **Exemplo**: Em um sistema de pagamento, você pode usar diferentes métodos de pagamento (cartão de crédito, PayPal, transferência bancária) como estratégias intercambiáveis. |
| **Singleton** | Garante que uma classe tenha apenas uma instância e fornece acesso global a essa instância.                                                                      | Quando é necessário garantir uma única instância de uma classe no sistema.     | Controle sobre a criação de instâncias, economizando recursos e garantindo consistência. | **Exemplo**: Usar o padrão Singleton para garantir que o banco de dados seja instanciado apenas uma vez durante a execução do sistema, evitando múltiplas conexões desnecessárias. |
| **Facade**    | Fornece uma interface simplificada para um conjunto de interfaces complexas, ocultando a complexidade do sistema.                                                   | Quando o sistema é complexo e você quer oferecer uma interface simples para o usuário. | Simplificação do uso de sistemas complexos, proporcionando uma interface mais amigável. | **Exemplo**: Em um sistema bancário, o padrão Facade pode ser utilizado para ocultar a complexidade de diversos serviços (como consulta de saldo, transferência e extratos) e expor uma interface simples para o usuário interagir. |

