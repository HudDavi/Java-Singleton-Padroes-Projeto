# Padrões de Criação em Java

Este é um exemplo de projeto Java que demonstra três padrões de criação: Singleton Preguiçoso (Lazy Singleton), Singleton Ansioso (Eager Singleton) e Singleton com Holder.

## Visão Geral

Este projeto Java apresenta três implementações diferentes do padrão Singleton, que garante que uma classe tenha apenas uma instância e forneça um ponto de acesso global para essa instância.

- **Lazy Singleton (Singleton Preguiçoso)**: A instância da classe é criada apenas quando é necessária, na primeira chamada ao método `getLazy()`. Isso é útil para economizar recursos quando a criação da instância é cara.

- **Eager Singleton (Singleton Ansioso)**: A instância da classe é criada assim que a classe é carregada, independentemente de ser usada ou não. Isso garante que a instância esteja sempre disponível.

- **Singleton com Holder**: Usa uma classe interna estática para manter a instância do Singleton. A instância é criada apenas quando a classe interna é carregada, o que é uma forma eficiente e segura de criar um Singleton.

## Uso

Você pode executar o projeto seguindo estas etapas:

1. Clone ou faça o download deste repositório para a sua máquina local.
2. Importe o projeto em sua IDE Java preferida.
3. Execute a classe `App` para ver a criação e uso das instâncias Singleton.

## Estrutura do Projeto

A estrutura do projeto é organizada em três pacotes:

- **`app`**: Contém a classe `App` que é a classe principal para execução do exemplo.
- **`app.service.lazy`**: Contém a implementação do Singleton Preguiçoso.
- **`app.service.holder`**: Contém a implementação do Singleton com Holder.
- **`app.service.eager`**: Contém a implementação do Singleton Ansioso.

## Funcionalidades

Este projeto demonstra como implementar três variações do padrão Singleton em Java e como usá-los em uma aplicação simples.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

- Hudson Silva