# 🚗 Sistema de Locadora de Veículos em Java

Projeto desenvolvido em **Java** com foco em **Programação Orientada a Objetos**, simulando o funcionamento de uma locadora de veículos, incluindo cálculo de aluguel, aplicação de taxas e geração de fatura.

Este projeto foi criado com fins **educacionais**, aplicando boas práticas de organização, validação de regras de negócio e separação de responsabilidades.

## Funcionalidades

* Cadastro de aluguel de veículo
* Validação de datas (não permite datas passadas ou inválidas)
* Cálculo do valor do aluguel:
  * Por **hora** (até 12 horas)
  * Por **dia** (acima de 12 horas)
  * Aplicação de taxa de serviço conforme valor do aluguel
* Geração de fatura com:
  * Pagamento básico
  * Taxa
  * Valor total
* Tratamento de exceções para entradas inválidas

##  Conceitos Aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Interfaces e polimorfismo
* Inversão de dependência
* Tratamento de exceções
* API de Data e Hora do Java (`java.time`)
* Separação de camadas:

  * `application`
  * `entities`
  * `services`

##  Estrutura do Projeto

```
src
 ├── application
 │   └── Locadora.java
 ├── model
 │   ├── entities
 │   │   ├── AluguelCarro.java
 │   │   ├── Veiculo.java
 │   │   └── Fatura.java
 │   └── services
 │       ├── InterfaceServico.java
 │       ├── TaxaServico.java
 │       └── ValorServico.java
```

##  Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/joaovinicius4/java-locadora
```

2. Abra o projeto em sua IDE (Eclipse, IntelliJ ou VS Code)

3. Execute a classe:

```
application.Locadora
```

4. Insira os dados solicitados no terminal:

   * Modelo do veículo
   * Data e hora de retirada
   * Data e hora de entrega
   * Preço por hora
   * Preço por dia

## Exemplo de Saída

```
Modelo do carro: Civic
Retirada: 20/01/2026 10:00
Entrega: 21/01/2026 12:00

FATURA:
Pagamento básico: 150.00
Taxa: 22.50
Pagamento total: 172.50
```

##  Autor

Projeto desenvolvido por **João Vinicius**
Estudante de Java | Programação Orientada a Objetos
*Feedbacks e sugestões são bem-vindos!*
[LinkedIn] https://www.linkedin.com/in/joãovinicius4/
