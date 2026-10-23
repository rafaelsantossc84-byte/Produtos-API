# 🛒 Produtos API

API REST desenvolvida com **Java e Spring Boot** para gerenciamento de produtos, com operações completas de **CRUD (Create, Read, Update e Delete)**.

Este projeto foi desenvolvido como meu primeiro projeto prático trabalhando com APIs REST, Spring Boot, Spring Data JPA e banco de dados, colocando em prática conceitos fundamentais do desenvolvimento backend com Java.

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- JUnit

## 📌 Funcionalidades

A API permite realizar as seguintes operações:

- ✅ Cadastrar produtos
- ✅ Listar produtos
- ✅ Buscar produto por ID
- ✅ Atualizar produtos
- ✅ Excluir produtos

## 📂 Estrutura do projeto

O projeto segue uma estrutura básica organizada em camadas:

```text
src/
└── main/
    ├── java/
    │   └── com.example.produtosapi/
    │       ├── controller/
    │       ├── model/
    │       ├── repository/
    │       └── ProdutosApiApplication.java
    │
    └── resources/
        ├── application.yml
        └── data.sql
```

### Principais componentes

**Controller**  
Responsável por receber as requisições HTTP e disponibilizar os endpoints da API.

**Model**  
Contém a entidade `Produto`, representando os dados armazenados no banco.

**Repository**  
Responsável pela comunicação com o banco de dados utilizando o Spring Data JPA.

## 🔗 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| `POST` | `/produtos` | Cadastrar um produto |
| `GET` | `/produtos` | Listar todos os produtos |
| `GET` | `/produtos/{id}` | Buscar produto por ID |
| `PUT` | `/produtos/{id}` | Atualizar um produto |
| `DELETE` | `/produtos/{id}` | Excluir um produto |

## 📝 Exemplo de produto

```json
{
  "nome": "Notebook",
  "preco": 3500.00,
  "descricao": "Notebook para uso pessoal e profissional"
}
```

## ▶️ Como executar o projeto

### Pré-requisitos

Antes de executar o projeto, tenha instalado:

- Java 17 ou superior
- Maven

### Executando

Clone o repositório:

```bash
git clone https://github.com/SEU-USUARIO/produtosApi.git
```

Entre na pasta do projeto:

```bash
cd produtosApi
```

Execute a aplicação:

```bash
mvn spring-boot:run
```

A API estará disponível localmente em:

```text
http://localhost:8080
```

## 🎯 Objetivo

O principal objetivo deste projeto foi colocar em prática conceitos fundamentais do desenvolvimento de **APIs REST com Java e Spring Boot**, incluindo criação de endpoints, operações CRUD, persistência de dados e organização básica de um projeto backend.

Este projeto representa uma das primeiras etapas da minha jornada de aprendizado no desenvolvimento backend com Java.

---

**Desenvolvido por Rafael dos Santos Costa**
