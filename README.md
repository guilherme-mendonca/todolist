# TodoList API

Uma API RESTful para gerenciamento de tarefas desenvolvida com **Java** e **Spring Boot**. Este projeto foi construído para aplicar conceitos de desenvolvimento backend moderno, persistência de dados e testes automatizados.


## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**: Para persistência de dados.
- **MySQL**: Banco de dados de produção.
- **H2 Database**: Banco de dados em memória para execução de testes.
- **Maven**: Gerenciador de dependências.
- **Swagger (OpenAPI)**: Documentação interativa da API.
- **JUnit 5 & WebTestClient**: Para testes de integração automatizados.

## Funcionalidades

- **Criar Tarefa**: Adiciona uma nova tarefa com nome, descrição, prioridade e status de realização.
- **Listar Tarefas**: Retorna todas as tarefas cadastradas (ordenadas por prioridade).
- **Atualizar Tarefa**: Permite editar os detalhes de uma tarefa existente.
- **Remover Tarefa**: Exclui uma tarefa através do seu ID.

## Como Executar

### Pré-requisitos
- **Java 17** ou superior instalado.
- **Maven** instalado.
- **MySQL** configurado e rodando localmente.

### Passos para rodar
1. Clone este repositório para sua máquina local.
2. Certifique-se de que as configurações de usuário e senha do banco de dados no arquivo `src/main/resources/application.properties` estão de acordo com o seu ambiente local.
3. Na raiz do projeto, execute o seguinte comando no terminal:
```
   mvn spring-boot:run
```
## Testando com o Swagger
Para facilitar o teste dos endpoints sem a necessidade de ferramentas externas (como Postman ou HTTPie), esta API utiliza o Swagger UI.

1. Com a aplicação rodando, acesse no seu navegador:
```
http://localhost:8080/swagger-ui/index.html
```
2. Na página que abrir, você verá todos os controladores e rotas disponíveis (GET, POST, PUT, DELETE).
3. Para testar uma rota:
- **Clique sobre a rota desejada.**
- **Clique no botão "Try it out".**
- **Se for um POST ou PUT, edite o corpo do JSON com os dados da tarefa.**
- **Clique em "Execute".**

4. O Swagger exibirá a resposta do servidor.
