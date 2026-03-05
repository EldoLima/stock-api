#  Stock API – Sistema de Gerenciamento de Estoque

## Descrição
O **Stock API** é uma API REST desenvolvida em Java com Spring Boot com o objetivo de gerenciar produtos em estoque.
O sistema permite organizar produtos por categorias e realizar operações básicas de gerenciamento.

Este projeto foi criado com foco em aprendizado e prática de boas práticas de desenvolvimento backend, como arquitetura em camadas, organização por perfis de ambiente e estruturação de uma API REST.

---

# Funcionalidades
* Cadastro de produtos;
* Organização de produtos por categoria;
* Consulta de produtos cadastrados;
* Estrutura preparada para futuras movimentações de estoque (entrada e saída)

---

#  Arquitetura do Projeto
Estrutura principal:

```
src/main/java
│
├── controller
├── service
├── repository
└── model

```
#  Tecnologias Utilizadas

* **Java**
* **Spring Boot**
* **Spring Web**
* **Spring Data JPA**
* **Hibernate**
* **Maven**
* **PostgreSQL / H2**

---


#  Como Executar o Projeto

### 1 Clonar o repositório

```bash
git clone https://github.com/EldoLima/stockcontrol.git
```

### 2 Entrar na pasta do projeto
```bash
cd stockcontrol
```

### 3 Configurar o banco de dados

No arquivo:

```
src/main/resources/application-dev.yml
```

Configure as credenciais do seu banco de dados:

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/stock_db
    username: seu_usuario
    password: sua_senha
```

---

### 4 Rodar o projeto

Você pode rodar o projeto de duas formas.

### Pela IDE (IntelliJ ou Eclipse)

Execute a classe principal:

```
StockApplication.java
```

### Pelo Maven

```bash
./mvnw spring-boot:run
```
ou
```bash
mvn spring-boot:run
```

### 5 Acessar a API
Após iniciar a aplicação, a API estará disponível em:
```
http://localhost:8080
```


Projeto desenvolvido para fins de estudo e evolução profissional.
