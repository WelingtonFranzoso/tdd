# TDD Application

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/tdd/blob/main/LICENSE) 


# Sobre o projeto

Este é um projeto simples Java Spring Boot que faz cadastro de cursos segue princípios de Desenvolvimento Orientado a Testes (TDD). O objetivo principal é demonstrar boas práticas no desenvolvimento de um projeto começando com os testes unitários
# Funcionalidades

- Cadastro de cursos com nome, descrição e carga horária.

- Testes automatizados para garantir qualidade do código.

# Tecnologias utilizadas

- Java 17+

- Spring Boot

- Maven

- Spring Data JPA

- H2 Database (ou outro banco de dados configurado)

- JUnit e Mockito (para testes)

# Estrutura do Projeto
```
TDD Application
├── src/main/java/com/franzoso/
│   ├── TddApplication.java     # Classe principal do Spring Boot
│   ├── controllers/            # Controllers da API REST
│   ├── entities/               # Entidades do banco de dados
│   ├── repositories/           # Interfaces e implementações de repositórios
│   ├── services/               # Serviços de negócio
│   ├── dtos/                   # Data Transfer Objects (se houver)
│
├── src/main/resources/
│   ├── application.properties  # Configuração do Spring Boot
│
├── src/test/java/com/franzoso/ # Testes unitários e de integração
├── pom.xml                     # Configuração do Maven
```

# Como executar o projeto
## Back end
### Pré-requisitos: 
- Java 17 ou superior
- Maven (para construção do projeto)

```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/tdd.git

# entrar na pasta do projeto back end
cd tdd

# executar o projeto
./mvnw spring-boot:run
```

## Executando Testes

### O projeto usa JUnit e Mockito para testes.

```bash
# executar os tests
mvn test
```

# Endpoints Disponíveis

| Método | Endpoint      | Descrição              |
|:------:|:-------------:|:----------------------:|
| POST   | /courses      | Cria um novo curso     |


# Contribuição

1. Fork este repositório

2. Crie uma branch (feature-nova)

3. Commit suas mudanças (git commit -m 'Add nova feature')

4. Push para sua branch (git push origin feature-nova)

5. Crie um Pull Request

# Licença

- Este projeto está sob a licença MIT. Sinta-se livre para usá-lo e modificá-lo.
