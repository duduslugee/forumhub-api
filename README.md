# ![image](https://github.com/user-attachments/assets/3bf105e2-6415-46e9-911d-22a049c86f84) ForumHub

ForumHub é uma aplicação web desenvolvida com o objetivo de fornecer um ambiente para discussão de tópicos e compartilhamento de ideias. Este README oferece uma visão geral do projeto, suas principais funcionalidades e como configurá-lo.

---

## Funcionalidades

1. **Gestão de Tópicos**
   - Criação de tópicoso.
   - Atualização de informações dos tópicos.
   - Exclusão de tópicos existentes.

2. **Controle de Usuários**
   - Autenticação e autorização com Spring Security.

3. **APIs RESTful**
   - Endpoints para criar, listar, atualizar e excluir tópicos.

4. **Persistência de Dados**
   - Utilização do banco de dados MySQL para armazenar informações de usuários e tópicos.

5. **Segurança**
   - Configurações personalizadas de segurança com Spring Security.
   - Encriptação de senhas com BCrypt.

---

## Tecnologias Utilizadas

- **Java 23**: Linguagem principal do projeto.
- **Spring Boot 3.x**: Framework para criação de aplicações.
- **Spring Security**: Gerenciamento de autenticação e autorização.
- **MySQL 8**: Banco de dados relacional para persistência de informações.
- **JPA/Hibernate**: Mapeamento objeto-relacional (ORM).
- **Lombok**: Redução de boilerplate no código Java.

---

## Requisitos

- **JDK 23** ou superior.
- **MySQL 8** ou superior.
- **Maven** para gerenciamento de dependências.

---

## Configuração do Projeto

### 1. Clonar o Repositório
```bash
git clone https://github.com/duduslugee/forumhub.git
cd forumhub
```

### 2. Configurar o Banco de Dados
- Crie um banco de dados no PostgreSQL:
  ```sql
  CREATE DATABASE forumhub;
  ```
- Atualize o arquivo `application.properties` com suas credenciais:
  ```properties
  spring.datasource.url=jdbc:postgresql://localhost:5432/forumhub
  spring.datasource.username=seu_usuario
  spring.datasource.password=sua_senha
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
  ```

### 3. Instalar Dependências
```bash
mvn clean install
```

### 4. Executar a Aplicação
```bash
mvn spring-boot:run
```

A aplicação estará disponível em: `http://localhost:8080`

---

## Endpoints Principais

### Tópicos
- **GET** `/topicos` - Listar todos os tópicos.
- **POST** `/topicos` - Criar um novo tópico.
- **PUT** `/topicos/{id}` - Atualizar um tópico existente.
- **DELETE** `/topicos/{id}` - Excluir um tópico.

### Usuários
- **POST** `/login` - Autenticação de usuários (a adição de usuários é feita diretamente no banco de dados caso queira testar ou implementar métodos para adição de usuarios, fique a vontade).


---

## Estrutura do Projeto

```
ForumHub/
├── src/main/java/
│   ├── br/duduslugee/forumhub/api/
│   │   ├── controller/      # Controllers REST
│   │   ├── domain/          # Classes de domínio
│   │   ├── repository/      # Interfaces de repositório
│   │   ├── service/         # Serviços de negócio
│   │   └── configuration/   # Configurações do Spring
├── src/main/resources/
│   ├── application.properties  # Configuração da aplicação
│   └── static/                 
├── pom.xml                # Gerenciamento de dependências
└── README.md              # Documentação do projeto
```

---

## Contribuições
Contribuições são bem-vindas! Siga os passos abaixo para contribuir:

1. Faça um fork do repositório.
2. Crie uma branch para sua feature ou correção.
3. Submeta um pull request para revisão.

---

## Autor

- **Eduardo Ramos da Silva**
  - GitHub: [duduslugee](https://github.com/duduslugee)

---

## Licença

Este projeto está licenciado sob a Licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais informações.

