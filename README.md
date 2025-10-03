# API de Ponto Digital 🕒

API RESTful para um sistema de folha de ponto digital, desenvolvida em Java com o framework Spring Boot. O projeto visa fornecer um backend seguro e robusto para o registro de horas de trabalho, autenticação de usuários e futuras funcionalidades de gestão de ponto.

## ✨ Funcionalidades

  - **Cadastro de Usuários:** Endpoint público para criação de novas contas de colaboradores.
  - **Autenticação Segura:** Sistema de login com e-mail e senha que retorna um Token JWT.
  - **Endpoints Protegidos:** Rotas que só podem ser acessadas por usuários autenticados via Token JWT.
  - **Registro de Ponto:** Endpoint para que o usuário logado possa "bater o ponto".

### Próximas Implementações

  - [ ] Geração da folha de ponto mensal.
  - [ ] Cálculo de horas extras.
  - [ ] Fluxo de assinatura eletrônica (colaborador e supervisor).
  - [ ] Exportação de relatórios em PDF.
  - [ ] Gestão de jornadas de trabalho e feriados.

## 🛠️ Tecnologias Utilizadas

  - **Backend:**
      - [Java 17+](https://www.oracle.com/java/)
      - [Spring Boot 3+](https://spring.io/projects/spring-boot)
      - [Spring Security](https://spring.io/projects/spring-security)
      - [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
  - **Banco de Dados:**
      - [H2 Database](https://www.h2database.com/html/main.html) (Ambiente de Desenvolvimento)
      - Pronto para uso com [PostgreSQL](https://www.postgresql.org/) ou [MySQL](https://www.mysql.com/)
  - **Autenticação:**
      - [JSON Web Tokens (JWT)](https://jwt.io/)
  - **Build & Dependências:**
      - [Apache Maven](https://maven.apache.org/)
  - **Utilitários:**
      - [Lombok](https://projectlombok.org/)

## 🚀 Como Executar o Projeto

### Pré-requisitos

  - Java 17 ou superior
  - Maven 3.8 ou superior

### Passos

1.  **Clone o repositório:**

    ```bash
    git clone git@github.com:Moises-Ribeiro-Santos/digital.git
    ```

2.  **Navegue até o diretório do projeto:**

    ```bash
    cd digital
    ```

3.  **Execute a aplicação com o Maven:**

    ```bash
    mvn spring-boot:run
    ```

4.  A API estará disponível em `http://localhost:8080`.

## Endpoints da API

### Autenticação

#### `POST /api/usuarios`

Cria um novo usuário no sistema.

  - **Acesso:** Público
  - **Body (Exemplo):**
    ```json
    {
        "nome": "Fulano de Tal",
        "email": "fulano@email.com",
        "senha": "123456",
        "perfil": "PROFESSOR"
    }
    ```

#### `POST /login`

Autentica um usuário e retorna um token JWT.

  - **Acesso:** Público
  - **Body (Exemplo):**
    ```json
    {
        "email": "fulano@email.com",
        "senha": "123456"
    }
    ```
  - **Resposta de Sucesso (Exemplo):**
    ```json
    {
        "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
    }
    ```

### Ponto

#### `POST /ponto/registrar`

Registra uma nova "batida" de ponto para o usuário autenticado.

  - **Acesso:** Privado (Requer autenticação)
  - **Header:**
    ```
    Authorization: Bearer <seu_token_jwt>
    ```
  - **Resposta de Sucesso (Exemplo):**
    ```json
    {
        "id": 1,
        "usuario": { /* dados do usuário */ },
        "dataHora": "2025-10-01T14:30:00.123456"
    }
    ```
