# Spring Boot Products API

REST API para gerenciamento de produtos desenvolvida com Spring Boot, Spring Data JPA e HATEOAS.

## Tecnologias
* **Java 21**
* **Spring Boot 4.0.7**
* **Spring Data JPA**
* **Spring HATEOAS**
* **PostgreSQL**
* **Maven**

## Estrutura do Projeto
```text
src/main/java/com/project/spring_boot_project/
├── controllers/
│   └── ProductController.java
├── dtos/
│   └── ProductRecordDto.java
├── models/
│   └── ProductModel.java
└── repositories/
    └── ProductRepository.java
```

## Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/products` | Lista todos os produtos (com links HATEOAS) |
| **GET** | `/products/{id}` | Busca um produto específico por ID |
| **POST** | `/products` | Cadastra um novo produto |
| **PUT** | `/products/{id}` | Atualiza os dados de um produto |
| **DELETE** | `/products/{id}` | Remove um produto do sistema |

## Como Executar

### Pré-requisitos
* Java 21 instalado
* PostgreSQL rodando localmente
* Maven configurado

### Configuração do Banco de Dados
Crie um banco de dados no seu PostgreSQL e configure as suas credenciais locais no arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

### Rodando a Aplicação
Abra o seu terminal e execute os comandos abaixo:

```bash
git clone [https://github.com/diegosidarta/spring-boot-project](https://github.com/diegosidarta/spring-boot-project)
cd spring-boot-project
mvn spring-boot:run
```
A API estará disponível e pronta para receber requisições em: `http://localhost:8080`

## Aprendizados Consolidados

Projeto desenvolvido para praticar e dominar os fundamentos do ecossistema Spring:

* **Arquitetura Clean:** Divisão clara de responsabilidades entre rotas (Controllers) e acesso aos dados (Repositories).
* **Mapeamento O/R:** Uso do Hibernate/JPA para gerenciar a persistência no PostgreSQL sem escrever SQL manual.
* **Imutabilidade com DTOs:** Uso de Java Records para validação segura de payloads com Bean Validation.
* **Hypermedia (HATEOAS):** Implementação do Nível 3 de Maturidade REST, tornando a API autonavegável.
