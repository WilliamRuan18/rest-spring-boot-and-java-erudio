# 🚀 REST API com Spring Boot, Java e MySQL

<p align="center">
  <img src="https://img.shields.io/badge/Java-21%2B-orange?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Maven-Build-red?style=for-the-badge&logo=apachemaven&logoColor=white" />
  <img src="https://img.shields.io/badge/Postman-API%20Testing-orange?style=for-the-badge&logo=postman&logoColor=white" />
</p>

## 📌 Sobre o Projeto
API RESTful desenvolvida durante os estudos práticos de arquitetura e desenvolvimento backend com **Java** e **Spring Boot**. O projeto aplica as melhores práticas de mercado para a construção de serviços web robustos, utilizando persistência de dados com **Spring Data JPA** e **MySQL**.

---

## 🛠️ Tecnologias e Ferramentas Utilizadas
* **Java 21+**
* **Spring Boot** (Spring Web, Spring Data JPA)
* **MySQL** & **MySQL Workbench**
* **Maven** (Gestão de dependências)
* **Postman** (Testes de endpoints)
* **Git & GitHub** (Controlo de versões)

---

## 🏗️ Arquitetura do Projeto

O projeto segue o padrão de arquitetura em camadas (Layered Architecture) para garantir uma separação limpa de responsabilidades e fácil manutenção:

```text
src/main/java/br/com/william/
├── config/              # Configurações globais (CORS, Web, etc.)
├── controllers/         # Camada REST (Endpoints/Handlers da API)
├── exceptions/          # Tratamento e manipulação global de exceções
├── model/               # Entidades JPA (Mapeamento da Base de Dados)
├── repositories/        # Interfaces Spring Data JPA para acesso a dados
├── services/            # Regras de negócio da aplicação
└── Startup.java         # Ponto de entrada da aplicação Spring Boot
