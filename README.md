# README do Projeto CRUD de Usuários em Java

Este projeto consiste em uma API RESTful desenvolvida em Spring Boot para realizar operações CRUD (Create, Read, Update, Delete) em usuários. O projeto utiliza o banco de dados H2 para armazenamento dos dados.

## Endpoints no Postman

Antes da integração com o frontend, os endpoints podem ser testados utilizando o software Postman. Abaixo estão os endpoints disponíveis:

- **POST /users/create:** Cria um novo usuário. O corpo da requisição deve conter os dados do usuário a ser criado.
- **GET /users/{id}:** Retorna os detalhes de um usuário específico com base no ID fornecido na URL.
- **GET /users:** Retorna uma lista de todos os usuários cadastrados.
- **DELETE /users/{id}:** Exclui um usuário com base no ID fornecido na URL.
- **PUT /users/{id}:** Atualiza as informações de um usuário com base no ID fornecido na URL. O corpo da requisição deve conter os novos dados do usuário.

## Configuração de CORS

A configuração de CORS (Cross-Origin Resource Sharing) permite que a API seja acessada por diferentes origens. No projeto, o CORS está configurado para permitir acesso de qualquer origem.

## Lógica de Negócio

A lógica de negócio implementada na API inclui as seguintes funcionalidades:

- **Cadastro de Usuário:** A rota /users/create permite o cadastro de novos usuários no sistema.
- **Deletar Usuário:** A rota /users/{id} permite a exclusão de um usuário existente com base no ID fornecido.
- **Atualizar Usuário:** A rota /users/{id} permite a atualização das informações de um usuário existente com base no ID fornecido.
- **Visualização de Usuários:** A rota /users retorna uma lista com todos os usuários cadastrados no sistema.

## Frontend em React

Para integrar com a API desenvolvida em Spring Boot, foi utilizado o framework React no frontend. Essa integração permite que os dados dos usuários sejam visualizados, criados, atualizados e excluídos por meio de uma interface de usuário amigável.

## Iniciando e Utilizando a Aplicação Spring

Para iniciar a aplicação Spring, siga os passos abaixo:

1. Certifique-se de ter o Java JDK instalado em seu sistema.
2. Clone o repositório do projeto em sua máquina local.
3. Abra o projeto em sua IDE preferida (por exemplo, IntelliJ IDEA, Eclipse).
4. Certifique-se de ter todas as dependências do projeto instaladas (geralmente, as IDEs fazem isso automaticamente).
5. Navegue até a classe UserJavaCrudApplication localizada em src/main/java/com/crudJavaUser/userJavaCrud.
6. Execute a aplicação clicando com o botão direito do mouse na classe UserJavaCrudApplication e selecionando a opção "Run" (Executar).

Após iniciar a aplicação Spring, você poderá acessar os endpoints mencionados anteriormente e testá-los usando o Postman ou integrá-los com o frontend desenvolvido em React.
