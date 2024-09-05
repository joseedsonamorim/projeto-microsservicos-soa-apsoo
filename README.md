# Projeto de Microsserviços SOA

**Disciplina**: 14108 – Análise e Projeto de Sistemas OO  
**Professor**: Lucas Albertins  
**Equipe**: Gustavo Henrique, Thiago Brito, José Edson e Walquiria Santos <br>
**Versão**: 1.0  


## Sumário

- [Visão Geral](#visão-geral)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Instalação e Execução](#instalação-e-execução)
- [Microsserviços](#microsserviços)
- [API Gateway](#api-gateway)
- [Orquestração com Docker Compose](#orquestração-com-docker-compose)

## Visão Geral

Este projeto é parte da disciplina **Análise e Projeto de Sistemas OO** e tem como objetivo implementar uma arquitetura de software baseada em **SOA/Microsserviços**. O projeto inclui a criação de dois microsserviços que interagem entre si, um **API Gateway** e a execução dos serviços utilizando containers via **Docker Compose**.

## Estrutura do Projeto

A organização do projeto segue a seguinte estrutura:

```
projeto-microsservicos-soa/ 
├── docs/
│   ├── capa.pdf
│   ├── historico-revisoes.pdf
│   └── relatorio.pdf
├── services/
│   ├── service1/
│   └── service2/
├── gateway/
├── infra/
│   └── docker-compose.yml
└── README.md
```

- **docs/**: Relatórios e documentação.
- **services/**: Código-fonte dos microsserviços.
- **gateway/**: Código-fonte do API Gateway.
- **infra/**: Arquivo de orquestração do Docker (`docker-compose.yml`).

## Tecnologias Utilizadas

- **Java** com **Spring Boot** para os microsserviços
- **API Gateway**: Implementado usando **Spring Cloud Gateway**
- **Banco de Dados**: [Tecnologia escolhida, ex.: MySQL, PostgreSQL]
- **Containers**: **Docker** e **Docker Compose**

## Instalação e Execução

### Pré-requisitos

- Docker e Docker Compose instalados
- Java 11+ instalado
- Maven para build do projeto

### Passos para execução

1. Clone o repositório:

   ```
   bash
   git clone https://github.com/seu-usuario/projeto-microsservicos-soa.git
   cd projeto-microsservicos-soa
2. Construa os microsserviços:

   ``` 
   cd services/service1
   mvn clean package
   cd ../service2
   mvn clean package
   cd ../../
3. Execute a aplicação usando Docker Compose:
   
   ```
   docker-compose up --build

4. Os serviços estarão disponíveis em:
   
    Service 1: http://localhost:8081 <br>
   
    Service 2: http://localhost:8082 <br>
   
    API Gateway: http://localhost:8080 <br>
   
## Microsserviços

Service 1: [Descrição do serviço 1 e suas funcionalidades]
Service 2: [Descrição do serviço 2 e suas funcionalidades]

## API Gateway


## Orquestração com Docker Compose

O arquivo docker-compose.yml define os containers dos dois microsserviços e do API Gateway, facilitando sua execução e orquestração. Para iniciar todos os containers, execute o comando:
```
  bash
  Copiar código
  docker-compose up --build
