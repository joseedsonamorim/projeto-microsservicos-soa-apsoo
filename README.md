
# Projeto: Controle de Acesso para Restaurante Universitário

Este projeto é uma simulação de controle de acesso em um restaurante universitário utilizando uma arquitetura de **microsserviços**. O sistema permite que um aluno valide sua entrada através de senha e biometria, e, após a validação, libera a catraca.

## Tecnologias Utilizadas
- **Spring Boot** (para desenvolvimento dos microsserviços)
- **Eureka Discovery Service** (para registro e descoberta de microsserviços)
- **API Gateway** (para rotear requisições)
- **H2 Database** (banco de dados em memória)
- **HTML/HTTP Server** (para as interfaces de usuário)
- **Docker** (para containerização)
- **docker-compose** (para orquestração dos containers)

## Estrutura do Projeto
O projeto é composto por três microsserviços principais:
1. **Auth-Service**: Serviço de autenticação com senha.
2. **Biometrics-Service**: Validação biométrica simulada.
3. **Turnstile-Service**: Liberação da catraca após validação.

Além disso, o projeto inclui:
- **Eureka Discovery Service**: Para registro dos microsserviços.
- **API Gateway**: Para rotear as requisições do front-end para os microsserviços.
- **HTTP Server**: Para servir as páginas HTML.

## Pré-requisitos
Antes de executar o projeto, certifique-se de ter o seguinte instalado no seu sistema:
- [JDK 11+](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Maven](https://maven.apache.org/install.html)
- [Docker](https://docs.docker.com/get-docker/)
- [docker-compose](https://docs.docker.com/compose/install/)
- [http-server](https://www.npmjs.com/package/http-server)

## Passos para Rodar o Projeto

### Passo 1: Clonar o Repositório
Primeiro, clone este repositório na sua máquina local:
```bash
git clone https://github.com/seu-usuario/projeto-microsservicos-soa-apsoo.git
cd projeto-microsservicos-soa-apsoo
```

### Passo 2: Subir os Microsserviços com Docker
O projeto está configurado para rodar utilizando **Docker** e **docker-compose**. Para iniciar todos os microsserviços e infraestrutura necessária, execute os seguintes comandos:

```bash
docker-compose up --build
```

Este comando iniciará os microsserviços de autenticação, biometria, catraca, além do Eureka Discovery Service e do API Gateway.

### Passo 3: Iniciar o Servidor Web (HTTP Server)
Para servir as interfaces HTML localmente, siga os passos abaixo:

1. Navegue até a pasta do seu projeto:
   ```bash
   cd /caminho/para/project-root
   ```
   
2. Inicie o **http-server**:
   ```bash
   http-server
   ```

Isso fará com que as páginas HTML sejam servidas no `localhost` pela porta 8080.

### Passo 4: Acessar a Aplicação
Com o servidor HTTP rodando, você pode acessar a aplicação no navegador através do seguinte endereço:

```
http://localhost:8080
```

As páginas incluem interfaces para:
- Autenticação de usuário
- Validação biométrica
- Controle de catraca

### Passo 5: Encerrar os Serviços
Para encerrar a execução dos microsserviços e do API Gateway, use o seguinte comando no terminal onde o `docker-compose` está rodando:

```bash
docker-compose down
```

## Próximos Passos
1. Conectar as interfaces front-end aos microsserviços via API Gateway.
2. Refinar as páginas HTML e melhorar o design.
3. Garantir que a orquestração dos containers com **docker-compose** esteja funcionando corretamente.

## Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests para melhorar o projeto.

---

Isso deverá ser suficiente para explicar o projeto e guiar os usuários na execução. Se precisar de ajustes, é só avisar!
