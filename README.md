# TDD Application

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 


# Sobre o projeto

Este é um projeto Java Spring Boot que segue princípios de Desenvolvimento Orientado a Testes (TDD). O sistema é focado no gerenciamento de cursos.

# Funcionalidades

- Cadastro de cursos com nome, descrição e carga horária.

- Listagem de todos os cursos cadastrados.

- Busca de curso por ID.

- Atualização de informações de um curso.

- Remoção de cursos.

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
- Docker

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
| GET    | /courses      | Lista todos os cursos  |
| POST   | /courses      | Cria um novo curso     |
| GET    | /courses/{id} | Busca um curso pelo ID |
| PUT    | /courses/{id} | Atualiza um curso      |
| DELETE | /courses/{id} | Remove um curso        |


# Contribuição

1. Fork este repositório

2. Crie uma branch (feature-nova)

3. Commit suas mudanças (git commit -m 'Add nova feature')

4. Push para sua branch (git push origin feature-nova)

5. Crie um Pull Request

# Licença

- Este projeto está sob a licença MIT. Sinta-se livre para usá-lo e modificá-lo.
